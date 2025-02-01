package Booking.java;


public class Room {


    private int namberRoom;
    private int namberBedOnRoom;
    private int priceOneNightRoom;
    private boolean hasBalcony;
    private boolean hasSeaView;

    public Room(int namberRoom, int namberBedOnRoom,
                int priceOneNightRoom, boolean hasBalcony, boolean hasSeaView) {

        this.namberRoom = namberRoom;
        this.namberBedOnRoom = namberBedOnRoom;
        this.priceOneNightRoom = priceOneNightRoom;
        this.hasBalcony = hasBalcony;
        this.hasSeaView = hasSeaView;

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

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = hasBalcony;
    }

    public boolean isHasSeaView() {
        return hasSeaView;
    }

    public void setHasSeaView(boolean hasSeaView) {
        this.hasSeaView = hasSeaView;
    }

//endregion

    public String getRoomDescription() {
        String description = "Pokoj číslo: " + namberRoom + ": " + namberBedOnRoom + " lůžka, balkón: ";
        if (hasBalcony) {
            description += "ano";
        } else {
            description += "ne";
        }
        description += ", výhled na moře: ";
        if (hasSeaView) {
            description += "ano";
        } else {
            description += "ne";
        }
        description += ", cena za noc: " + priceOneNightRoom + " Kč";
        return description;
    }
}
