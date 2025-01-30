import Booking.java.Guest;
import Booking.java.Room;
import Hotel.Booking;


import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        Room withBalconyAndSeaView = new Room(1,1,1000);
        Room withSeaViewNoBalcony = new Room(3,3,2400);

        Booking firstBook = new Booking("working","od 19. do 26.7.2021","Adéla Malíková","1");

        Booking secondBook = new Booking("recreacional","od 1. do 14.9.2021","Adéla Malíková a Jan Dvořáček","3");


        Guest firstGuest = new Guest("Adéla Malíková",LocalDate.of(1993,3,13));
        Guest secondGuest = new Guest("Jan Dvořáček",LocalDate.of(1995,4,5));

        firstGuest.setGuestName("Adéla Malíková (narozena 13.3.1993)");
        System.out.println( firstGuest.getGuestName());
        secondGuest.setGuestName("Jan Dvořáček (narozen 5.4.1995)");
        System.out.println( secondGuest.getGuestName());


        System.out.println("Výpis Rezervací");
        System.out.println(firstBook.getGuestName() + " " + firstBook.getBookingDate() + " (" + firstBook.getNamberRoom() + ")");

        System.out.println(secondBook.getGuestName() + " " + secondBook.getBookingDate() + " (" + secondBook.getNamberRoom() + ")");



        }


    }
