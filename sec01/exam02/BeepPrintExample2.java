package sec01.exam02;

public class BeepPrintExample2 {
	public static void main(String[] args) {
		Runnable beepTask = new BeepTask();
		Thread thread = new Thread(beepTask);
		thread.start();	//작업스레드인 BeepTask의 run()메소드 실행
		
		for(int i=0; i<5; i++) {	//메인스레드 동시에 실행
			System.out.println("띵");
			try { Thread.sleep(500); }
			catch(Exception e) {}
		}
	}
}