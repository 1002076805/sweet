package by.bsu.sweet.model;

public class Chocolates extends AbstractSweet{
    private String chocolatesType;


    public Chocolates(String name, double price, double weight,String chocolatesType) {
        super(name, price, weight);
        this.chocolatesType = chocolatesType;
    }

    public String getChocolatesType() {
        return chocolatesType;
    }
}
