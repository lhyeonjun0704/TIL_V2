package RunnableMainclass;

class RunnableClass1 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			Thread.currentThread().setName("hi");
			System.out.println(Thread.currentThread().getName() + "스레드 실행1");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
}

class RunnableClass2 implements Runnable{
	public void run() {
		for(int i = 0; i < 10; i++) {
			System.out.println("스레드 실행2");
		}
	}
}

public class RunnableMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 이클래스명은 변경 가능(단, implements Runnable이 있는 클래스)
		// RunnableClass를 Thread 클래스로 만든다.
		// Thread th1 = new Thread(rc1);
		
		Thread th1 = new Thread(new RunnableClass1());
		Thread th2 = new Thread(new RunnableClass2());
		th1.start();
		th2.start();
	}

}
