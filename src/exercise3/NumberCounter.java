package exercise3;
import Java.util.Scanner;
public class NumberCounter {
  public static void main (String[] args) {
    Scanner input = new Scanner (system.in);

   int pcounter = 0;
    int ncounter = 0;
    double sum = 0;
    double average = 0;
    int counter = 0;

    int number = input.nextInt();

    while(number != 0 ){
      if(number > 0){
        pcounter++;
      }else{
        ncounter++;
      }
      counter++;
      sum += number;
      average = sum;
      number=input.nextInt();
    }

    System.out.println("Positive numbers: " + pcounter);
    System.out.println("Negative numbers: " + ncounter);
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + (average / counter) );
  }
}