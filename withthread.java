package Nisikant;

class Hi1 extends Thread {
	public void run() {
		for (int i=0; i<5; i++) {
			System.out.println("Hi");
			try{Thread.sleep(500);}catch(Exception e) {}	
		}
	}}


class Hello1 extends Thread{
	public void run() {
		for(int i=0; i<5;i++) {
			System.out.println("Hello");
			try{Thread.sleep(500);}catch(Exception e) {}
		}
	}}


public class withthread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Hi1 obj = new Hi1();
		Hello1 obj1 = new Hello1();
		obj.start();
		try{Thread.sleep(10);}catch(Exception e) {}
		obj1.start();
		
	}

}
