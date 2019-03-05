
/**
 * Program ini merupakan class DatabaseItem yang berisi data dan informasi yang
 * berkaitan dengan DatabaseItem
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class DatabaseItem{
	// instance variables //
    private String listItem[];
    private Item item;
	/**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem(){
    }
    /**
     * method untuk menambahkan data class Item
	 * @return true
	 * @param item
     */
    public boolean addItem(Item item){
     return true;
    }
     /**
     * method untuk mengurangi data class Item
	 * @return true
	 * @param item
     */
    public boolean removeItem(Item item){
     return true;
    }
     /**
     * method untuk mengambil data class Item
	 * @return item
     */
    public Item getItem(){
     return item;
    }
	 /**
     * method untuk mengambil ItemDatabase
	 * @return listItem
     */
    public String[] getItemDatabase(){
     return listItem;
    }
}