package fr.ldnr.thread;

public class TestThread extends Thread{

		public TestThread(String name) {
			super(name);
		}
		public void run() {
			for(int i =0; i < 5; i++) {
				System.out.println(this.getName());
			}
		}
		
		public static void main(String[] args) {
			TestThread t = new TestThread("1-");
			TestThread t2 = new TestThread("2--");
			TestThread t3 = new TestThread("3---");
			TestThread t4 = new TestThread("4----");
			TestThread t5 = new TestThread("5-----");
			// avec la fonction start() l'exécution des object est désordonner.
			t.start();
			t2.start();
			t3.start();
			t4.start();
			t5.start();
			System.out.println("Fin du game");
	
		}

}
