public class SellingComputers{

  /*
  * These are the four instance variables; the age, the name, the price, and the affordability
  */ 
  private String name;     
  private double price;    
  private int age;
  private boolean affordable;

  /*
  * This is the no argument constructor that applies default values to the instance variables.
  */ 
  public SellingComputers(){
    this.name = "No name";
    this.price = 0.00;
    this.age = 0;
    this.affordable = false;
  }

  /*
  * This is the parameterized constructors that assigns specific values using the "this" word
  */
  public SellingComputers(String name, double price, int age, boolean affordable){
    this.name = name;
    this.price = price;
    this.age = age;
    this.affordable = affordable;
  }

  /*
  * These are the getter methods also known as the accessor methods. They get the values of the user and return it. For example, gets name, returns name. 
  */
  public String getName(){
    return name;
  }

  public double getPrice(){
    return price;
  }
  
  public int getage(){
    return age;
  }
public boolean getAffordable(){
    return affordable;
  }

  /*
  * These are the setter methods also known as the mutator methods. They set the name by using the this word. 
  */
  public void setName(String name){
    this.name = name;
  }
  public void setPrice(double price){
    this.price = price;
  }
  public void setage(int age){
    this.age = age;
  }
  public void setAffordable(boolean affordable){
    this.affordable = affordable;
  }
  /*
  * This toString works as the introduction to my buisnes. I wasnt able to use it in my prgram since I like have a aesthetic setup in the console. 
  * Not sure if this is wrong even though it works.
  */
  public String toString(){
    return "Hello! This is my buisness called Zylo!! What type of PC or Laptop do you want to purchase??";
  }


}