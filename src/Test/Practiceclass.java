package Test;

import java.util.HashSet;
import java.util.Set;

public class Practiceclass {
//Program for reverse String
	public static void main(String[] args) {
		/*
		 * System.out.println(Practiceclass.reversestring());
		 * System.out.println(Practiceclass.stringswap());
		 */
		//System.out.println(Practiceclass.fibonaciseries());
		//System.out.println(Practiceclass.sumofdigits());
		System.out.println(Practiceclass.occuranceofcharinstring());
		
	}
	//Program for reverse String
	public static String reversestring() {
		
		String orgstr= "selenium";
		String reverse= "";
		
		for(int i=orgstr.length()-1;i>=0;i--) {
			
			
			reverse=reverse+orgstr.charAt(i);
			
		}
		return reverse;
	

	}
	

	//Program for String Swap
	public static String stringswap() {
		
		String Str1="Sooraj";
		String Str2= "Nair";
		/*
		 * System.out.println(Str1); System.out.println(Str2);
		 */
		
		String Concat = Str1+Str2;
		
		Str2= Concat.substring(0,Concat.length()-Str2.length());
		Str1 = Concat.substring(Str2.length());
		/*
		 * System.out.println(Str1); System.out.println(Str2);
		 */
		
		return Str1 + Str2 ;
		
		}
	
	public static int fibonaciseries(){
		
	int	n1=0;
	int n2 =1;
	int sum =0;
	
	System.out.print(n1+" " +n2);
	
	for(int i=2;i<10;i++) {
		
		sum = n1+n2;
		System.out.print(" "+sum);
		n1=n2;
		n2=sum;
		
		
		
		
	}
	return sum;
	}
	
	public static int sumofdigits() {
		
		
		int num=19952611;
		int sum=0;
		
		while(num>0) {
			
			sum=sum+num%10;
			num=num/10;
			
		}
		
		return sum;
	}
	
	public static int occuranceofcharinstring() {
		
		String str ="Java java java java java aaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
				
				int legn=str.length();
				String replace = str.replace("a","" ); 
				int fnl= replace.length();
				
				int fnllegnth = legn-fnl;
				//System.out.println(fnllegnth);
				
				return fnllegnth;
	
	
}
	
	
	public static void duplicateelementsinanstringarray() {
		
		String languages[]= {"java","Python","java","c","c"};
		
		Set <String> prgm = new HashSet<String>();
			
			for(String store : languages) {
				
				if(prgm.add(store)==false) {
					
					System.out.println(store);
			}
			
			
		}
				
	
		
	}
}



