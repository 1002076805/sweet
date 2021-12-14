package by.bsu.sweet.model;

public class Biscuits extends AbstractSweet{

    private String quality;


    public Biscuits(String name, double price, double weight,String quality) {
        super(name, price, weight);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}
