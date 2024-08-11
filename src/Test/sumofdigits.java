package Test;

public class sumofdigits {

	public static void main(String[] args) {
		//Java program to calculate sum of digits in a number
		
				int num=26111995;
				int sum=0;
				
				while(num>0){
				
					sum=sum+num%10;
					num=num/10;
					
					
					
				}
			
System.out.println(sum);

	}

}
