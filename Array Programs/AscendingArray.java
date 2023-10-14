public class AscendingArray {
	
//	we can do Ascending/descending order by using bubble sort or selection sort...
//	/this is bubble sort....

	public static void main(String[] args) {
		
		int a[]= {3,1,9,6,4};
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=1; j<a.length; j++) {
				if(a[j-1]>a[j]) {
					int temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (int i : a) {
			System.out.print(i+" ");
		}
	}
}
