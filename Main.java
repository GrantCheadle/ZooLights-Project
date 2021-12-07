import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.println("Enter your last name: ");
    String lastName = input.nextLine();
    
  //Objects
  

    System.out.println("Enter weekend if it is a weekend or enter weekday if it is a weekend");
    String day = input.nextLine();
    
    System.out.println("Do you want to walk or drive through");
    String drive = input.nextLine();
    
    System.out.println("Enter the month number you were born");
    String monthB = input.nextLine();
    if (monthB.length()>2)
    {
      
    }
    System.out.println("Enter the day you were born.");
    String dayB= input.nextLine();
    
    System.out.println("Enter the year you were born");
    String yearB = input.nextLine();
    

    String dateB=monthB+"/"+dayB+"/"+yearB;
    
    System.out.println("Enter your height in inches: ");
    double height = input.nextDouble();
    
    System.out.println("Enter your weight in lbs: ");
    double weight = input.nextDouble();
    input.nextLine();
    System.out.println("Enter discount code: ");
    String code =input.nextLine();
    if (code== "MEMBER")
    {
      boolean haveCode=true;
    }
    else
    {
      boolean haveCode=false;
    }

  }

}