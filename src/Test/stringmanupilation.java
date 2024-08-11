package Test;

public  class stringmanupilation {

	public static void main(String[] args) {
		
		
		String str = " No water No water No water";
		String str1 = " No water No water No water";
		
				//Finding of occurance of a character in a string in a particular string
				int data = str.indexOf("N",str.indexOf("N",str.indexOf("N")+1)+1);
				//System.out.println(data);
				//Check if two strings are equal or not
				boolean datanew =str.equals(str1);
				System.out.println(datanew);
				// String substring is method used to sort a particunglar part of string
				
				String STRE = "   My name is sooraj    ";
			    String trimed =STRE.trim();
			    System.out.println(trimed);
			    String STREw = "My name is sooraj";
			    String print= STREw.substring(0, 5);
			    System.out.println(print);
			    String name = "My_name_is_khan";
			    String[] split = name.split("_");
			    System.out.println(split);
			    
		
			    
				

	}

}
