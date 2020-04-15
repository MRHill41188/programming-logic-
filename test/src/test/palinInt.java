package test;

public class palinInt {

	  public static void main(String[] args) {
		  
		  int r = 0;
		  int sum = 0;
		  int temp = 0;
		  int n = 3000004;

		  temp = n;

		System.out.println(temp);
		  while(n>0){

		    r=n%10;
		    sum=(sum*10)+r;
		    n=n/10;
		    System.out.println("n = "+n);
		}
		System.out.println(sum);
		if (temp == sum)

		System.out.println("true");
		else{
		  System.out.println("false");
		}
		}
		}