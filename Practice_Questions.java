import java.util.*;
import java.util.Collections;
/**
 * Write a description of class Practice24 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Practice_Questions
{
    // instance variables - replace the example below with your own
    private int x;
    /**
     * Constructor for objects of class Practice24
     */
    public Practice_Questions()
    {
        // initialise instance variables
        x = 0 ;
        ArrayList temperatures = new ArrayList <Double>();
        temperatures.add(34.5);
        temperatures.add(40.3);
        temperatures.add(80.1);
        temperatures.add(60.9);
        temperatures.add(38.9);
        temperatures.add(42.4);
        findHighestTemp(temperatures);
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public boolean compareStrings()
    { //Question 24
    String c = "car";
    String v = "truck";
    if (c.equals(v)){
        return true;
    } else{
        return false;
    }
    
    }
    //Question 25
 public void findHighestTemp (ArrayList<Double> temperatures){
    int count = 0;
    double max = 0;
    for (Double temp : temperatures){
        if(temp > 37.5){
            count++;
        }
        if ( temp > max) {
         max = temp;
        }
     
    }
    System.out.println("Number of fever cases reported: " + count);
    //System.out.println("Highest case of fever: " + max);
    //Question 26 - using Collections.max    
    //System.out.println("Highest case of fever: " + Collections.max(temperatures));
    // Question 27 - using Collections.sort
    Collections.sort(temperatures);
    System.out.println("Highest case of fever: " + temperatures.get(temperatures.size()-1));
}
}



