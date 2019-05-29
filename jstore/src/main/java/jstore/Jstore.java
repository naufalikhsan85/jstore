package jstore;

import java.util.ArrayList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication

public class JStore{
    
    public static void main(String[] args){



        Location lokasi1 = new Location("DKI JAKARTA", "TANJUNG PRIOK", "Ya lyubyu tebya");

        try {
            //Create 3 Supplier
            DatabaseSupplier.addSupplier(new Supplier("naufalikhsan75", "naufalikhsan75@gmail.com", "087883520752", lokasi1));
           // DatabaseSupplier.addSupplier(new Supplier("naufal.ikhsan", "naufal.ikhsan@gmail.com", "089619777364", lokasi1));
            //DatabaseSupplier.addSupplier(new Supplier("naufalikhsan85", "naufalikhsan85@gmail.com", "087883520752", lokasi1));
        } catch (SupplierAlreadyExistsException e) {
            e.getExMessage();
        }



        try {
            DatabaseItem.addItem(new Item(" LAPTOP", 1000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item(" TABLET", 2000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item(" HANDPHONE", 3000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item(" SMARTTV", 4000, ItemCategory.Electronics, ItemStatus.New, DatabaseSupplier.getSupplier(1)));
        } catch (ItemAlreadyExistsException e) {
            e.getExMessage();
        }

        for (Supplier supplierPtr : DatabaseSupplier.getSupplierDatabase()){
            System.out.println(supplierPtr);
        }

        for (Item itemPtr : DatabaseItem.getItemDatabase()){
            System.out.println(itemPtr);
        }




        SpringApplication.run(JStore.class, args);


    }

       /**
     * Constructor for objects of class JStore
     */
    
    
    public JStore(){   
      
    }
}
