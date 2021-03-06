package models;


import java.util.UUID;

public class Item {
    private String id;
    private String itemName;
    private double itemPrice;
    private double itemWeight;
    private boolean purchased;
    private boolean packed;
    private int quantity;


    //Constructor
    public Item(String itemName, double itemPrice, double itemWeight) {
        this.id = UUID.randomUUID().toString();
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemWeight = itemWeight;
        this.purchased = false;
        this.packed = false;
        this.quantity = 0;
    }

    //Setters
    public void setPacked() {
        this.packed = !packed;
    }
    public void setPurchased() {
        this.purchased = !purchased;
    }

    public void setQuantity(int quantity) {
        this.quantity += quantity;
    }

    //Getters
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public double getItemWeight() {
        return itemWeight;
    }

    public boolean isPurchased() {
        return purchased;
    }

    public boolean isPacked() {
        return packed;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getId() {
        return id;
    }
}
