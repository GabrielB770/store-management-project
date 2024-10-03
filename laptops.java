public class laptops extends SellingComputers{

  /*
  * Instance Variables
  */
  private boolean isTouchScreen;

  /*
  * No argument constructor. Gives a default value.
  */
  public laptops(){
    this.isTouchScreen = false;
  }

  /*
  * This is the parameterized constructor that assigns specific values using the "this" word. It also uses the super word since it inherits the variables
  */
  public laptops(String name, double price, int age, boolean isTouchScreen, boolean affordable) {
    super(name, price, age, affordable);
    this.isTouchScreen = isTouchScreen;
  }

  /*
  * This is the accessor methods or getter methods.
  */
  public boolean getisTouchScreen(){
    return isTouchScreen;
  }

  /*
  * This is the mutator methods or setter methods. 
  */
  public void setisTouchScreen(boolean isTouchScreen){
    this.isTouchScreen = isTouchScreen;
  }

  /*
  * This is what reccomends the user the specific Laptop since it takes the user input for wantLapTop and isForGaming and creates a reccomendation
  */
  public String reccomend(boolean wantLapTop, boolean isForGaming){
    String result = "";
    if (wantLapTop == true && isForGaming == true){
      result =  "Asus Tuff Gaming LapTop, this is great for gaming and has great specs!!";
  } else if (wantLapTop == true && isForGaming == false) {
      result = "Apple laptops are the trending work/office laptops that run great";
  }
    return result;
  }
}