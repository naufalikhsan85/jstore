
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
      
        ItemStatus status = ItemStatus.New;
        ItemCategory kategori = ItemCategory.Electronics;
        Location lokasi = new Location("Jakarta", "DKI Jakarta", "Tanjung priok");
        Supplier baru = new Supplier(1, "Naufal", "naufal.ikhsan@ui.ac.id", "0878883520752", lokasi);
        lokasi.printData();
        baru.printData();
        Item barang = new Item(1,"Playstation",1,12000000,status,baru, kategori);
        
        
        DatabaseItem.addItem(barang);
        Transaction.orderNewItem(DatabaseItem.getItem());
        Transaction.orderSecondItem(DatabaseItem.getItem());
        Transaction.orderRefurbishedItem(DatabaseItem.getItem());
        Transaction.sellItemPaid(DatabaseItem.getItem());
        Transaction.sellItemUnpaid(DatabaseItem.getItem());
        Transaction.sellItemInstallment(DatabaseItem.getItem());
}
    /**
     * Constructor for objects of class Jstore
     */
    public Jstore()
    {
    
    }

    
    

    
}

