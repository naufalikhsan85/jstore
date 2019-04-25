package jstore.Controller;
import jstore.*;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;

public class SupplierController {

    @RequestMapping(value= "/supplierlist/", method= RequestMethod.GET)
    public ArrayList<Item> supplierlist()
    {
        ArrayList<Item> tempDatabasesupplier = Database_Item.getItemDatabase();
        return tempDatabasesupplier;

    }

    @RequestMapping(value= "/suppliers/{id_supplier}", method= RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id)
    {
        Supplier tempSupplier = Database_Supplier.getSupplier(id);
        return tempSupplier;
    }
}

