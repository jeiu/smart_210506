package smart_week10;

import java.util.Scanner;

public class Calculator {
	static float first_num;
	static float second_num;
	static float result;
	
	public static void main(String[] args) {
		char symbol = ' ';
		Scanner scan = new Scanner(System.in);
		
		System.out.println("첫번 째 수 : ");
		first_num = scan.nextFloat();
		System.out.println("두번 째 수 : ");
		second_num = scan.nextFloat();
	}

	float plus(float first_num, float second_num) {
		result = first_num + second_num;
		return result;
	}
	
	float minus(float first_num, float second_num) {
		result = first_num - second_num;
		return result;
	}
	
	float multi(float first_num, float second_num) {
		result = first_num * second_num;
		return result;
	}
	
	float divide(float first_num, float second_num) {
		result = first_num / second_num;
		return result;
	}
}
