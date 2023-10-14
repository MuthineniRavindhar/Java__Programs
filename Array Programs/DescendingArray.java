package arrayprograms;

public class DescendingOrder {

//	we can do Ascending/descending order by using bubble sort or selection sort...
//	/this is selection sort....

	public static void main(String[] args) {
		
		int a[]= {1,2,5,6,7,3,4};
		
		for(int i=0; i<a.length; i++) {
			int min=i;
			for(int j=i+1; j<a.length; j++) {
				if(a[min]<a[j]) {
					min=j;
				}
			}
			int temp=a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		
		for (int i : a) {
			System.out.println(i);
		}
	}
}
