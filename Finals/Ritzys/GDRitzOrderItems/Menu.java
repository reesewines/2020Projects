
/**
 * Write a description of class Menu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Menu
{
    // instance variables - replace the example below with your own
    private String name;
    private Double price;

    public Menu(String name, Double price){
    this.name=name;
    this.price=price;
    }
    
    public String getName(){
        return name;
    }
    
    public Double getPrice(){
        return price;
    }
}
