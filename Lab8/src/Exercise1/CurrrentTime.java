package Exercise1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrrentTime extends Thread {

	public void printTime (String GetThread) {
		
		for (int counter = 0; counter < 10; counter++) {
			
			DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");  
			LocalDateTime now = LocalDateTime.now(); 
						
			System.out.println(GetThread + "->" + dtf.format(now));
		}
	
	}

	public void run() {
		
		Thread GetThread = Thread.currentThread();
		printTime( GetThread.getName());

	}
}