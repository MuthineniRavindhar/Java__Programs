package arrayprograms;

public class nthMax {

	public static void main(String[] args) {
		int a[]= {1,2,4,5,6,3,7};
		int max=a[0];
		int secondmax=a[1];
		int thirdmax=a[2];
		for(int i=0; i<a.length; i++) {
			if(max<a[i]) {
				thirdmax=secondmax;
				secondmax=max;
				max=a[i];
			}
//			if(a[i]<secondmax&&a[i]>max) {
//				secondmax=a[i];
//			}
		}
		System.out.println(max+" is max");
		System.out.println(secondmax+" is second max");
		System.out.println(thirdmax+" is third max");
	}
}
