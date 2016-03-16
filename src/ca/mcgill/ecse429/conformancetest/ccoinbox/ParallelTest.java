package ca.mcgill.ecse429.conformancetest.ccoinbox;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.JUnitCore;
import org.junit.runners.Parameterized;

public class ParallelTest extends Parameterized {

	 // public static void main(){
	 //
	 // }
	
	 public ParallelTest(Class<?> klass) throws Throwable {
	 super(klass);
	 // TODO Auto-generated constructor stub
	 }
	
//	 @Test
//	 public void test() {
//	
//	 Class[] cls = { GeneratedTestCCoinBox.class };
//	
//	 JUnitCore.runClasses(ParallelComputer.classes(), cls);
//	 JUnitCore.runClasses(ParallelComputer.methods(), cls);
//	 JUnitCore.runClasses(new ParallelComputer(true, true), cls);
//	
//	 }


}
