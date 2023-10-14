package arrayprograms;

public class MaximumElement {

//	we can do this by two ways
//	1)sort the array in ascending order then a[a.length-1] element will be the maximum element..
//	2)compare the elements by using max variable with other elements in the array...
	public static void main(String[] args) {
		
		int a[]= {1,2,95,4,5,6};
		int max=a[0];
		
		for(int i=0; i<a.length; i++) {
			
			if(max<a[i]) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		
//					(OR)
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=1; j<a.length; j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(a[a.length-1] +" is maximum");
	}
}
