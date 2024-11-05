package ar.edu.info.unlp.ejercicio19;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DateLapse{
    private LocalDate from;
    private LocalDate to;

    public DateLapse(LocalDate from, LocalDate to){
        this.from = from;
        this.to = to;
    }

    public LocalDate getFrom(){
        return this.from;
    }

    public LocalDate getTo(){
        return this.to;
    }

    public int sizeInDays(){
        return (int) ChronoUnit.DAYS.between(this.from, this.to);
    }

    public boolean includesDate(LocalDate other){
        return (other.isAfter(this.from) || other.isEqual(this.from))
                && (other.isBefore(this.to) || other.isEqual(this.to));
    }

    public boolean overlaps(DateLapse anotherDateLapse){
        return (this.includesDate(anotherDateLapse.getFrom()) || this.includesDate(anotherDateLapse.getTo()))
                || (anotherDateLapse.includesDate(this.from) || anotherDateLapse.includesDate(this.to));
    }

}
