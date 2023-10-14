package arrayprograms;

public class BinarySearch {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4};
		
		int ele=3;
		int ind=-1;
		int f=0; int l=a.length-1;
		int mid=(f+l)/2;
		
		while(f<=l) {
			if(ele==a[mid]) {
				ind=mid;
				break;
			}
			else if(ele>a[mid]) {
				f=mid+1;
			}
			else {
				l=mid-1;
			}
			mid=(f+l)/2;
		}
		if(ind==-1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println("element is found at index "+ind);
		}
	}
}
