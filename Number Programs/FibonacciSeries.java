package numberprograms;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.println(a);
		System.out.println(b);
		while(a+b<=100) {
			int res=a+b;
			System.out.println(res);
			a=b;
			b=res;
		}
	}
}
