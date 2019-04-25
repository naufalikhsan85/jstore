package jstore.Controller;

import jstore.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

public class ItemController

{
    @RequestMapping(value= "/itemlist/", method= RequestMethod.GET)
    public ArrayList<Item> itemlist()
    {
        ArrayList<Item> tempDatabaseItem = Database_Item.getItemDatabase();
        return tempDatabaseItem;
    }
    @RequestMapping(value= "/items/{id_item}", method= RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id)
    {
        Item tempItem = Database_Item.getItemFromID(id);
        return tempItem;
    }

}
