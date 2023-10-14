package arrayprograms;

public class ReverseArray {

	public static void main(String[] args) {
		int a[]= {3,7,2,1,9,6};
		
		int start=0; int end=a.length-1;
		
		while(start<=end) {
			int temp=a[start];
			a[start]=a[end];
			a[end]=temp;
			start++;
			end--;
		}
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
