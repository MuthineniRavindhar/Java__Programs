package numberprograms;

public class ArmStrong {

	public static void main(String[] args) {

		for (int i = 1; i <= 1000; i++) {
			int num = i;
			int temp = num;
			int temp1 = temp;
			int sum = 0;

			int count = 0;
			while (num != 0) {
				num /= 10;
				count++;
			}

			while (temp != 0) {
				int rem = temp % 10;
				int pro = 1;
				for (int j = 1; j <= count; j++) {
					pro = pro * rem;
				}
				sum = sum + pro;
				temp /= 10;
			}
			if (temp1 == sum) {
				System.out.println(temp1 + " is a ArmStrong number");
			}
//		else {
//			System.out.println(temp1+" is not a Armstrong number");
//		}

		}
	}
}
