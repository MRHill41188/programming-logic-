package test;

public class intPalWithStringBuffer {
	
  public static void main(String[] args) {
	  
		  int n = 454; 
		  StringBuffer s = new StringBuffer(n);
		  String y = s.toString();
		  StringBuffer j = null;
		  j = s.reverse();
		  String x = j.toString();
		  System.out.println(x);
		  System.out.println(y);

		  if(y.equals(x)){

		  System.out.println("true");
		  }
		    else
		    {
		      System.out.println("false");
		    }
		  }
		}


