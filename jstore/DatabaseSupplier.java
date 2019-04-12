import java.util.ArrayList;
/**
 * Program ini merupakan class DatabaseSupplier yang berisi data dan informasi yang
 * berkaitan dengan DatabaseSupplier.
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */
    public class DatabaseSupplier{
   private static ArrayList<Supplier> SUPPLIER_DATABASE;
   private static int LAST_SUPPLIER_ID = 0;
   private static boolean temp;
   private static Supplier tempSupp;

  public static ArrayList<Supplier> getSupplierDatabase()
  {
  return SUPPLIER_DATABASE; 
  }



  public static int getLastSupplierId()
  {
   return LAST_SUPPLIER_ID; 
  } 

  public static boolean addSupplier(Supplier supplier)
  {
    for(Supplier sup: SUPPLIER_DATABASE){
        if(supplier.getName() == sup.getName() || supplier.getEmail() == sup.getEmail() || supplier.getPhoneNumber() == sup.getPhoneNumber()){
        return false;
        }    
    }
    SUPPLIER_DATABASE.add(supplier);
    return true;
   }

}
