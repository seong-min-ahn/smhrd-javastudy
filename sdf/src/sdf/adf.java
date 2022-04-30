package sdf;

import java.util.Random;

public class adf {

	public static void main(String[] args) {

	}

	public static int getsum(int num) {
		int sum = 0;

		for (int i = 0; i < num; i++) {
			if (num % i == 0) {
				sum = i;
			}
		}
		return sum;
	}

}