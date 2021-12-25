package TimeEvent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.management.timer.Timer;

public class TimeEvent {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		javax.swing.Timer t1 = new javax.swing.Timer(2000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("¹¹¾ß");
			}
		});
		t1.start();
		Thread.sleep(10000);
		t1.stop();
	}

}
