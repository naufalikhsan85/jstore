package jstore;


import java.util.*;
public class Database_Item
{
    // instance variables - replace the example below with your own

    private static ArrayList<Item> ITEM_DATABASE = new ArrayList<>();
    private static int LAST_ITEM_ID = 0;

    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        boolean value=false;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(item.getName()==itemDB.getName()&&item.getStatus()==itemDB.getStatus()||item.getSupplier()==itemDB.getSupplier())
            {
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID=item.getId();
        return true;
    }
    
    public static Item getItemFromID(int id)
    {
        Item value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                value=itemDB;
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getSupplier()==supplier)
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getCategory()==category.getCategory())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> value=null;
        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getStatus()==status.getStatus())
            {
                value.add(itemDB);
            }
        }
        return value;
    }
    
    public static boolean removeItem(int id) throws ItemNotFoundException
    {

        for(Item itemDB : ITEM_DATABASE)
        {
            if(itemDB.getId()==id)
            {
                ITEM_DATABASE.remove(id);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }

   

}
