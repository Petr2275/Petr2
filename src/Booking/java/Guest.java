package Booking.java;


import java.time.LocalDate;

public class Guest {


    private String name;
    private String surname;
    private LocalDate birthDay;

    public Guest(String name, String surname, LocalDate birthDay) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
    }

    //region

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getDescription() {
        return name + " " + surname + " (" + birthDay+ ")";
    }

    public void setBirthDate(LocalDate of) {
    }


//endregion
    


}
