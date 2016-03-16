package ca.mcgill.ecse429.conformancetest.ccoinbox;

import java.io.IOException;
import java.util.ArrayList;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import ca.mcgill.ecse429.conformancetest.ccoinbox.RoundTripPath.*;

public class ThreadTestGenerator implements Runnable {

	private ArrayList<ArrayList<Node>> parameter;
	private int id;
	private String stateMachine;
	private long startTime;

	public ThreadTestGenerator(int id, ArrayList<ArrayList<Node>> parameter, String stateMachine, long startTime) {
		this.stateMachine = stateMachine;
		this.id = id;
		this.parameter = parameter;
		this.startTime = startTime;
	}

	public void run() {

		try {
			RoundTripPath.generateRoundTripPathFile(RoundTripPath.generateTestFunctions(parameter), id);

			Class cls = Class.forName("ca.mcgill.ecse429.conformancetest.ccoinbox.GeneratedTest" + stateMachine + id);
			JUnitCore junit = new JUnitCore();
			Result result = junit.run(cls);
			System.out.println("result.getFailures = " + result.getFailures());
			System.out.println("CCoinBox test file id = " + id);
			long endTime = System.currentTimeMillis();
			long duration = endTime - startTime;
			System.out.println("Execution Time: " + duration);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
