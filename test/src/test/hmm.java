package test;

public class hmm {
	
	static String a = "az";
	
	public static void main(String[] args) {
		
		checkPalindrome(a);
		
		
	}
	

	static boolean checkPalindrome(String inputString) {

		StringBuffer s = new StringBuffer(a);
		String a = s.toString();
		StringBuffer y = s.reverse();
		String b = y.toString();

		System.out.println(a);
		System.out.println(b);

		if(a.equals(b)){
			System.out.println("true");
			return true;
		}
		else{
			System.out.println("false");
		    return false;
		}
}
		    
	
	
}