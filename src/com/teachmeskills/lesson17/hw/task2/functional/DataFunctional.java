package com.teachmeskills.lesson17.hw.task2.functional;

import java.time.DayOfWeek;
import java.time.LocalDate;

@FunctionalInterface
public interface DataFunctional {
    DayOfWeek day(LocalDate date);
}
