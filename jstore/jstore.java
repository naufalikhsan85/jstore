
/**
 * Program ini merupakan class Jstore yang berisi data dan informasi yang
 * berkaitan dengan JStore
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
public class Jstore
{
        // instance variables - replace the example below with your own
        public static void main(String[] args){
      
         Location location1 = new Location("DKI Jakarta", "Zona Merah", "Jakarta");
        Supplier supplier1 = new Supplier(1, "naufal", "naufal@gmail.com", "081310275390", location1);      
        
        location1.printData();
        supplier1.printData();
        
        Transaction.orderNewItem(supplier1);
        Transaction.sellItemPaid(DatabaseItem.itemDB);
        Transaction.orderSecondItem(supplier1);
        Transaction.sellItemUnpaid(DatabaseItem.itemDB);
        Transaction.orderRefurbishedItem(supplier1);
        Transaction.sellItemInstallment(DatabaseItem.itemDB);
}
    /**
     * Constructor for objects of class Jstore
     */
    public Jstore()
    {
    
    }

    
    

    
}

