
/**
 * Write a description of class Salad here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salad extends Menu
{
    public Salad(String name, Double price){
        super(name,price);
    }
    
    public String dressing(){
        return "What kind of dressing would you like?";
    }
    
}
