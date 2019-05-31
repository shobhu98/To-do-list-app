package sample;

import java.time.LocalDate;

public class ToDoItem {

    private String shortdescription;
    private String details;
    private LocalDate date;


    public String getShortdescription() {
        return shortdescription;
    }
    public ToDoItem(String shortdescription,String details,LocalDate date){
        this.shortdescription=shortdescription;
        this.details=details;
        this.date=date;

    }

    public void setShortdescription(String shortdescription) {
        this.shortdescription = shortdescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return  shortdescription;
    }
}
