package fr.ldnr.thread;

public class TestRunnable implements Runnable{
	//Exercice 2.2
	@Override
	public void run() {
		String test = "!*!"+"**"+"#***#"+"$****$"+"%*****%"+"&******&"+"'********'"+ "(*******("+")********)" + "********";
		for(int i = 0; i< 1; i++) {
			System.out.print(test);
		}
	}

	public static void main(String[] args) {
		
		Thread thread = new Thread(new TestRunnable());
		thread.start();

	}

}
