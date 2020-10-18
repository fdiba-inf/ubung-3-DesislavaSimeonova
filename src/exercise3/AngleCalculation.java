package exercise3;
import java.util.Scanner;
public class AngleCalculation{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    double angle = input.nextDouble();
    char symbol = input.next().charAt(0);

    do{
        if(symbol == 'r'){
          double grad = angle * (180.00 / Math.PI);

          System.out.println("Angle: " + grad + "d");
          
        }else if(symbol == 'd'){
          double radiant = angle * (Math.PI / 180.00);

          System.out.println("Angle: " + radiant + "r");
          
        }
        angle = input.nextDouble();
        symbol = input.next().charAt(0);
    }
    while(symbol == 'd' || symbol == 'r');

    
  }
}