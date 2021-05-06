package smart_week10;

import java.util.Scanner;
import java.math;

public class Calculator {
	static float first_num;
	static float second_num;
	static float result;
	
	public static void main(String[] args) {
		char symbol = ' ';
		System.out.println("+, -, *, /, ^, %");
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Scan first value : ");
		if (symbol == '%') {
			System.out.println("1.sin\n2.cos\n3.tan\n4.asin\n5.acos\n6.atan");
		}
		first_num = scan.nextFloat();
		System.out.println("Scan second value : ");
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
	
	float trigonometricFunctions(float first_num, float second_num) {
		if (first_num == 1) {
			result = (float) Math.sin(second_num*Math.PI/180);
			System.out.println("sin" + second_num + "=" + result);
		}
		if (first_num == 2) {
			result = (float) Math.cos(second_num*Math.PI/180);
			System.out.println("cos" + second_num + "=" + result);
		}
		if (first_num == 3) {
			result = (float) Math.tan(second_num*Math.PI/180);
			System.out.println("tan" + second_num + "=" + result);
		}
		if (first_num == 4) {
			result = (float) Math.asin(second_num*Math.PI/180);
			System.out.println("asin" + second_num + "=" + result);
		}
		if (first_num == 5) {
			result = (float) Math.acos(second_num*Math.PI/180);
			System.out.println("acos" + second_num + "=" + result);
		}
		if (first_num == 6) {
			result = (float) Math.atan(second_num*Math.PI/180);
			System.out.println("atna" + second_num + "=" + result);
		}
		else {
			System.out.println("Wrong value");
			result = 0;
		}
		return result;
	}
	
	float exponent(float first_num, float second_num) {
		float result = (float) Math.pow(first_num, second_num);
		System.out.println(first_num + "^" + second_num + "=" + result);
		return result;
	}
}
