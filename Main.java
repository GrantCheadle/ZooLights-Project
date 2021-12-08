import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
    System.out.println("Enter your first name: ");
    String firstName = input.nextLine();
    System.out.println("Enter your last name: ");
    String lastName = input.nextLine();

  
/*
System.outs
*/
    System.out.println("Enter weekend if it is a weekend or enter weekday if it is a weekend");
    String day = input.nextLine();
    
    System.out.println("Enter the month number it is.");
    int month=input.nextInt();
    String monthS;
    if (month<=9)
    {
      monthS="0"+month;
    }
    else
    {
      monthS=month+"";
    }
    System.out.println("Enter the day it is.");
    int days=input.nextInt();
    String dayS;
    if (days<=9)
    {
      dayS="0"+days;
    }
    else
    {
      dayS=""+days;
    }
    System.out.println("Enter the full year it is. Ex. 2000");
    int year=input.nextInt();
    String date=monthS+"/"+dayS+"/"+year;
    System.out.println(date);
    //google java localdate to do this
    
    input.nextLine();
    System.out.println("Do you want to walk or drive through");
    String drive_walk = input.nextLine();
    boolean driveWalk;
    String lower= drive_walk.toLowerCase();
    if (lower.equals("walk"))
    {
      driveWalk= true;
    }
    else if (lower.equals("drive"))
    {
      driveWalk= false;
    }
    else
    {
      System.out.println("Sorry but you choice to not drive or walk throught our zoo lights, see you next time. Goodbye.");
    }
    
    System.out.println("Enter the month number you were born");
    int monthB = input.nextInt();
    String monthBS;
    if (monthB<=9)
    {
      monthBS="O"+monthB;
    }
    System.out.println("Enter the day you were born.");
    int dayB= input.nextInt();
    String dayBS;
    if (dayB<=9)
    {
      dayBS="O"+dayB;
    } 
    System.out.println("Enter the full year you were born. Ex. 2000");
    int yearB = input.nextInt();
    
    String dateB=monthB+"/"+dayB+"/"+yearB;
    System.out.println(dateB);
    
    int age=year-yearB;

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
  double cost =0.0;
  //If statements for determining cost


  if(driveWalk==true)
  {
        if(age>=18 && day.equals(weekday))
    {
      cost = 16;
    }
    else if(age>=18 && day.equals(weekend))
    {
      cost = 25;
    }

    if(age>2)
    {
      cost = 0;
    }
    else if(age>=2 && age<=14 && day.equals(weekday))
    {
      cost = 8;
    }
    else if(age>=2 && age<=14 && day.equals(weekend))
    {
      cost =12;
    }

    if(age>15 && age<18 && day.equals(weekday))
    {
      cost =12;
    }
    else if(age>15 && age<18 && day.equals(weekend))
    {
      cost =18;
    }
  }

    

}
}