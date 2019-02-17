package main.java;

public final class Item {
        private int key;
        
        //constructor
        public Item(int keyValue) { 
                key = keyValue;
        }
        
        // further components and methods
        public void setKey(int keyValue) {
        		key = keyValue;
        }
        
        public int getKey() {
        		return key;
        }
}