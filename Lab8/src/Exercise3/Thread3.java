package Exercise3;

public class Thread3 {
	
public static void main(String[] args) {
		
		Runnable TextRun = new TextRun();
		
		Thread word1 = new Thread(TextRun);
		word1.setName("Word 1");
		
		Thread word2 = new Thread(TextRun);
		word2.setName("Word 2");
		
		Thread word3 = new Thread(TextRun);
		word3.setName("Word 3");
		
//		Thread statementThread = new StatementPrinter();
//		statementThread.setName("statementThread");
		
		// Execute thread
		word1.start();
		word2.start();
		word3.start();
	}	
}
