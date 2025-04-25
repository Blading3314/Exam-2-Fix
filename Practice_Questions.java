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
        //findHighestTemp(temperatures);
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
    if (c == v){
        return true;
    } else{
        return false;
    }
    
    }
    //Question 25
 /*public void findHighestTemp (ArrayList<Double> temperatures){
    int count = 0;
    double max = 0;
    for (int i = 0; i > Collections.max; i++){
        System.out.println("Highest case of fever: " + max);
        
    }
    System.out.println("Number of fever cases reported: " + count);
    
        /*int i = 0;
        while(i >temp){
            i++; 
        }
        if (i > 37.5 && temp < Collections.max) {
            System.out.println(i+"are greater than 37.5");
            System.out.println("Max:" +temp);
        }
        */
        //Question 26 
       /* for (int i = 0; i >temp && i< Collections.max; i++){
             System.out.println("Max:" + i);
        }
        //Question 27
         for (int i = 0; i >temp && i< Collections.sort; i++){
             System.out.println("Max:" + i);
    }
    */
}



