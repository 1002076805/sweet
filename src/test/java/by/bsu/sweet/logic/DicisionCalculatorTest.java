package by.bsu.sweet.logic;

import by.bsu.sweet.model.AbstractSweet;
import by.bsu.sweet.model.Biscuits;
import by.bsu.sweet.model.Chocolates;
import by.bsu.sweet.model.Division;
import org.junit.Assert;
import org.junit.Test;

public class DicisionCalculatorTest {
    @Test
    public  void testPrice(){
        Division division = new Division();
        Biscuits biscuits = new Biscuits("aaa",-50,90,"87");
        Chocolates chocolates = new Chocolates("defu",-90,90,"1");
        division.add(biscuits);
        division.add(chocolates);
        DivisionCalculator calculator = new DivisionCalculator();
        double priceTotal = calculator.calculateTotalPrice(division);
        Assert.assertEquals(-140,priceTotal,0.1);
        }

    @Test
    public  void testWeight(){
        Division division = new Division();
        Biscuits biscuits = new Biscuits("aaa",-50,90,"87");
        Chocolates chocolates = new Chocolates("defu",-90,90,"1");
        division.add(biscuits);
        division.add(chocolates);
        DivisionCalculator calculator = new DivisionCalculator();
        double priceWeight = calculator.calculateTotalWeight(division);
        Assert.assertEquals(180,priceWeight,0.1);
    }
    }


