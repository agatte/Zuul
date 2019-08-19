/**
 * Write a description of class Item here.
 * 
 * @author Anthony Gatte
 * @version 3/18/1
 */


import java.util.HashMap;
import java.util.ArrayList;

public class Item
{
    // instance variables - replace the example below with your own
    private String description;
    private int weight;
    
    private ArrayList<Item> list = null;
   
    /**
     * Constructor for objects of class Item
     */
    public Item (String description, int weight)
    {
        // initialise instance variables
        this.description = description;
        weight = weight;
    }
    
    public String getShortDescription() {
        return description;
    }

    public int weight() {
        return weight;
    }
    
    public String toString()
    {
        return "Item " + description + " Weight " + weight;
    }
    
    public void addItem(String description,int weight)
    {
        list.add(new Item (description, weight));
    }
    
    public void add(Item aItem)
    {
        list.add(aItem);
    }
    
    public ArrayList<Item> getItems()
    {
        return list;
    }
    
    public String getItemString()
    {
        
        String returnString = "Item:";
            {
             returnString += " " + list;
            }
        return returnString;
       
    }
}