package test;

public class isPrime {
	
	public static void main(String[] args) {
int num = 11;
boolean isPrime = true;

for(int i = 2; i <= num/2;i++){

System.out.println("hi");

if(num%i==0){

isPrime = false;
break;

}
}
if (isPrime){
  System.out.println("is prime");
}
else{
  System.out.println("not prime");
}
}
}

