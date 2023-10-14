public class FirstLetterCapital{

  public static void main(String[] args){
    String s="this is ravi smart";
    String[] str=s.split(" ");

    for(int i=0; i<str.length; i++) {
        	char ch=str[i].toUpperCase().charAt(0);
        	String s1=str[i].substring(1);
        	System.out.print(ch+s1+" ");
        }
  }
}
