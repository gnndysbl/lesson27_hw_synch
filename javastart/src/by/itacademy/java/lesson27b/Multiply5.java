package by.itacademy.java.lesson27b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Multiply5 implements Runnable {

	int y;

	public Multiply5(int y) {
		this.y = y;
	}

	public  void run() {

		int x = y * 5;

		try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("resources/27hw.txt", true))) {
			bufWriter.write(x + "\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(y);
		System.out.println(x);
		System.out.println("multiply5end"+ "\n");
	}

}
