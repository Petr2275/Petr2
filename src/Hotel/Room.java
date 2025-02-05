package Hotel;


import java.math.BigDecimal;

public class Room {


    private int namberRoom;
    private int namberBedOnRoom;
    private BigDecimal pricePerNight;
    private boolean hasBalcony;
    private boolean hasSeaView;

    public Room(int namberRoom, int namberBedOnRoom,
                BigDecimal pricePerNight, boolean hasBalcony, boolean hasSeaView) {

        this.namberRoom = namberRoom;
        this.namberBedOnRoom = namberBedOnRoom;
        this.pricePerNight = pricePerNight;
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

    public BigDecimal getPricePerNight() {

        return pricePerNight;
    }

    public void setPricePerNight(BigDecimal pricePerNight) {

        this.pricePerNight = pricePerNight;
    }

    public boolean hasBalcony() {

        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {

        this.hasBalcony = hasBalcony;
    }

    public boolean hasSeaView() {

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
        description += ", cena za noc: " + pricePerNight + " Kč";
        return description;
    }


}
