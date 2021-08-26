package CodeWars;

import java.security.DomainCombiner;

public class ReverseAnArray {

	public static String[] fixTheMeerkat(String[] arr) {

		for (int i = 0; i <= arr.length - 1; i++) {
			for (int j = arr.length - 1; j >= 0; j--)

			{

				arr[i] = arr[j];
			}

		}

		return arr;
	}

	public static int dutyFree(int normPrice, int discount, int hol) {

		// 15 10 200

		return 43;

	}

	public static void reverse(String[] arr) {

		for (int i = arr.length - 1; i >= 0; i--)
			System.out.println(arr[i]);

	}

	public static void main(String[] args) {
		String asd[] = { "one", "two", "three", "four", "five" };

		String[] b = fixTheMeerkat(asd);

		int a = dutyFree(17, 10, 500);
		System.out.println(a);

		
		int price = 17;
		int discount = 10;
		int holiday = 500;

		int count = 500 / 17 * 10 / 100;
		System.out.println(count);

	}

}
