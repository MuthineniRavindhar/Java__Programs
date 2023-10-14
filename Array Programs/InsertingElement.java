package arrayprograms;

public class InsertingElement {

	public static void main(String[] args) {
		int a[]= {2,3,4,5,6};
		
		int ele=9;
		int pos=2;
		int res[]=new int[a.length+1];
		
		for(int i=0, j=0; i<res.length; i++) {
			
			if(i==(pos-1)) {
				res[i]=ele;
			}
			else {
				res[i]=a[j++];
			}
			System.out.println(res[i]);
		}
	}
}
