package Hotel;



import java.awt.*;

import java.time.LocalDate;

public class Booking {

        private String typeOfVacation;
        private String bookingDate;
        private String guestName;
        private String namberRoom;
        private List booking;

        public Booking(String typeOfVacation, String bookingDate,
                       String guestName, String namberRoom) {
                this.typeOfVacation = typeOfVacation;
                this.bookingDate = bookingDate;
                this.guestName = guestName;
                this.namberRoom = namberRoom;
        }
//region

        public String getTypeOfVacation() {
                return typeOfVacation;
        }

        public void setTypeOfVacation(String typeOfVacation) {
                this.typeOfVacation = typeOfVacation;
        }

        public String getBookingDate() {
                return bookingDate;
        }

        public void setBookingDate(String bookingDate) {
                this.bookingDate = bookingDate;
        }

        public String getGuestName() {
                return guestName;
        }

        public void setGuestName(String guestName) {
                this.guestName = guestName;
        }

        public String getNamberRoom() {
                return namberRoom;
        }

        public void setNamberRoom(String namberRoom) {
                this.namberRoom = namberRoom;
        }

        public List getBooking() {
                return booking;
        }

        public void setBooking(List booking) {
                this.booking = booking;
        }

//endregion
        public Booking(List booking) {
                this.booking = booking;
        }





        }






















