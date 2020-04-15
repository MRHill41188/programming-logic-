package test;

public class incrementor {
	
	public static void main(String[] args) {
		
		int x = 5;
		  while(x >= 0) {
		  int y = 3;
		  while (y > 0) {
		  if(x<2) continue;
		  x--; y--;
		  System.out.println("value of x*y= "+x*y+" " +"value of x= "+x+" "+ "value of y= "+y);
		
		  }
		  }
	}

}
