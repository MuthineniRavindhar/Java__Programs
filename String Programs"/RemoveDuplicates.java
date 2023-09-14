public class RemoveDuplicates {

	public static void main(String[] args) {
	
		String s="jjava";
		String str="";
		for(int i=0; i<s.length(); i++) {
		if(str.indexOf(s.charAt(i))==-1) {
			str=str+s.charAt(i);
//			System.out.println(str);
		}
		}
		System.out.println(str);
	}
}
