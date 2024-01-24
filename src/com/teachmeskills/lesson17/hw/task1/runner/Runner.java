package com.teachmeskills.lesson17.hw.task1.runner;

import com.teachmeskills.lesson17.hw.task1.aplication.Application;

/**
 * Create a generalized functional interface.
 * Write a class with one method.
 * In this method, implement the logic:
 * - if the number 1 is entered into the console,
 * then: use an interface with a string type and
 * pass the line reversal logic (outputting the line in reverse order) to the interface method.
 * - if the number 2 is entered into the console,
 * then: use an interface with an integer type and
 * pass the logic for finding the factorial of the number to the interface method.
 */
public class Runner {
    public static void main(String[] args) {
        Application.operation();
    }
}
