package by.bsu.sweet;

import by.bsu.sweet.logic.DivisionCalculator;
import by.bsu.sweet.model.Biscuits;
import by.bsu.sweet.model.Chocolates;
import by.bsu.sweet.model.Division;
import by.bsu.sweet.view.DivisionPrinter;

public class main {

    public static void main(String[] args) {
        Division division = new Division();
        Chocolates chocolates = new Chocolates("Dove",30,5,"3");
        Biscuits biscuits = new Biscuits("Cute",34,56,"8");
        division.add(chocolates);
        division.add(biscuits);

        DivisionPrinter printer = new DivisionPrinter();
        printer.print(division);
        DivisionCalculator calculator = new DivisionCalculator();
        double totalWeight =calculator.calculateTotalWeight(division);
        System.out.println("totalWeight = " + totalWeight);
        double totalPrice =calculator.calculateTotalPrice(division);
        System.out.println("totalPrice = " + totalPrice);

    }
}
