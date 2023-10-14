package arrayprograms;

public class DeletingElement {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		
		int del=2;
		int ind=DeletingElement.search(a,del);
		if(a.length==0) {
			System.out.println("Array is Empty");
		}
		else if(ind==-1) {
			System.out.println("Deletion is not posiible");
		}
		else {
			int res[]=new int[a.length-1];
			
			for(int i=0,j=0; i<a.length; i++) {
				if(i!=ind) {
					res[j++]=a[i];
				}
			}
			for (int i : res) {
				System.out.print(i+" ");
			}
		}
	}
	
	public  static int search(int a[], int ele) {
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==ele) {
				return i;
			}
		
		}
		return -1;
	}
}
