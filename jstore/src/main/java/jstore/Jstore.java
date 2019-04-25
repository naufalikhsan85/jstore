package jstore;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication


public class JStore
{
    
    
    public static void main(String [] args)
    {
        SpringApplication.run(JStore.class, args);


        Location location1 = new Location("Jakarta","DKI Jakarta","Tanjung Priok");
        try {
            Database_Supplier.addSupplier(new Supplier("NaufalIkhsan11","Naufal77@gmail.com", "087893520752", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Supplier.addSupplier(new Supplier("Annisa","Annisa@gmail.com", "087883570752", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Supplier.addSupplier(new Supplier("Ananta","Ananta@gmail.com", "087888520752", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Supplier.addSupplier(Database_Supplier.getSupplier(1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }


        try {
            Database_Item.addItem(new Item("TRAFO", ItemStatus.New, 4500000, Database_Supplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Item.addItem(new Item("SOLDER", ItemStatus.New, 70000000, Database_Supplier.getSupplier(2), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Item.addItem(new Item("GENSET", ItemStatus.New, 89000000, Database_Supplier.getSupplier(3), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Item.addItem(Database_Item.getItemFromID(1));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }


        /*try {
            DatabaseCustomer.addCustomer(new Customer("Jamaludin Akbar", "jamalunta@rocketmail.com", "Jamal.Unta", "ciscoenpa55", 1998, 01, 01));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(new Customer("Cahyadi Bayu", "bayaya@rocketmail.com", "Bayuyu", "ciscoconpa55", 1998, 02, 02));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(DatabaseCustomer.getCustomer(1));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            Database_Item.addItem(new Item("Router 1941", ItemStatus.New, 4500000, Database_Supplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Item.addItem(new Item("Switch", ItemStatus.New, 70000000, Database_Supplier.getSupplier(2), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Item.addItem(Database_Item.getItemFromID(1));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        ArrayList<Integer> item = new ArrayList<Integer>();
        item.add(1);
        item.add(1);
        item.add(1);

        try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item, DatabaseCustomer.getCustomer(1)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.addInvoice(new Sell_Installment(item, 10, DatabaseCustomer.getCustomer(2)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.addInvoice(DatabaseInvoice.getInvoice(1));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            Database_Supplier.removeSupplier(100);
        } catch (SupplierNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.removeCustomer(25);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            Database_Item.removeItem(77);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseInvoice.removeInvoice(69);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseInvoice.getActiveOrder(DatabaseCustomer.getCustomer(1));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }




        ArrayList<Supplier> tempSupplier = Database_Supplier.getSupplierDatabase();
        for(Supplier temp: tempSupplier){
            System.out.println(temp);
        }

        ArrayList<Customer> tempCustomer = DatabaseCustomer.getCustomerDatabase();

        for(Customer temp: tempCustomer)
        {
            System.out.println(temp);
        }

        ArrayList<Item> tempItem= Database_Item.getItemDatabase();
        for(Item temp: tempItem)
        {
            System.out.println(temp);
        }

         */


    }


    public JStore()
    {
         
    }

    
    
    
}
