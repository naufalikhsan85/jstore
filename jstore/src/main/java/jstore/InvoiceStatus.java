package jstore;

public enum InvoiceStatus {

    Paid {
         public String toString() {
             return "Paid";
         }
     }
     ,
     Unpaid {
         public String toString() {
             return "Unpaid";
         }
     }
     ,
     Installment {
         public String toString() {
             return "Installment";
         }
     }
 
 }