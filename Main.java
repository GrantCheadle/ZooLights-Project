import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.println("Enter your last name: ");
    String lastName = input.nextLine();
    
  //Objects

  method fName = new method("Grant");
  



    System.out.println("Enter weekend if it is a weekend or enter weekday if it is a weekend");
    String day = input.nextLine();
    
    System.out.println("Do you want to walk or drive through");
    String drive = input.nextLine();
    
    System.out.println("Enter the month number you were born");
    int monthB = input.nextInt();
    
    System.out.println("Enter the date you were born. Note include zeros if single digit number");
    int dayB = input.nextInt();
    
    System.out.println("Enter the year you were born");
    int yearB = input.nextInt();
    
    System.out.println("Enter your height in inches: ");
    double height = input.nextDouble();
    
    System.out.println("Enter your weight in lbs: ");
    double weight = input.nextDouble();

    System.out.println("Enter discount code: ");
    String code =input.nextLine();
  }

}