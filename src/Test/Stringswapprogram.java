package Test;

public class Stringswapprogram {
	

	public static  void main(String[] args) {
		
		String a= "Sooraj";
		String b= "Nair";
		
		String a1 = a+b;
		System.out.println(a1);
		
		b=a1.substring(0,a1.length()-b.length());
		a=a1.substring(b.length());
		
		
		System.out.println(a);
		System.out.println(b);
		
		
	

	}

}
