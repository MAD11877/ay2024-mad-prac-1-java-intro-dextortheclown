import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);
    System.out.println("What is your height in M");
    double height = in.nextDouble();
    System.out.println("What is your weight in KG");
    double weight = in.nextDouble();
    double BMI = weight/(height**2)
    System.out.println("BMI: " + BMI)
  }
}
