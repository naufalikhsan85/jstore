import java.util.ArrayList;

public class Jstore {


    public static void main(String[] args) {
        Location location1 = new Location("Jakarta", "Jakarta Utara", "Tanjung priok");
        try {
            DatabaseSupplier.addSupplier(new Supplier("Naufal", "naufal@gmail.com", "0240000002", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(new Supplier("Naufal75", "Naufal75@gmail.com", "0240000001", location1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseSupplier.addSupplier(DatabaseSupplier.getSupplier(1));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseCustomer.addCustomer(new Customer("Islamilenia", "Islamilenia@yahoo.com", "FebAkun", "12345", 2000, 04, 05));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(new Customer("Arum", "Arum@gmail.com", "wibubaubawang", "12345", 1999, 11, 06));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.addCustomer(DatabaseCustomer.getCustomer(1));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.addItem(new Item("Router 1941", ItemStatus.New, 4500000, DatabaseSupplier.getSupplier(1), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(new Item("Switch", ItemStatus.New, 70000000, DatabaseSupplier.getSupplier(2), ItemCategory.Electronics));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.addItem(DatabaseItem.getItemFromID(1));
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
            DatabaseSupplier.removeSupplier(100);
        } catch (SupplierNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseCustomer.removeCustomer(25);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getExMessage());
        }
        try {
            DatabaseItem.removeItem(77);
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


        ArrayList<Supplier> tempSupplier = DatabaseSupplier.getSupplierDatabase();
        for (Supplier temp : tempSupplier) {
            System.out.println(temp);
        }

        ArrayList<Customer> tempCustomer = DatabaseCustomer.getCustomerDatabase();

        for (Customer temp : tempCustomer) {
            System.out.println(temp);
        }

        ArrayList<Item> tempItem = DatabaseItem.getItemDatabase();
        for (Item temp : tempItem) {
            System.out.println(temp);
        }


    }

}

