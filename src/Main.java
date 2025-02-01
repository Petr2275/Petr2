import Booking.java.Guest;
import Booking.java.Room;
import Hotel.Booking;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Guest adela = new Guest("Adéla", "Malíková", LocalDate.of(1993, 3, 13));
        Guest jan = new Guest("Jan", "Dvořák", LocalDate.of(1995, 5, 5));

        jan.setBirthDate(LocalDate.of(1995, 4, 5));

        System.out.println(jan.getDescription());


        Room room1 = new Room(1,1,1000,true,true);
        Room room2 = new Room(2, 1, 1000, true, true);
        Room room3 = new Room(3, 3, 2400, false, true);

        Booking booking1 = new Booking(adela, room1, LocalDate.of(2021, 7, 19), LocalDate.of(2021, 7, 26), false);
        Booking booking2 = new Booking(adela,room3, LocalDate.of(2021, 9, 1), LocalDate.of(2021, 9, 14), false);
        booking2.addOtherGuest(jan);

        List<Booking> bookingList = new ArrayList<>();
        bookingList.add(booking1);
        bookingList.add(booking2);

        System.out.println("Výpis všech rezervací v systému:");
        for (Booking booking : bookingList) {
            System.out.println(booking.getBookingDescription());
        }

    }
}




