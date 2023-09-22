package strings;

import java.util.Iterator;

public class AscendingOrder {

	public static void main(String[] args) {
		
		String s="dacbfe";
		char[] arr=s.toCharArray();
		
		for(int i=0; i<arr.length; i++) {
			int min=i;
			for(int j=i+1; j<arr.length; j++) {
				if(arr[j]<arr[min]) {
					min=j;
					
				}
				
			}
			char temp = arr[i];
				arr[i]=arr[min];
				arr[min]=temp;
			
		}
		System.out.print("The Ascending Order is : ");
		for (char c : arr) {
			System.out.print(c);
		}
	}
}
