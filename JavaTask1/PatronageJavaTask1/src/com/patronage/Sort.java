package com.patronage;

import java.util.Scanner;

public class Sort {

	final static Scanner in = new Scanner(System.in);

	public static void main(String args[]) {

		Sort sort = new Sort();
		System.out.print(sort.reverseSort(sort.addText()));
		String text = in.nextLine();
		return;
	}

	public String addText() {
		System.out.println("Enter Your text: ");
		String text = in.nextLine();
		return text;
	}

	public String reverseSort(String text) {
		StringBuffer a = null;
		String result = null;
		if (text.length() > 0) {

			a = new StringBuffer(text);
			result = a.reverse().toString();

		} else {
			System.out.println("Error: empty String");
		}
		return result;
	}
}
