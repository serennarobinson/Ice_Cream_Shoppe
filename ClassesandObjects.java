/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classesandobjects;

/**
 *
 * @author Serenna
 */
public class ClassesandObjects {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        IceCream cust1 = new IceCream("Vanilla", "Waffle", 2, 3); //cust1 is considered an object
        System.out.println("Customer 1 ordered:");
        System.out.println("Flavor: " + cust1.getflavor());
        System.out.println("Type of Cone: " + cust1.getCone());
        System.out.println("Customer wants " + cust1.getScoops() + " Scoop(s)");
        System.out.println("Customer wants " + cust1.gettoppings() + " toppings");
        
        System.out.println("*****");
        
        IceCream cust2 = new IceCream("Chocolate", "Short", 1, 6);  //cust2 is considered an object
        System.out.println("Customer 2 ordered:");
        System.out.println("Flavor: " + cust2.getflavor());
        System.out.println("Type of Cone: " + cust2.getCone());
        System.out.println("Customer wants " + cust2.getScoops() + " Scoop(s)");
        System.out.println("Customer wants " + cust2.gettoppings() + " toppings");
        
        System.out.println("*******");
        
        System.out.println(cust1 + "--Incorrect way to print");
        
        System.out.println("*******");
        IceCream cust3 = new IceCream("Cookies and Cream", "Waffle Bowl", 5, 1);
        cust3.getflavor();
        cust3.getCone();
        cust3.getScoops();
        cust3.gettoppings();
        
        
        System.out.println(cust3.getflavor()+ " " + cust3.getCone()+ " " +  cust3.getScoops()+ " " + cust3.gettoppings() );
    }
    
}
