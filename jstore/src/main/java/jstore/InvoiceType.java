package jstore;

public enum InvoiceType
{
    Buy {
        public String toString() {
            return "Buy";
        }
    }
    ,
    Sell {
        public String toString() {
            return "Sell";
        }
    }
 
}
