
/**
 * Write a description of class Magazine here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Magazine
{
    // instance variables - replace the example below with your own
    private String title;
    private int noOfPages;
    private String material;
    
    private final double PlainPaper = 0.08;

    // empty constructor
    public Magazine()
    {
        // initialise instance variables  ("")/(null) = string
        title = null;
        noOfPages = 0;
        material = null;
    }

    // constructor with parameter / normal constructor
    public Magazine(String title, int noOfPages,String material)
    {
        this.title = title;
        this.noOfPages = noOfPages;
        this.material = material;
    }// end of constructor
    
    // getter
    public String getTitle(){ return title; }
    
    public int getNoOfPages() {return noOfPages;}
    
    public String getMaterial() {return material; }
    // end of getter
    
    //setter
    public void setMagazine( String title, int noOfPages, String material ) 
    { 
        this.title = title;
        this.noOfPages = noOfPages;
        this.material = material;
    }
    // end of setter 
    
    //calculation method
    public double calcCost (String material) 
    {
        double cost, hardCover = 0.0;
        
        if (material.equalsIgnoreCase("plastic"))
        {
            hardCover = 4.80;
        }
        else if (material.equalsIgnoreCase("wood"))
        {
            hardCover = 5.50;
        }
        else
        {
            System.out.println("only enter plastic or wood");
        }
        
        cost = (noOfPages * PlainPaper) + (1.5 * hardCover);
        
        return cost;
    }
    
    public String toString() 
    {
        return ("Magazine title = " + getTitle() + 
                "\nNo. of pages = " +getNoOfPages() +
                "\nMaterial = " + material +
                "\nCost of magazine = " + calcCost(material));
    }
    
}
