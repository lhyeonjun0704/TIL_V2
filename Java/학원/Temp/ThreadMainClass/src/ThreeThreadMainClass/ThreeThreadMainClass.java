package ThreeThreadMainClass;


class ThreeThreadClass1 extends Thread{
	String kwail;
	public ThreeThreadClass1(String kwail) {
		this.kwail = kwail;
	}
	
	public void run() {
		for(int i = 1; i < 3; i++) {
			System.out.println(kwail);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreeThreadClass2 extends Thread{
	String kwail;
	public ThreeThreadClass2(String kwail) {
		this.kwail = kwail;
	}
	
	public void run() {
		for(int i = 1; i < 3; i++) {
			System.out.println(kwail);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class ThreeThreadClass3 extends Thread{
	String kwail;
	public ThreeThreadClass3(String kwail) {
		this.kwail = kwail;
	}
	
	public void run() {
		for(int i = 1; i < 3; i++) {
			System.out.println(kwail);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class ThreeThreadMainClass {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreeThreadClass1 ttc1 = new ThreeThreadClass1("사과");
		ThreeThreadClass2 ttc2 = new ThreeThreadClass2("배");
		ThreeThreadClass3 ttc3 = new ThreeThreadClass3("감");
		
		// 우선순위: priority // 자바스레드 : 1-10 범위
		ttc1.setPriority(ttc1.MIN_PRIORITY);
		ttc2.setPriority(ttc2.NORM_PRIORITY);
		ttc3.setPriority(ttc3.MAX_PRIORITY);
		
		System.out.println(ttc1.getPriority() + "\t" + ttc2.getPriority() + "\t" + ttc3.getPriority());
		
		ttc1.start();
		ttc2.start();
		ttc3.start();
	}

}
