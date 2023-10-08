package by.itacademy.java.lesson27b;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Minus10 extends Thread {

	int y;

	public Minus10(int y) {
		this.y = y;
	}

	public  synchronized void run() {

		int x = y - 10;

		try (BufferedWriter bufWriter = new BufferedWriter(new FileWriter("resources/27hw.txt", true))) {
			bufWriter.write(x + "\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(y);
		System.out.println(x);
		System.out.println("Minus10end" + "\n");

	}
}
