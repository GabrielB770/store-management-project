import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

    // Creates a Scanner object - feel free to delete if not using!
    Scanner input = new Scanner(System.in);

    /*
    * This is one toString that tells the user my buisness
    */
    SellingComputers coop = new SellingComputers();
    System.out.println(coop);

    /*
    * This prints outs the question, followed by getting the user input. For example, the users age, name, requests, etc.
    */
    System.out.println("-----------------------------------------------------------------------------------");
    System.out.println("What is your name?");
    String userName = input.nextLine();

    System.out.println("Do You Want Something Affordable?");
    boolean userAffordable = input.nextBoolean();   
    
    System.out.println("What is the Maximum price? (Decimal)");
    double userPrice = input.nextDouble();

    System.out.println("How Old are you");
    int userage = input.nextInt();


    System.out.println("Do You Want A Lap Top");
    boolean userwantLapTop = input.nextBoolean();


    System.out.println("Are You Using it For Gaming? ");
    boolean userisForGaming = input.nextBoolean();
  

    /*
    * If the user decides to go with a Laptop, the program will use "laptops jaden", and ask questions based off the laptops class. For example, if the user picks laptop,
    * then it will ask if you want a touch screen. Overall, this part of the program gets all the data that the user inputed into the console and uses it to reccomend a laptop. 
    */
     if (userwantLapTop == true) {
        laptops jaden = new laptops();
        jaden.setName(userName);
        jaden.setAffordable(userAffordable);
        jaden.setPrice(userPrice);
        jaden.setage(userage);

       
        
        System.out.println("Do You Want A Touch Screen? ");
        boolean userisTouchScreen = input.nextBoolean();
       
        System.out.println("-------------------------------");
        System.out.println("    Name: " + jaden.getName());
        System.out.println("    Affordable: " + jaden.getAffordable());
        System.out.println("    Max Price: " + jaden.getPrice());
        System.out.println("    You Age: " + jaden.getage());
        System.out.println("    Is A LapTop: " + userwantLapTop);
        System.out.println("    Touch Screen: " + userisTouchScreen);
        System.out.println("    For Gaming: " + userisForGaming);
        System.out.println("    You Should Get " +jaden.reccomend(userwantLapTop, userisForGaming));
        System.out.println("-------------------------------");
       /*
       * If the user did not input true, then the program will use the PC class and ask the following questions based of a PC. For example, 
       * how many monitors? This part of the program also uses the user input to determine what PC it should get. 
       */
     } else {
        PCs gabe = new PCs();
        gabe.setName(userName);
        gabe.setPrice(userPrice);
        gabe.setage(userage);
        gabe.setAffordable(userAffordable);

        System.out.println("How Many Monitors do You Want? ");
        int usernumberOfMonitors = input.nextInt();
       
        System.out.println("-------------------------------");
        System.out.println("    Name: " + gabe.getName());
        System.out.println("    Affordable: " + gabe.getAffordable());
        System.out.println("    Max Price: " + gabe.getPrice());
        System.out.println("    You Age: " + gabe.getage());
        System.out.println("    Is A LapTop: " + userwantLapTop);
        System.out.println("    For Gaming: " + userisForGaming);
        System.out.println("    Number of Monitors: " + usernumberOfMonitors);
        System.out.println("    You Should Get " + gabe.reccomend(userwantLapTop, userisForGaming));
        System.out.println("-------------------------------");
     }
    // Closes the Scanner object
    input.close();
    
  }
}