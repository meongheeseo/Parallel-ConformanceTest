package ca.mcgill.ecse429.conformancetest.ccoinbox;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;

import ca.mcgill.ecse429.conformancetest.statemodel.State;
import ca.mcgill.ecse429.conformancetest.statemodel.StateMachine;
import ca.mcgill.ecse429.conformancetest.statemodel.Transition;
import ca.mcgill.ecse429.conformancetest.statemodel.persistence.PersistenceStateMachine;

public class RoundTripPath {
	static ArrayList<ArrayList<Node>> allPaths = new ArrayList<ArrayList<Node>>();
	// static String StateMachineXML = "ccoinbox.xml";
	// static String StateMachineXML = "legislation.xml";
	static String StateMachineXML = "booking.xml";

	public static class Node {
		private State state;
		private Transition prevTrans;
		private ArrayList<Node> children;
		public int count;

		public Node(State state, Transition prevTrans, ArrayList<Node> children) {
			this.state = state;
			this.prevTrans = prevTrans;
			this.children = new ArrayList<Node>();

		}

		public void addChild(Node newNode) {
			children.add(newNode);
		}

		public State getState() {
			return this.state;
		}
	}

	public static void getAllPaths(Node root, ArrayList<Node> currentPath, ArrayList<ArrayList<Node>> allPaths) {

		if (root == null) {
			return;
		}

		if (root.children.isEmpty()) {
			currentPath.add(root);
			allPaths.add(currentPath);
		} else {
			for (Node s : root.children) {
				ArrayList<Node> newPath = copyPath(currentPath);
				newPath.add(root);

				getAllPaths(s, newPath, allPaths);
			}
		}

	}

	public static ArrayList<Node> copyPath(ArrayList<Node> path) {
		ArrayList<Node> newPath = new ArrayList<Node>();
		for (Node s : path) {
			newPath.add(s);
		}
		return newPath;
	}

	public static ArrayList<ArrayList<Node>> copyPaths(ArrayList<ArrayList<Node>> path, int start, int end) {
		ArrayList<ArrayList<Node>> newPaths = new ArrayList<ArrayList<Node>>();

		for (int i = start; i < end; i++) {
			newPaths.add(path.get(i));
		}
		return newPaths;
	}

	public static String generateTestFunctions(ArrayList<ArrayList<Node>> path) {

		System.out.println("=========== START generateTestFunctions Automatically ============== ");
		Integer allPathsLength = path.size();
		String outputString = "";
		String addNewLine = "\n";

		PersistenceStateMachine.loadStateMachine(StateMachineXML);
		StateMachine sm = StateMachine.getInstance();
		String CCoinBoxString = sm.getClassName().substring(0, sm.getClassName().length() - 5);
		System.out.println("TESTINGASDF : " + sm);
		for (int i = 0; i < allPathsLength; i++) {
			outputString += "@Test" + addNewLine;
			outputString += "public void conformanceTest" + i + "() {" + addNewLine + CCoinBoxString + " ccb = new "
					+ CCoinBoxString + "();" + addNewLine + "StateMachine sm;" + addNewLine
					+ "sm = StateMachine.getInstance();" + addNewLine;

			for (int j = 1; j < path.get(i).size(); j++) {

				outputString += "System.out.println(\"==================== conformanceTest" + i + "." + j
						+ " ========================= + || \" + className +\" \");" + addNewLine;

				if (j != 1) {
					outputString += "ccb." + path.get(i).get(j).prevTrans.getEvent() + "();" + addNewLine;
				}

				outputString += "assertTrue(ccb.getStateFullName()," + "" + "ccb.getStateFullName().equals(\""
						+ path.get(i).get(j).state.getName() + "\")" + ");" + addNewLine;

				outputString += "";

			}
			if (i != allPathsLength) {
				outputString += "}" + addNewLine;
			}
		}

		return outputString;
	}

	public static void generateRoundTripPathFile(String outputString, int id) throws IOException {
		String addNewLine = "\n";

		PersistenceStateMachine.loadStateMachine(StateMachineXML);
		StateMachine sm = StateMachine.getInstance();

		String CCoinBoxString = sm.getClassName().substring(0, sm.getClassName().length() - 5);

		File outputTestFile = new File(
				"src/ca/mcgill/ecse429/conformancetest/ccoinbox/GeneratedTest" + CCoinBoxString + id + ".java");
		FileWriter outputTestFileWriter = new FileWriter(outputTestFile);

		outputTestFile.createNewFile(); // creates a new testCCoinBox file

		/* WRITE PACKAGE AND IMPORTS */
		outputTestFileWriter.write("" + "package ca.mcgill.ecse429.conformancetest.ccoinbox;" + addNewLine

		+ "import static org.junit.Assert.*;" + addNewLine

		+ "import org.junit.After;" + addNewLine + "import org.junit.AfterClass;" + addNewLine
				+ "import org.junit.Before;" + addNewLine + "import org.junit.BeforeClass;" + addNewLine
				+ "import org.junit.Test;" + addNewLine
				+ "import ca.mcgill.ecse429.conformancetest.legislation.Legislation;" + addNewLine
				+ "import ca.mcgill.ecse429.conformancetest.statemodel.StateMachine;" + addNewLine
				+ "import ca.mcgill.ecse429.conformancetest.statemodel.persistence.PersistenceStateMachine;"
				+ addNewLine

		+ "" + "");

		/* WRITE FILE CLASS */
		outputTestFileWriter.write("" + "public class " + "GeneratedTest" + CCoinBoxString + id + " {" + addNewLine
				+ addNewLine + "String className = this.getClass().getSimpleName();" + addNewLine
				/* TESTS PART */
				+ "@BeforeClass" + addNewLine + "public static void setUpBeforeClass() throws Exception {" + addNewLine
				+ "}" + addNewLine

		+ "@AfterClass" + addNewLine + "public static void tearDownAfterClass() throws Exception {" + addNewLine + "}"
				+ addNewLine

		+ "@Before" + addNewLine + "public void setUp() throws Exception {" + addNewLine
				+ "		PersistenceStateMachine.loadStateMachine(\"" + StateMachineXML + "\");" + addNewLine
				+ "StateMachine sm;" + addNewLine + "}" + addNewLine

		+ "@After" + addNewLine + "public void tearDown() throws Exception {" + addNewLine
				+ "	StateMachine.getInstance().delete();" + addNewLine + "}" + addNewLine

		// outputString is the string that generates all the @Test methods
				+ outputString + addNewLine

		+ ""

		+ "	}" + addNewLine);

		outputTestFileWriter.flush();
		outputTestFileWriter.close();
	}

	public static void main(String[] agrs) throws IOException, InterruptedException {
		PersistenceStateMachine.loadStateMachine(StateMachineXML);
		HashMap<String, Node> map = new HashMap<String, Node>();
		StateMachine sm = StateMachine.getInstance();
		ArrayList<Node> fullTree = new ArrayList<Node>();
		State currentState = sm.getStartState();
		Node rootNode = new Node(currentState, null, null);

		String stateMachineString = sm.getClassName().substring(0, sm.getClassName().length() - 5);

		LinkedList<Transition> transitions = new LinkedList<Transition>();
		for (int i = 0; i < sm.getTransitions().size(); i++) {
			transitions.add(sm.getTransition(i));
		}

		Node previousNode = rootNode;

		fullTree.add(0, rootNode);
		map.put(rootNode.state.getName(), rootNode);

		while (transitions.isEmpty() == false) {
			Transition currentTransition = transitions.poll();
			currentState = currentTransition.getFrom();
			previousNode = map.get(currentState.getName());

			Node nextNode = new Node(currentTransition.getTo(), currentTransition, null);
			if (!map.containsKey(currentTransition.getTo().getName())) {
				map.put(currentTransition.getTo().getName(), nextNode);
			}

			previousNode.addChild(nextNode);

			fullTree.add(nextNode);

		}

		getAllPaths(rootNode, new ArrayList<Node>(), allPaths);

		// Prints all paths with states
		for (int i = 0; i < allPaths.size(); i++) {
			System.out.println();
			for (int j = 0; j < allPaths.get(i).size(); j++) {
				System.out.print(allPaths.get(i).get(j).state.getName() + ", ");
			}
		}

		System.out.println("");

		Thread t;
		int threadnum = 1;
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < threadnum; i++) {
			if (threadnum == i + 1) {
				t = new Thread(new ThreadTestGenerator(i,
						copyPaths(allPaths, (allPaths.size() / threadnum) * i, allPaths.size()), stateMachineString,
						startTime));

				t.start();

			} else {
				t = new Thread(new ThreadTestGenerator(i,
						copyPaths(allPaths, (allPaths.size() / threadnum) * i, (allPaths.size() / threadnum) * (i + 1)),
						stateMachineString, startTime));
				t.start();
			}
		}

	}

}
