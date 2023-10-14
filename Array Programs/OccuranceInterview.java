package arrayprograms;

public class OccuranceInterview {



	public static void main(String[] args) {
		
		int a[] = {1,3,4,1,4,2,5,7,8,1};
		
		for(int i=0; i<a.length; i++) {
			int count=0;
			for(int j=0; j<a.length; j++) {
				if(a[i]==a[j]&(i>j)) {
					break;
				}
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>0) {
				for(int k=0; k<a.length; k++) {
					
					for(int j=1; j<a.length; j++) {
						if(a[j-1]>a[j]) {
							int temp=a[j-1];
							a[j-1]=a[j];
							a[j]=temp;
						}
					}
//					for(int i1=0; i1<a.length; i1++) {
//				System.err.println(i1);
//				}
				}
			System.out.println(a[i]+" occured "+count+" times");
			}
		}
	}
}




