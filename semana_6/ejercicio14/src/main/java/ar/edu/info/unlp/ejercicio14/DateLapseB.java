package ar.edu.info.unlp.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapseB implements DateLapseInterface {
    private LocalDate from;
    private int sizeInDays;

    public DateLapseB(LocalDate from, int sizeInDays){
        this.from = from;
        this.sizeInDays = sizeInDays;
    }

    @Override
    public LocalDate getFrom() {
        return this.from;
    }

    @Override
    public LocalDate getTo() {
        return ChronoUnit.DAYS.addTo(this.from, this.sizeInDays);
    }

    @Override
    public int sizeInDays() {
        return this.sizeInDays;
    }

    @Override
    public boolean includesDate(LocalDate other) {
        return (other.isAfter(this.from) || other.isEqual(this.from))
                && (other.isBefore(this.getTo()) || other.isEqual(this.getTo()));
    }
}
