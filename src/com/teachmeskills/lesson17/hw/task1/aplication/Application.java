package com.teachmeskills.lesson17.hw.task1.aplication;

import com.teachmeskills.lesson17.hw.task1.functional.FunctionalI;

import java.util.Scanner;

public class Application {
    public static void operation() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("enter string");
                String string = scanner.next();
                FunctionalI<String> reversString = s -> new StringBuilder(string).reverse().toString();
                System.out.println(processOperation(string,reversString));
                break;
            case 2:
                System.out.println("enter number for fucterial");
                int fact = scanner.nextInt();
                FunctionalI<Integer> functionalFact = n -> {
                    int result = 1;
                    for (int i = 1; i <= n; i++) {
                        result *= i;
                    }
                    return result;
                };
                System.out.println(processOperation(fact,functionalFact));
        }
    }
    private static  <T> T processOperation(T value, FunctionalI<T> operation) {
        return operation.operation(value);
    }
}
