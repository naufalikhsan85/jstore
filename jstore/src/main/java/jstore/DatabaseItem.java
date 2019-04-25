package jstore;import java.util.ArrayList;
/**
 * Program ini merupakan class DatabaseItem yang berisi data dan informasi yang
 * berkaitan dengan DatabaseItem
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class DatabaseItem{
	
    private static ArrayList<Item> ITEM_DATABASE;
    private static int LAST_ITEM_ID = 0;
   //temporary variable
    private static ArrayList<Item> tempList;
    /**
     * Constructor for objects of class DatabaseItem
     */
    public DatabaseItem()
    {
    }
    
    public static ArrayList<Item> getItemDatabase()
    {
          return ITEM_DATABASE; 
    }

    public static int getLastItemId()
    {
           return LAST_ITEM_ID; 
    }

    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        for (Item itemDB1 : ITEM_DATABASE ) {
            if(((itemDB1.getName().equals(item.getName())) && (itemDB1.getStatus() == item.getStatus()) &&
                    (itemDB1.getSupplier() == item.getSupplier()) && (itemDB1.getSupplier() == item.getSupplier()))){
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }
  
    public static Item getItemFromID(int id)
   {
      for (Item item : ITEM_DATABASE) {
            if (item.getId() == id) {
                return item;
            } 
        }
        return null;
  }
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
  {
      for(Item item: ITEM_DATABASE){
      if(item.getSupplier() == supplier){
      tempList.add(item);  
      } else {
      return null;
      }
      }
      return tempList;
  }
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
   {
      for(Item item: ITEM_DATABASE){
      if(item.getCategory() == category){
      tempList.add(item);  
      } else {
      return null;
      }
      }
      return tempList;
  }
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
  {
        
      for(Item item: ITEM_DATABASE){
      if(item.getStatus() == status){
      tempList.add(item);  
      } 
      }
      return tempList;
  }

    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId() == id)
            {
                ITEM_DATABASE.remove(id);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }
}