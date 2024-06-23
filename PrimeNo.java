import java.util.*;

public class PrimeNo{
public static boolean isPrime(int num){
	if(num <=1)
		return false;

	for(int i=2;i<=Math.sqrt(num);i++){
		if(num % i ==0)
			return false;
		}
		return true;
	}
	public static void main(String [] args){
		Scanner s = new Scanner (System.in);

		System.out.println("Enter an integer:");
		int number = s.nextInt();	

		if(isPrime(number)){
			System.out.println(number +" is a prime number.");
		}else{
			System.out.println(number +" is not a prime number.");
		}
		s.close();
	}
}