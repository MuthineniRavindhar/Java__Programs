package arrayprograms;

public class Occurance {

	public static void main(String[] args) {
		int a[] = { 1, 1, 2, 3, 3, 2, 3 };

		for (int i = 0; i < a.length; i++) {
			int count = 0;
			for (int j = 0; j < i; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			
		if (count == 0) {
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j]) {
					count++;
				}
			}
			System.out.println(a[i]);
//			System.out.println(a[i] + " is occured " + count + " times");

		}
		}

	}
}
