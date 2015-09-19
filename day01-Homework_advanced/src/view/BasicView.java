package view;

import java.util.Scanner;

public class BasicView {

	protected String displayRequestInput(String str) {
		print(str + "\n");
		return new Scanner(System.in).next();
	}

	protected void print(String str) {
		System.out.print(str);
	}
}
