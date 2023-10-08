package by.itacademy.java.lesson27b;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

public class Sum extends Thread {

	double sum = 0;

	public double getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void run() {

		InputStreamReader reader = null;
		try {
			reader = new InputStreamReader(new FileInputStream("resources/27hw.txt"), "UTF-8");
		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader breader = new BufferedReader(reader);
		String line = null;

		List<String> listNote = new ArrayList<>();

		try {
			while ((line = breader.readLine()) != null) {
				listNote.add(line);
			}
			reader.close();
		} catch (IOException e) {
		}

		for (String element : listNote) {
			Double value = Double.valueOf(element);
			sum = sum + value;

		}
	}
}
