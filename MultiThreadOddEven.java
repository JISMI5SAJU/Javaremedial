package Hello;
import java.util.Random;
class NumberManager{
	private int generateNumber;
	private boolean NumberGenerator=false;
	public synchronized void generateNumber() {
		 generateNumber=new Random().nextInt(99)+2;
		 System.out.println("Generated RandomNumber:"+ generateNumber);
		 NumberGenerator=true;
		 notifyAll();
		 
	}
	public synchronized void printevenNumber() throws InterruptedException {
		while(!NumberGenerator|| generateNumber%2!=0) {
			wait();
		}
		for(int i=2;i< generateNumber;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		NumberGenerator=false;
		
	}
	public synchronized void printOddNumber() throws InterruptedException {
		while(!NumberGenerator|| generateNumber%2==0) {
			wait();
		}
		for(int i=1;i< generateNumber;i+=2) {
			System.out.print(i+" ");
		}
		System.out.println();
		NumberGenerator=false;
	}
}
class Numbergenerator extends Thread{
	NumberManager numberManager;
	public  Numbergenerator(NumberManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		while(true) {
			numberManager.generateNumber();
	
		try {
			Thread.sleep(1000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
}
class EvenPrintThread extends Thread{
	NumberManager numberManager;
	public EvenPrintThread(NumberManager numberManager) {
		this.numberManager=numberManager;
	}
	public void run() {
		while(true) {
			try {
			numberManager.printevenNumber();
			
		}catch(InterruptedException e) {
		   e.printStackTrace();
		}
}
}
}
	class OddPrintThread extends Thread{
		NumberManager numberManager;
		public OddPrintThread(NumberManager numberManager) {
			this.numberManager=numberManager;
		}
		public void run() {
			while(true) {
				try {
				numberManager.printOddNumber();
				
			}catch(InterruptedException e) {
			   e.printStackTrace();
			}
	}
	}
	}
public class MultiThreadOddEven {

	public static void main(String[] args) {
		NumberManager numberManager=new 	NumberManager();
		 Numbergenerator numbergenerator=new  Numbergenerator(numberManager);
		 EvenPrintThread evenprintThread=new  EvenPrintThread ( numberManager);
		 OddPrintThread oddprintThread=new  OddPrintThread ( numberManager);
		 numbergenerator.start();
		 evenprintThread.start();
		 oddprintThread.start();
		 
		 
		 
		 
		
	}

}
