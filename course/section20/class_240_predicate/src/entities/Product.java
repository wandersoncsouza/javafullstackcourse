package entities;

public class Product {
    private String name;
    private Double price;

    public Product(String name, Double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    // Implementando usando method reference static (referencia para método estatico)
    public static boolean staticProductPredicate(Product p){
        return p.getPrice() >= 100;
    }

    /// Implementando usando method reference nonstatic (referencia para método não estatico)
    public boolean nonStaticProductPredicate(){
        return price >= 100;
    }

    @Override
    public String toString() {
        return name + ", " + String.format("%.2f", price);
    }

    
    
}
