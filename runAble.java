package Nisikant;
import java.lang.*;
class Hi2 implements Runnable {
	public void run() {
		for (int i=0; i<100; i++) {
			System.out.println(i);
			try{Thread.sleep(500);}catch(Exception e) {}	
		}
	}}



class Hello2 implements Runnable{
	public void run() {
		for(int i=0; i<100;i++) {
			System.out.println(i);
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}}


public class runAble {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hi2 obj = new Hi2();
		Hello2 obj1 = new Hello2();
		
		Thread t1 = new Thread(obj);
		Thread t2 = new Thread(obj1);
		t1.start();
		try{Thread.sleep(10);}catch(Exception e) {}
t2.start();
	}

}
