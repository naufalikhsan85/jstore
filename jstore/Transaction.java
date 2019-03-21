/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class Transaction
{
    public static void orderNewItem(Item item){
        Invoice invoiceNewItem = new Buy_Paid(11, item, "13/12/2019", 13, item.getPrice());
        
        if (invoiceNewItem instanceof Sell_Paid)
        {
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
       
    }

    public static void orderSecondItem (Item item){
        Invoice invoiceSecondItem = new Buy_Paid(12, item, "13/12/2019", 14, item.getPrice());
        
        if (invoiceSecondItem instanceof Sell_Paid)
        {
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }

    }
    public static void orderRefurbishedItem(Item item){
        Invoice invoiceRefurbishedItem = new Buy_Paid(13,item, "13/12/2019", 15, item.getPrice());
        
        if (invoiceRefurbishedItem instanceof Sell_Paid)
        {
            System.out.println("Benar, Invoice Type adalah Sell_Paid");
        }
        else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }

    }
    public static void sellItemPaid(Item item){
        Invoice invoiceSelItemPaid = new Sell_Paid(14, item, "13/12/2019", 16, item.getPrice());
        ItemStatus itemstatus1 = ItemStatus.Sold;
        item.setStatus(itemstatus1);
        item.printData();

    }
    public static void sellItemUnpaid(Item item){
        Invoice invoiceSellItemUnpaid = new Sell_Unpaid(14, item, "13/12/2019", 16, item.getPrice(), "14/12/2019");
        ItemStatus itemstatus1 = ItemStatus.Sold;
        item.setStatus(itemstatus1);
        item.printData();
        
    }
    public static void sellItemInstallment(Item item){
        Invoice invoiceSellItemInstallment = new Sell_Installment(14, item, "13/12/2019", 16, item.getPrice(), 13);
        ItemStatus itemstatus1 = ItemStatus.Sold;
        item.setStatus(itemstatus1);
        item.printData();
        
    }


}