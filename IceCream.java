package classesandobjects;

/**
 *
 * @author Serenna
 */
public class IceCream {
    private String flavor;
    private String Cone;
    private int Scoops;
    private int toppings;
    
    public IceCream(String flavor, String Cone, int Scoops, int toppings){
        this.flavor = flavor;
        this.Cone = Cone;
        this.Scoops= Scoops;
        this.toppings = toppings;
        
    
    }
    public String setflavor(){
        return this.flavor;   
    }
    public String getflavor(){
        return this.flavor;   
    }
    public String setCone(){
      return this.Cone;   
    }
    public String getCone(){
        return this.Cone;  
    }
      public int setScoops(){
        return this.Scoops;   
    }
    public int getScoops(){
        return this.Scoops;   
    }
    public int settoppings(){
        return this.toppings;   
    }
    public int gettoppings(){
        return this.toppings; 
    }
   
}
