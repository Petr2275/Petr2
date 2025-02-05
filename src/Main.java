import Hotel.BookingManager;
import Hotel.Guest;
import Hotel.Room;
import Hotel.Booking;


import java.math.BigDecimal;
import java.time.LocalDate;



public class Main {
    public static void main(String[] args) {
        BookingManager manager = new BookingManager();
        fillBookings(manager);

        testCode(manager);
    }
    private static void fillBookings (BookingManager manager) {
        Guest karel1 = new Guest("Karel", "Dvořák", LocalDate.of(1990, 5, 15));
        Guest karel2 = new Guest("Karel", "Dvořák", LocalDate.of(1979, 1, 3));
        Guest karolina = new Guest("Karolína", "Tmavá", LocalDate.of(2000, 11, 23));

        Room room1 = new Room(1,1,new BigDecimal("1000"),true,true);
        Room room2 = new Room(2,1,new BigDecimal("1000"),true,true);
        Room room3 = new Room(3,3,new BigDecimal("2400"),false,true);

        Booking booking;
        manager.addBooking(new Booking(
                karel1, room3, LocalDate.of(2023, 6, 1),
                LocalDate.of(2023, 6, 7), true));
        manager.addBooking(new Booking(
                karel2, room2, LocalDate.of(2023, 7, 18),
                LocalDate.of(2023, 7, 21), false));
        booking = new Booking(
                karolina, room3, LocalDate.of(2023, 8, 1),
                LocalDate.of(2023, 8, 31), true);
        booking.addOtherGuest(karel1);
        manager.addBooking(booking);

        for (int i = 1; i < 20; i += 2) {
            manager.addBooking(new Booking(
                    karolina, room2, LocalDate.of(2023, 8, i),
                    LocalDate.of(2023, 8, (i + 1)), false));
        }
    }

    private static void testCode(BookingManager manager) {
        System.out.println("Počet pracovních pobytů: " + manager.getNumberOfWorkingBookings());
        System.out.println("\nPrůměrný počet hostů na rezervaci: " + manager.getAverageGuests());
        System.out.println("\nPrvních osm rekreačních rezervací:");
        manager.getTopNHolidayBookings(8).forEach(booking -> System.out.println(booking.getDescription()));
        System.out.println("\nStatistiky hostů:");
        manager.printGuestStatistics();
        System.out.println("\nPočet pracovních pobytů: " + manager.getNumberOfWorkingBookings());

        System.out.println("\nFormátovaný výpis všech rezervací v systému:");
        for (Booking booking : manager.getBookings()) {
            System.out.println(booking.getFormattedSummary());
        }
    }
}