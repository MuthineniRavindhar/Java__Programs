public class StringMethods {

	public static void main(String[] args) {
		
		String s1="Welcome To String Programs";
//		1)length();
		System.out.println(s1.length());
		String[] s2 = s1.split(" ");
		System.out.println(s2.length);//here we have to use length variable beacuse it's return type is String[].length is four and index value starting from 0
		for (String string : s2) {
			System.out.println(string);//iterating by using foreach method.
//			op:-
//			Welcome
//			To
//			String
//			Programs
		}
		System.out.println("======");
		
		
//		2)toUpperCase();
		System.out.println(s1.toUpperCase());//WELCOME TO STRING PROGRAMS
		
		for(int i=0; i<s1.length(); i++) {
			char ch=s1.charAt(i);
		
			if(ch=='e') {
				String s=ch+"";
				System.out.println(s.toUpperCase());//E
													//E  because 2 e's are present in given string.
			}
		}
		System.out.println("======");
		
		
//		3)toLowerCase();
		System.out.println(s1.toLowerCase());//welcome to string programs
		System.out.println("======");
		
		
//		4)concat("String");
		String str=s1.concat(" by vivek sir");
		System.out.println(str);//Welcome To String Programs by vivek sir
		System.out.println("======");
		
		
//		5)trim();
		String s=" hii ravi smart ";
		System.out.println(s.trim());//hii ravi smart
		//it will remove the spaces from both the ends but not in b/w the words.
		System.out.println("======");
		
		
//		6)charAt(int):char
		//it will give the character based up on index value..
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
//		for(int i=0; i<s1.length(); i++) {
//			System.out.println(s1.charAt(i));//we will get each and every single character as output..
//		}
		System.out.println("======");
		
		
//		7)indexOf(char):int
		int index=s1.indexOf('e');
		System.out.println(index);//1
		System.out.println("======");
		
		int index1=s1.indexOf('o');
		System.out.println(index1);//4  if we have duplicate characters then it will give first index position as output.
		System.out.println("======");
		
		
//		indexOf(char,int):int
		int ind=s1.indexOf('o',2);
//		System.out.println(ind);
		String j2="javana";
		System.out.println(j2.indexOf('a',1));
		System.out.println("======");
		
		
//		indexOf(String):int
		int ind1=s1.indexOf("me");
		System.out.println(ind1);//5 it will give the index position of the string.
		System.out.println("======");
		
//		indexOf(String,int):int
		String string="malayalam";
		int ind2=string.indexOf("al",2);//5 it will give second al string index position
		System.out.println(ind2);
		System.out.println("======");
		
//		split(String):String[]
		String jing="jingalala";
		String [] arr=jing.split("l");
		System.out.println("length is "+arr.length);
		for (String string2 : arr) {
			System.out.println(string2);//jinga
										//a
										//a
		}
		System.out.println("======");
//		toCharArray:char[]
		String rb="rabbani";
		char[] ch=rb.toCharArray();
		for (char c : ch) {
			System.out.print(c+" ");//r a b b a n i   because im using print() not println() so prints in 
		}
		System.out.println();
		System.out.println("======");
		
		
//		subString(int):String
		String name="Ravindhar";
		System.out.println(name.substring(0));//Ravindhar
		System.out.println(name.substring(1));//avindhar
//		System.out.println(name.substring(50));//StringIndexOutOfBoundsException
		System.out.println(name.substring(4,4));//it will prints empty space..
		System.out.println(name.substring(4,5));//n
		System.out.println(name.substring(name.length()-1));//r  it will prints last character of the word.
		System.out.println(name.substring(0,1));//R   it will prints first character of the word.
		
		//this is my own task to print middle character from given String.
		int m=name.length()/2;
		int n=name.length()/2+1;
		System.out.println(name.substring(m,n));//n
		String o=name.substring(m,n);
		System.out.println(o.toUpperCase());//N
		
		
//		NOTE:- If the start index is greater than end index then we get StringIndeOutOfBoundsException.
//		Ex:- System.out.println(name.subString(5,4));
		
	}
}
