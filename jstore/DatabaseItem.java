
/**
 * Write a description of class Database_Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseItem{
    private String listItem[];
    private Item item;

    public DatabaseItem(){
    }
    
    public boolean addItem(Item item){
     return true;
    }
    
    public boolean removeItem(Item item){
     return true;
    }
    
    public Item getItem(){
     return item;
    }

    public String[] getItemDatabase(){
     return listItem;
    }
}