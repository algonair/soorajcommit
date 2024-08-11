package Test;

public class reversestr {

	public static void main(String[] args) {
		String orgstr= "selenium";
		String reverse= "";
		
		for(int i=orgstr.length()-1;i>=0;i--) {
			
			
			reverse=reverse+orgstr.charAt(i);
		}
	System.out.println(reverse);

	}

}


