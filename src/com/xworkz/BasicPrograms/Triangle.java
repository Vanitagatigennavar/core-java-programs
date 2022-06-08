package com.xworkz.BasicPrograms;
public class Triangle {

	void triangleMatrix() {

		for (int row = 1; row <= 10; row++) {
			for (int col = row; col <= 10; col++) {

				System.out.print(" ");
			}
			for (int col = 1; col <= row; col++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
