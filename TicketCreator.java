public class TicketCreator
{
  private String first;
  private String last;
  private boolean isWeekend;
  private String drive_walk;
  private String birthday;
  private int height;
  private int weight;
  private boolean discount;
  String date;
  
  public TicketCreator(String firstName, String lastName, boolean weekend, String walkOrDrive, String birth, int numHeight, int numWeight, boolean hasDiscount, String dateToday)
  {
    first = firstName;
    last = lastName;
    isWeekend= weekend;
    drive_walk= walkOrDrive;
    birthday= birth;
    height= numHeight;
    weight= numWeight;
    discount= hasDiscount;
    date=dateToday;
  } 
  
  public void getDate()
  {
    String month=date.substring(0,2);
    String monthB=birthday.substring(0,2);
    
    String day= date.substring(3,5);
    String dayB= birthday.substring(3,5);

    String yearS= date.substring(6);
    String yearB= birthday.substring(6);
    
    
  }

  //$16 for weekdays, $25 for weekends. For kids, anyone under 2 is free at any time, between 2 and 14 is $8 for weekdays and $12 for weekends, and between 15 and 18 (non-inclusive) is $12 for weekdays and $18 for weekends.
  // Determines how much it will cost depending on the persons variables. (i.e. age, height, weight, discount)
  public double getCost()
  {
    return 4;
  }
  // Determines whether they are a child or an adult based on their date of birth.
  public int isAdult()
  {
    return 5;
  }

  public String toString()
  {
    return 
  }








}