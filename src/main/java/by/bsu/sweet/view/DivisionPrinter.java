package by.bsu.sweet.view;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.Division;

import java.util.List;

    public class DivisionPrinter {

    public  void print(Division division){
        List<AbstractSweet> sweets = division.getSweets();

        for (AbstractSweet sweet : sweets){
            System.out.println("NAME  = " + sweet.getName() );
            System.out.println("Weight = " + sweet.getWeight());
            System.out.println("Price = " + sweet.getPrice());
        }
    }
}
