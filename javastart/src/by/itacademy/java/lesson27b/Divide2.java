package by.itacademy.java.lesson27b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Divide2 extends Thread {

	double y;

	public Divide2(double y) {
		this.y = y;
	}

	public synchronized void run() {

		double x = y / 2;

		try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("resources/27hw.txt", true))) {
			bufWriter.write(x + "\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(y);
		System.out.println(x);
		System.out.println("divide2end" + "\n");

	}
}
