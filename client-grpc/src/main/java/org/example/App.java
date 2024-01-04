package org.example;

import org.example.services.CalculatorService;

public class App
{
    public static void main( String[] args ) {
        CalculatorService service = new CalculatorService();

        System.out.println(service.fold(2, 3)); // 5
        System.out.println(service.multiply(2, 5)); // 10
        System.out.println(service.divide(45, 5)); // 9
        System.out.println(service.subtract(45, 5)); // 40
    }
}
