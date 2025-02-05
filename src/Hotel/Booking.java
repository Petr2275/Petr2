        package Hotel;



        import java.math.BigDecimal;
        import java.time.LocalDate;
        import java.util.ArrayList;
        import java.util.List;

        public class Booking {
                private Guest guest;
                private Room room;
                private LocalDate checkIn;
                private LocalDate checkOut;
                private List<Guest> otherGuests  = new ArrayList<>();
                private boolean isWorkingStay;

                public Booking(Guest guest, Room room, LocalDate checkIn, LocalDate checkOut, boolean isWorkingStay) {
                        this.guest = guest;
                        this.room = room;
                        this.checkIn = checkIn;
                        this.checkOut = checkOut;
                        this.isWorkingStay = isWorkingStay;
                }

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

                public void addOtherGuest(Guest guest) {
                        otherGuests.add(guest);
                }

                public void removeOtherGuest(Guest guest) {
                        otherGuests.remove(guest);
                }

                public String getDescription() {
                        StringBuilder result = new StringBuilder("Rezervace pro: " + guest.getDescription() + " na: " + room.getNamberRoom()
                                + " termín: " + checkIn + " - " + checkOut
                                + " pracovní pobyt: " + (isWorkingStay ? "ano" : "ne"));
                        if (! otherGuests.isEmpty()) {
                                result.append(", další hosté: \n");
                                for (Guest guest : otherGuests) {
                                        result.append(guest.getDescription()).append("\n");
                                }
                        }
                        return result.toString();
                }

                public int getGuestsCount() {
                        return otherGuests.size() + 1;
                }

                public int getBookingLength() {
                        return checkIn.until(checkOut).getDays();
                }

                public BigDecimal getTotalPrice() {
                        return room.getPricePerNight().multiply(BigDecimal.valueOf(getBookingLength()));
                }

                public String getFormattedSummary() {
                        Guest guest = getGuest();
                        return  getCheckIn()+" až "+getCheckOut()+": "+guest.getName()+" "+guest.getSurname()+
                                " ("+ guest.getBirthDate()+")["+
                                (getOtherGuests().size()+1)+", "+(getRoom().hasSeaView()?"ano":"ne")+"] za "+getTotalPrice()+" Kč";
                }
        }


