package com.example.education_management_api.dto;

import java.util.List;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    @Test
    public void testAdd() {
        int a = 10;
        int b = 20;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        Assert.assertEquals(result, 30);
        // not equal
        // sosanh true
        // sosanh false
    }

    @Test
    public void testAdd_2() {
        int a = 0;
        int b = 20;
        Calculator calculator = new Calculator();
        int result = calculator.add(a, b);
        Assert.assertEquals(result, 20);
    }

    @Test
    public void testIsEvenNumber() {
        Calculator calculator = new Calculator();
        boolean result = calculator.isEvenNumber(1);
        Assert.assertTrue(result);
    }

    @Test
    public void testCountEvenNumbers() {
        Calculator calculator = new Calculator();
        // List chứa toàn số chẵn: 2, 4, 6
        int count = calculator.countAmountEvenNumber(List.of(2, 4, 6));
        Assert.assertEquals(count, 3);

        // List chứa toàn số lẽ: 1, 3, 5
        count = calculator.countAmountEvenNumber(List.of(1, 3, 5));
        Assert.assertEquals(count, 0);

        // List chứa hỗn hop : 1, 6, 5
        count = calculator.countAmountEvenNumber(List.of(1, 6, 5));
        Assert.assertEquals(count, 1);
    }




}
