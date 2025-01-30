package Booking.java;

import java.awt.*;
import java.time.LocalDate;

public class Guest {


    private String guestName;
    private LocalDate guestBirthDay;
    private List otherGuests;



    public Guest(String guestName, LocalDate guestBirthDay) {
        this.guestName = guestName;
        this.guestBirthDay = guestBirthDay;
    }
//region
    public String getGuestName() {
        return guestName;
    }

    public void setGuestName(String guestName) {
        this.guestName = guestName;
    }

    public LocalDate getGuestBirthDay() {
        return guestBirthDay;
    }

    public void setGuestBirthDay(LocalDate guestBirthDay) {
        this.guestBirthDay = guestBirthDay;
    }

    public List getOtherGuests() {
        return otherGuests;
    }

    public void setOtherGuests(List otherGuests) {
        this.otherGuests = otherGuests;
    }
//endregion



}
