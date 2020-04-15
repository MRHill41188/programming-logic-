package test;

public class palgindrone {
	
	public static void main(String args[]) { 
		System.out.println("Is keck palindrom?: " + isPalindromString("racecar"));
		//System.out.println("Is abc palindrom?: " + isPalindromString("Amik"));
		//System.out.println("Is bbbb palindrom?: " + isPalindromString("Michael"));
		//System.out.println("Is defg palindrom?: " + isPalindromString("boob"));
	}

	public static boolean isPalindromString(String text){ 
		String reverse = reverse(text); 
		if(text.equals(reverse)){ 
			System.out.println(reverse);
			return true; } 
		return false; }
	
	public static String reverse(String input){ 
		if(input == null || input.isEmpty()){ return input; } 
		return input.charAt(input.length()- 1) + reverse(input.substring(0, input.length() - 1));
		} 
	}
