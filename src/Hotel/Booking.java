        package Hotel;



        import Booking.java.Guest;
        import Booking.java.Room;



        import java.time.LocalDate;
        import java.util.ArrayList;
        import java.util.List;

        public class Booking {
                private Guest guest;
                private Room room;
                private LocalDate checkIn;
                private LocalDate checkOut;
                private List<Guest> otherGuests = new ArrayList<>();
                private boolean isWorkingStay;

                        public Booking(Guest guest, Room room, LocalDate checkIn,
                                       LocalDate checkOut,
                                       boolean isWorkingStay) {
                                this.guest = guest;
                                this.room = room;
                                this.checkIn = checkIn;
                                this.checkOut = checkOut;
                                this.isWorkingStay = isWorkingStay;
                        }

                        //region

                        public Guest getGuest() {
                                return guest;
                        }

                        public void setGuest(Guest guest) {
                                this.guest = guest;
                        }

                        public Room getRoom() {
                                return room;
                        }

                        public void setRoom(Room room) {
                                this.room = room;
                        }

                        public LocalDate getCheckIn() {
                                return checkIn;
                        }

                        public void setCheckIn(LocalDate checkIn) {
                                this.checkIn = checkIn;
                        }

                        public LocalDate getCheckOut() {
                                return checkOut;
                        }

                        public void setCheckOut(LocalDate checkOut) {
                                this.checkOut = checkOut;
                        }

                        public List<Guest> getOtherGuests() {
                                return otherGuests;
                        }

                        public void setOtherGuests(List<Guest> otherGuests) {
                                this.otherGuests = otherGuests;
                        }

                        public boolean isWorkingStay() {
                                return isWorkingStay;
                        }

                        public void setWorkingStay(boolean workingStay) {
                                isWorkingStay = workingStay;
                        }
                        //endregion

                        public String getBookingDescription() {
                                StringBuilder result = new StringBuilder("Rezervace pro: " + guest.getDescription() + " na: " + room.getNamberBedOnRoom()
                                        + " termín: " + checkIn + " - " + checkOut
                                        + " pracovní pobyt: " + (isWorkingStay ? "ano" : "ne"));
                                if (!otherGuests.isEmpty()) {
                                        result.append(", další hosté: \n");
                                        for (Guest guest : otherGuests) {
                                                result.append(guest.getDescription()).append("\n");
                                        }
                                }
                                return result.toString();
                                
                        }

                public void addOtherGuest(Guest jan) {
                }
        }


