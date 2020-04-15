package test;

public class palStrBuff {
		  public static void main(String[] args) {
		  
		  StringBuffer s = new StringBuffer("racecar");
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
