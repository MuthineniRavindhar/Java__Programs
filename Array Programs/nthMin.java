package arrayprograms;

public class nthmin {

	public static void main(String[] args) {
		int a[]= {30,20,6,10,5,4};
		int min=a[0];
		int secondmin=a[1];
		int thirdmin=a[2];
		for(int i=0; i<a.length; i++) {
			
			if(min>a[i]) {
				thirdmin=secondmin;
				secondmin=min;
				min=a[i];
			}
		}
		System.out.println(min+" is minimum");
		System.out.println(secondmin+" is second minimum");
		System.out.println(thirdmin+" is third minimmum");
	}
}
