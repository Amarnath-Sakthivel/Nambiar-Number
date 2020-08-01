package com.wipro.javapractice;

public class NambiarNumber {

	static int NambiarNumber(int[] input) {
		int even = 0;
		StringBuilder sb = new StringBuilder();
		int odd = 0;
		for (int i = 0; i < input.length; i++) {
			int firstDigit = input[i];
			odd = input[i];
			for (int j = i + 1; j < input.length; j++) {
				if (odd % 2 == 1 && firstDigit % 2 == 1) {
					odd += input[j];
					i = j;
				} else if (odd % 2 == 0 && firstDigit % 2 == 0) {
					even += input[j];
				}
			}
			if (odd != 0) {
				sb.append(odd);
			}
			if (even != 0) {
				sb.append(even);
			}
		}

		System.out.println(sb);
		return 0;

	}

	public static void main(String[] args) {
		System.out.println("Test Case 1");
		int arr = NambiarNumber(new int[] { 9, 0, 8, 0, 5, 1, 0, 5, 7, 1 });

		System.out.println("Test Case 2");
		NambiarNumber(new int[] { 9, 0, 8, 0, 4, 4, 9, 7, 2, 0 });
		
		System.out.println("Test Case 3");
		NambiarNumber(new int[] { 1, 2, 3, 4 });
	}

}
