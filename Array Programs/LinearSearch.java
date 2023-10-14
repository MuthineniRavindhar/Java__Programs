package arrayprograms;

public class LinearSearch {

	public static void main(String[] args) {
		int a[]= {1,2,3,4};
		int ele=3;
		int ind=-1;
		for(int i=0; i<a.length; i++) {
			if(a[i]==ele) {
				ind=i;
			}
		}
		if(ind==-1) {
			System.out.println("element is not found");
		}
		else {
			System.out.println("element is found at "+ind);
		}
	}
}
