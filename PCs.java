public class PCs extends SellingComputers{

  /*
  * This is the Instance Variable
  */
  private int numberOfMonitors;

  /*
  * This is the no argument constructor
  */
  public PCs(){
    this.numberOfMonitors = 0;
  }

  /*
  * This is the parameterized constructor that assigns specific values using the "this" word. It also uses the super word since it inherits the variables
  */
   public PCs(String name, double price, int age, int numberOfMonitors, boolean affordable) {
    super(name, price, age, affordable);
    this.numberOfMonitors = numberOfMonitors;
  }

  /*
  * This is the accessor methods or getter methods.
  */
  public int getnumberOfMonitors(){
    return numberOfMonitors;
  }

  /*
  * This is the mutator methods or setter methods. 
  */
  public void setnumberOfMonitors(int numberOfMonitors){
    this.numberOfMonitors = numberOfMonitors;
  }

    /*
    * This is what reccomends the user the specific PC since it takes the user input for wantLapTop and isForGaming and creates a reccomendation
    */
    public String reccomend(boolean wantLapTop, boolean isForGaming){
    String result = "";
    if (wantLapTop == false && isForGaming == true){
      result = "the IBUYPOWER PC that is great for gaming and comes in various prices!";
   } else if (wantLapTop == false && isForGaming == false) {
      result = "the HP, or Dell PC's are great for Office work and School Work!!";
   }
      return result;
  }

}