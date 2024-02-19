import javax.swing.JOptionPane;
public class DemoMagazine
{
    
    public static void main(String[] args )
    {
        //declare an array
        Magazine[] magazineArr = new Magazine[2];
        
        String title, material;
        int pages;
        
        for ( int i = 0; i < magazineArr.length; i++)
        {
            title = JOptionPane.showInputDialog("Enter the title for Magazine " + (i+1) + " : ");
            pages = Integer.parseInt(JOptionPane.showInputDialog("Enter the magzine number of pages : "));
            material = JOptionPane.showInputDialog("Choose the hard cover material P = Plastic or W = Wood");
            
            if(material.equalsIgnoreCase("P"))
                material = "Plastic";
            else if(material.equalsIgnoreCase("W"))
                material = "Wood";
            
            //create object option 1
            magazineArr[i] = new Magazine(title, pages, material);
            
            //create object option 2
            //Instantiate each element of the array 
            //magazineArr[i] = setMagazine (title, pages, material);
            
            //call the toString method
            System.out.println(magazineArr[i].toString());
        }
        
        int countP = 0, countW = 0;
        
        for(int i = 0; i < magazineArr.length; i ++) 
        {
            if(magazineArr[i].getMaterial().equalsIgnoreCase("Plastic"))
                countP++; // will count plastic to the size of array
            else if(magazineArr[i].getMaterial().equalsIgnoreCase("Wood"))
                countW++; // will count wood to the size of array
            else
                System.out.println("Incorrect material type");
        }
        
        JOptionPane.showMessageDialog(null,"Count for Plastic material: "+ countP, "OUTPUT" , JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Count for Wood material: " + countW, "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
        
        int foundAtIndex = 0;
        boolean found = false;
        
        for(int i = 0; i < magazineArr.length; i++)
        {
            if(magazineArr[i].getTitle().equalsIgnoreCase("Impiana"))
            {
                found = true;
                foundAtIndex = i;
            }
        }
        
        if(found == true)
        {
            magazineArr[foundAtIndex].setMagazine("Impiana",300,"Wood");
            JOptionPane.showMessageDialog(null,magazineArr[foundAtIndex].toString(), "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
        }else
            JOptionPane.showMessageDialog(null,"Sorry, the flower that you are searching for is not in the inventory", "OUTPUT", JOptionPane.INFORMATION_MESSAGE);
            
        // Update the flower details after restocking
        StringBuilder flowerDetailsAfterRestock = new StringBuilder("UPDATED FLOWER DETAILS\n");
        for (FlowerClass flower : invFlowers) 
        {
            flowerDetailsAfterRestock.append(flower.toString()).append("\n");
        }
        //display the new inventory after restocking flower
        JOptionPane.showMessageDialog(null, flowerDetailsAfterRestock.toString());

    }
    
}
