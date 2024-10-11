package fr.ldnr.thread;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThreadTime {

	// Exercice 2.3
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("HH:mm:ss");
		Thread thread = new Thread(new MonRunnable(1000, df));
		
		//System.out.println(df.format(new Date()));
		thread.start();

	}
	private static class MonRunnable implements Runnable{
		
		private long delai;
		private SimpleDateFormat dt; 
		
		public MonRunnable(long delai, SimpleDateFormat date) {
			this.delai = delai;
			this.dt = date;
		}
		
		@Override
		public void run() {
			while(true) {
				try {
					Thread.sleep(delai);
					//System.out.println("-");
					System.out.println(dt.format(new Date()));
					
				}catch(InterruptedException e ) {
					e.printStackTrace();
				}
			}
		}
	}
}
