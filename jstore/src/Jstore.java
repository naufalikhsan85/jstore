
/**
 * Program ini merupakan class Jstore yang berisi data dan informasi yang
 * berkaitan dengan JStore
 *
 * @author (Naufal Ikhsan)
 * @version (28/02/2019)
 */

import java.util.ArrayList;
public class Jstore
{


      public Jstore(){
    
   }
   public static void main (String[] args){
      Location jakarta = new Location("Jakarta Utara","DKI Jakarta","Jakarta yang ada di utara");
      /**Supplier supplier1 = new Supplier(1,"Supply Com","supplyco@ui.ac.id","+62081213959099",jakarta);
      Supplier supplier2 = new Supplier(2,"Supply Com1","supply3@ui.ac.id","+6287883520752",jakarta);
      Supplier supplier3 = new Supplier(3,"Supply Com2","supply3@ui.ac.id","+6289631289",jakarta);*/
      DatabaseSupplier.addSupplier(new Supplier("Supply Com","supplyco@ui.ac.id","+62081213959099",jakarta));
      DatabaseSupplier.addSupplier(new Supplier("Supply Com1","supply2@ui.ac.id","+6287883520752",jakarta));
      DatabaseSupplier.addSupplier(new Supplier("Supply Com2","supply3@ui.ac.id","+6289631289",jakarta));
      /**String name,String email,String username, String password,int id,int year,int month,int dayOfMonth*/
      DatabaseCustomer.addCustomer(new Customer("naufal","naufal@mail","naufal1","1234",2019,4,24));
      DatabaseCustomer.addCustomer(new Customer("naufal11","naufal1@mail","naufal2","1234",2020,5,25));
      DatabaseCustomer.addCustomer(new Customer("naufal22","naufal2@mail","naufal3","1234",2021,6,26));
      /**String name,int stock,int price,ItemStatus status,Supplier supplier,ItemCategory category*/
      //DatabaseItem.addItem(new Item("motor","2","1000",ItemStatus.New,DatabaseSupplier.getSupplier(1), ItemCategory.Furniture));
      //DatabaseItem.addItem(new Item("motor1","3","2000",ItemStatus.New,DatabaseSupplier.getSupplier(2), ItemCategory.Furniture));
      //DatabaseItem.addItem(new Item("motor2","4","3000",ItemStatus.New,DatabaseSupplier.getSupplier(3), ItemCategory.Furniture));
      
      
      ArrayList<Supplier> tempSupplier = DatabaseSupplier.getSupplierDatabase();
      for(Supplier temp: tempSupplier)
      {
          System.out.println(temp);
          
        }
      
        
      ArrayList<Customer> tempCustomer= DatabaseCustomer.getCustomerDatabase();
      for(Customer temp: tempCustomer)
      {
          System.out.println(temp);
          
        }
      
      /**System.out.println(supplier1);
      System.out.println(supplier2);**/
      
      
      
    }
    

    
}

