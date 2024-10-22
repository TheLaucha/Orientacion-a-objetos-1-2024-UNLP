package ar.edu.info.unlp.ejercicio14;

import java.time.LocalDate;

public interface DateLapseInterface {
    LocalDate getFrom();

    LocalDate getTo();

    int sizeInDays();

    boolean includesDate(LocalDate other);
}
