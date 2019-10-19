package com.mainacad;

import com.mainacad.multiply.Multiply;

import java.util.Scanner;
import java.util.logging.Logger;

public class ApplicationRunner {
    private static final Logger LOGGER = Logger.getLogger(ApplicationRunner.class.getName());
    public static void main(String[] args) {
        long  multiply1 = 0;
        long  multiply2 = 0;
        Scanner scanner = new Scanner(System.in);
        LOGGER.info("Input Number 1: ");
        multiply1 = Long.parseLong(scanner.nextLine()); // считывает данные с клавиатуры
        LOGGER.info("Input Number 2: ");
        multiply2 = Long.parseLong(scanner.nextLine()); // считывает данные с клавиатуры

        Multiply multiply = new Multiply();
        multiply.setMult1(multiply1);
        multiply.setMult2(multiply2);

        LOGGER.severe(System.getProperty("line.separator") +
                            "Multiply result: " +
                            System.getProperty("line.separator") +
                            multiply.getMultiply());
    }

}
