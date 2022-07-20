public class Item {
    
    // MEMBER VARIABLES
    private String name;
    private double price;
    
    // CONSTRUCTOR
    //   Takes a name and price as arguments 
    //   and sets them accordingly
    public Item(String name, double price){
    this.name = name;
    this.price = price;
    }
    // GETTERS & SETTERS  - for name and price
    public String nameGetter() {
    return this.name;
    }

    public void nameSetter(String name){
    this.name = name;
    }

    public double priceGetter(){
    return this.price;
    }

    public void priceSetter(double price){
    this.price=price;
    }   

}
