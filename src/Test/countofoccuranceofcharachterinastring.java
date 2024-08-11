package Test;

public class countofoccuranceofcharachterinastring {

	public static void main(String[] args) {
		
		String str = "Java with OOPPSa and Java";
		
	 int totalcharcount=  str.length();
	 String strt=str.replace("a", "");
	 int withoutacharcount = strt.length();
	 
	 int acount=totalcharcount-withoutacharcount;
	 System.out.println(acount);
	 

	}

}
  