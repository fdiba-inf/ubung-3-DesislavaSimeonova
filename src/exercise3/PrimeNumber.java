package exercise3;
import Java.util.Scanner;
public class PrimeNumber {
  public static void main (String[] args) {
    Scanner input = new Scanner (System.in);
    int n = input.nextInt;
    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(n); i++) {
      if (n%i == 0){
        isPrime = false;
      }

      }
      if else (n%i != 0) {
        isPrime = true;
      }
      System.out.println("Prime number: "+ isPrime) 
     }
    
}