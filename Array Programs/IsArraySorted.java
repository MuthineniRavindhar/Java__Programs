package arrayprograms;

public class IsArraySorted {

	public static void main(String[] args) {
		
		int[] a= {1,4,3,4,5};
		
		boolean flag=true;
		for(int i=1; i<a.length; i++) {
		
			if(a[i]<a[i-1]) {
				flag=false;
				break;
			}
		}
		if(flag) {
			System.out.println("Array is sorted");
		}
		else{
			System.out.println("Array is not sorted");
		}
	}
}
