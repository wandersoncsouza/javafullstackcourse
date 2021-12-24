package entities;

import java.text.SimpleDateFormat;
import java.util.*;

public class UsedProduct extends Product {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date manufacturedDate;
    
    // public UsedProduct(){
    //     super();
    // }
    public UsedProduct(String name, Double price,Date manufacturedDate){
        super(name, price);
        this.manufacturedDate = manufacturedDate;
    }

    public Date getManufactDate(){
        return manufacturedDate;
    }
    public void setManufacturedDate(Date manufacturDate){
        this.manufacturedDate = manufacturDate;
    }

    @Override
    public String priceTag(){
        return getName()
            + "(used) $"
            + String.format("%.2f", getPrice())
            + "(Manufactured date: "
            + sdf.format(manufacturedDate)
            +")";
    }
}
