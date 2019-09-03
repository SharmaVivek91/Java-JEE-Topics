class Th extends Thread{
	public void run() {
		System.out.println("thread running via extending therad class");
		for(int i=0; i<10; i++ ) {
			try {
				System.out.println(i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
class Thr implements Runnable{
	public void run() {
		System.out.println("Thraed Running via implmenting runnable interface");
		for(int i=10; i<20; i++ ) {
			try {
				System.out.println(i);
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
public class ThreadPr {
	
	public static void main(String args[]) {
		Th t1 = new Th();
		t1.start();
		try {
			t1.join();   // waits for t1 completion befor startoing t2
		} catch (InterruptedException e) {
			e.printStackTrace();
		} 
		Thr th2 = new Thr();
		Thread t2 = new Thread(th2); 
		t2.start();
	}

}
