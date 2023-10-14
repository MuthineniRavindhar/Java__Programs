package arrayprograms;

public class SelectionSort {

	public static void main(String[] args) {
		
		int a[]= {9,5,3,6};
		
		for(int i=0; i<a.length; i++) {
			int min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[min]>a[j]) {
					min=j;
				
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		
		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
