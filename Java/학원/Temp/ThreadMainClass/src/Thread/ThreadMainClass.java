package Thread;

class ThreadClass extends Thread {
	public void run() {
//		Thread.currentThread().setName("쓰레드1");
		System.out.println(getName() + "쓰레드2");
	}
}

class ThreadClass1 extends Thread{
	public void run() {
		/*
		 * System.out.println(getName() + "me");
		 * System.out.println("All you need is love");
		 */
		for(int i = 0; i < 10; i++) {
			System.out.println(getName() + "shoot");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

class ThreadClass2 extends Thread{
	public void run() {
//		System.out.println(getName() + "you");
//		System.out.println("love is all you need");
		for(int i = 0; i< 10; i++) {
			System.out.println(getName() + "shoot2 ");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class ThreadMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadClass1 tc1 = new ThreadClass1();
		ThreadClass2 tc2 = new ThreadClass2();
		tc1.start();
		tc2.start();
		System.out.println("쓰레드 호출 시작");
	}

}
