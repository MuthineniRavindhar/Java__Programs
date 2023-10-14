public class VowelAscending {

	public static void main(String[] args) {
		String s="this is testyantra preperation";
		String s1="aeiouAEIOU";
		String v="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(s1.indexOf(ch)!=-1) {
				v=v+ch;
			}
		}
		System.out.println(v);
		
		char [] a=v.toCharArray();
		
		for(int i=0; i<a.length; i++) {
			
			for(int j=1; j<a.length; j++) {
				if(a[j-1]>a[j]) {
					char temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
				}
			}
		}
		
		for (char c : a) {
			System.out.print(c);
		}
		}
}
