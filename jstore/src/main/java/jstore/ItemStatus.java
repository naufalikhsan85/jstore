package jstore;

public enum ItemStatus {

    New {
        public String toString() {
            return "New";
        }
    }
    ,
    Second {
        public String toString() {
            return "Second";
        }
    }
    ,
    Refurbished {
        public String toString() {
            return "Refurbished";
        }
    }
    ,
    Sold {
        public String toString() {
            return "Sold";
        }
    }
}