//we can do this program by using indexOf() and as well as normal way...
//the advantage of normal way is we can find occurance also because we are using count variable...
public class DistinctString {

	public static void main(String[] args) {
		String s="jjava";
		String str="";
		for(int i=0; i<s.length(); i++) {
			char ch=s.charAt(i);
			if(str.indexOf(ch)==-1) {
				str=str+ch;
			}
		}
		System.out.println(str);
		
//		or
		
		for(int i=0; i<s.length(); i++) {
			int count=0;
			for(int j=0; j<s.length(); j++) {
				if(s.charAt(i)==s.charAt(j)&&(i>j)) {
					break;
				}
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
			if(count>0) {

//				System.out.println(s.charAt(i)+" "+count);
				System.out.print(s.charAt(i)+"");
			}
		}
	}
}
