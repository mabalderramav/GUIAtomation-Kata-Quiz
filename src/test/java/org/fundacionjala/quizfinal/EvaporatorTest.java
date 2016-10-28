package org.fundacionjala.quizfinal;

import org.junit.Assert;
import org.junit.Test;

import static org.fundacionjala.quizfinal.Evaporator.evaporator;
import static org.junit.Assert.assertEquals;

public class EvaporatorTest {
    @Test
    public void testEvaporatorOne() {
        Assert.assertEquals(22 , evaporator(10, 10, 10));
    }
    @Test
    public void testEvaporatorTwo() {
        Assert.assertEquals(29 , evaporator(10, 10, 5));
    }
    @Test
    public void testEvaporatorThree() {
        Assert.assertEquals(59 , evaporator(100, 5, 5));
    }
    @Test
    public void testEvaporatorFour() {
        Assert.assertEquals(37 , evaporator(50, 12, 1));
    }
    @Test
    public void testEvaporatorFive() {
        Assert.assertEquals(31 , evaporator(47.5, 8, 8));
    }
    @Test
    public void testEvaporatorSix() {
        Assert.assertEquals(459 , evaporator(100, 1, 1));
    }
    @Test
    public void testEvaporatorSeven() {
        Assert.assertEquals(459 , evaporator(10, 1, 1));
    }
    @Test
    public void testEvaporatorEight() {
        Assert.assertEquals(299 , evaporator(100, 1, 5));
    }
}
