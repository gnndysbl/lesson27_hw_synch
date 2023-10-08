package by.itacademy.java.lesson27b;

import java.io.IOException;
import java.io.PrintWriter;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		
		try {
			PrintWriter pw = new PrintWriter("resources/27hw.txt");
			pw.close();
		} catch (IOException e) {
			e.printStackTrace();}
		
		Thread m5 = new Thread(new Multiply5(20));
		Plus10 p10 = new Plus10(15);
		Divide2 d2 = new Divide2(22);
		Minus10 m10 = new Minus10(15);
		Squared s = new Squared(25);
		Sum sum = new Sum();

		synchronized(m5) {
			m5.start();
		}
		//		m5.join();

		p10.start();
		//		p10.join();
		
		d2.start();
		//		d2.join();
		
		m10.start();
		//		m10.join();
		
		s.start();
		//		s.join();
		
		sum.run();
		//sum.join();
		
		System.out.println(sum.getSum());

	}
}
