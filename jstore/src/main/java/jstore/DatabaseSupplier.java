package jstore;    import java.util.ArrayList;
    /**
     * Program ini merupakan class DatabaseSupplier yang berisi data dan informasi yang
     * berkaitan dengan DatabaseSupplier.
     *
     * @author (Naufal Ikhsan)
     * @version (28/02/2019)
     */
       public class DatabaseSupplier {
        private static ArrayList<Supplier> SUPPLIER_DATABASE;
        private static int LAST_SUPPLIER_ID = 0;
        private static int supplier;

        /**
         * private static boolean temp;
         * private static Supplier tempSupp;
         */

        public static ArrayList<Supplier> getSupplierDatabase() {
            return SUPPLIER_DATABASE;
        }


        public static int getLastSupplierId() {
            return LAST_SUPPLIER_ID;
        }

        public static Supplier getSupplier(int id) {
            Supplier hasil = null;
            for (Supplier supplier1 : SUPPLIER_DATABASE) {
                if (supplier1.getId() == id) {
                    hasil = supplier1;
                }
            }
            return hasil;
        }



        public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException {

            for (Supplier supplierDB : SUPPLIER_DATABASE) {
                if (supplier.getEmail().equals(supplierDB.getEmail()) ||
                        supplier.getPhoneNumber().equals(supplierDB.getPhoneNumber())) {
                    throw new SupplierAlreadyExistsException(supplier);
                }
            }
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID = supplier.getId();
            return true;
        }


        public static boolean removeSupplier(int id) throws SupplierNotFoundException
        {
            try {
                for (Supplier i : SUPPLIER_DATABASE
                ) {
                    if (i.getId() == id) {
                        DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(i));
                        SUPPLIER_DATABASE.remove(i);
                        return true;
                    }
                }
                throw new SupplierNotFoundException(id);
            }
            catch (SupplierNotFoundException E){
                System.out.println(E.getExMessage());
                return false;
            }

        }
    }