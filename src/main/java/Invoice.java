/*
Created by: Rihards Dzerkals, group 1.

Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store. An Invoice should include four data members—a
part number (type string), a part description (type string), a quantity of the item being purchased (type int) and a price per item (type int).
Your class should have a constructor that initializes the four data members. Provide a set and a get function for each data member.
In addition, provide a member function named getInvoiceAmount that calculates the invoice amount (i.e., multiplies the quantity by the price per item),
then returns the amount as an int value. If the quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to 0.
Write a test program that demonstrates class Invoice’s capabilities.
 */

public class Invoice {

    private String partNumber;
    private String description;
    private int quantity;
    private int price;


    public Invoice(String partNumber, String description, int quantity, int price) {
        this.partNumber = partNumber;
        this.description = description;
        if(quantity < 0){
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
        if(price < 0){
            this.price = 0;
        } else {
            this.price = price;
        }


    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if(quantity < 0){
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if(price < 0){
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getInvoiceAmount(){
        return this.quantity * this.price;
    }
}
