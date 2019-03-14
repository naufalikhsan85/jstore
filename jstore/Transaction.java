/**
 * Write a description of class Transaction here.
 *
 * @author (Naufal Ikhsan)
 * @version (a version number or a date)
 */
public class Transaction
{

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void orderNewItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.New;
        Item barang = new Item(8, "Handphone", 10, 15000, status, supplier,category);
        DatabaseItem.addItem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(7, barang, "14 Maret 2019", barang.getPrice(), status1);
        barang.setStatus(status);
        pesan.setInvoiceStatus(status1);
        barang.printData();
        pesan.printData();
    }
    
    public static void orderSecondItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.Second;
        Item barang = new Item(9, "Komputer", 10, 15000, status, supplier, category);
        DatabaseItem.addItem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(8, barang, "14 Maret 2019", barang.getPrice(), status1);
        barang.setStatus(status);
        pesan.setInvoiceStatus(status1);
        barang.printData();
        pesan.printData();
        
    }
    
    public static void orderRefurbishedItem(Supplier supplier)
    {
        ItemCategory category = ItemCategory.Electronics;
        ItemStatus status = ItemStatus.Refurbished;
        Item barang = new Item(10, "Komputer", 10, 15000, status, supplier, category);
        DatabaseItem.addItem(barang);
        InvoiceStatus status1 = InvoiceStatus.Paid;
        Invoice pesan = new Invoice(9, barang, "14 Maret 2019", barang.getPrice(), status1);
        barang.setStatus(status);
        pesan.setInvoiceStatus(status1);
        barang.printData();
        pesan.printData();
    }
    
      public static void sellItemPaid(Item item){
        InvoiceStatus statusInvoice2 = InvoiceStatus.Paid;
        ItemStatus statusItem2 = ItemStatus.Sold;
        Invoice pesan2 = new Invoice(2, item, "14 Maret 2019", item.getPrice(), statusInvoice2);
        pesan2.setInvoiceStatus(statusInvoice2);
        item.setStatus(statusItem2);
        pesan2.printData();
    }
    public static void sellItemUnpaid(Item item){
        InvoiceStatus statusInvoice3 = InvoiceStatus.Unpaid;
        ItemStatus statusItem3 = ItemStatus.Sold;
        Invoice pesan3 = new Invoice(3, item, "14 Maret 2019", item.getPrice(), statusInvoice3);
        pesan3.setInvoiceStatus(statusInvoice3);
        item.setStatus(statusItem3);
        pesan3.printData();
    }
    public static void sellItemInstallment(Item item){
        InvoiceStatus statusInvoice4 = InvoiceStatus.Installment;
        ItemStatus statusItem4 = ItemStatus.Sold;
        Invoice pesan4 = new Invoice(4, item, "14 Maret 2019", item.getPrice(), statusInvoice4);
        pesan4.setInvoiceStatus(statusInvoice4);
        item.setStatus(statusItem4);
        pesan4.printData();
    }
}
