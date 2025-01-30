package Booking.java;


public class Room {


    private int namberRoom;
    private int namberBedOnRoom;
    private int priceOneNightRoom;

    public Room(int namberRoom, int namberBedOnRoom,
                int priceOneNightRoom) {

        this.namberRoom = namberRoom;
        this.namberBedOnRoom = namberBedOnRoom;
        this.priceOneNightRoom = priceOneNightRoom;
    }

//region
    public int getNamberRoom() {
        return namberRoom;
    }

    public void setNamberRoom(int namberRoom) {
        this.namberRoom = namberRoom;
    }

    public int getNamberBedOnRoom() {
        return namberBedOnRoom;
    }

    public void setNamberBedOnRoom(int namberBedOnRoom) {
        this.namberBedOnRoom = namberBedOnRoom;
    }

    public int getPriceOneNightRoom() {
        return priceOneNightRoom;
    }

    public void setPriceOneNightRoom(int priceOneNightRoom) {
        this.priceOneNightRoom = priceOneNightRoom;
    }
//endregion


}
