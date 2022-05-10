package jp.co.aforce.test;

public class MinMax {

	//2.

	int a = 4, b = 2, c = 10;

	public void getMaxValue() {
		if(a > c && a > b) {
			System.out.println(a+"と"+b+"と"+c+"のうち、最大のものは"+ a);
		} else if (b > c && b > a) {
			System.out.println(a+"と"+b+"と"+c+"のうち、最大のものは"+ b);
		} else if (c > a && c > b) {
			System.out.println(a+"と"+b+"と"+c+"のうち、最大のものは"+ c);
		} else {
			return;
		}

	}

	public void getMinValue() {
		if(a < c && a < b) {
			System.out.println(a+"と"+b+"と"+c+"のうち、最小のものは"+ a);
		} else if (b < c && b < a) {
			System.out.println(a+"と"+b+"と"+c+"のうち、最小のものは"+ b);
		} else if (c < a && c < b) {
			System.out.println(a+"と"+b+"と"+c+"のうち、最小のものは"+ c);
		} else {
			return;
		}


	}


}
