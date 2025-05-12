public class Room {
    int roomNumber;
    int numberOfBeds;
    double price;
    boolean isOccupied;
    boolean isDirty;
    boolean isAvailable;
    boolean isCheckedIn;
    boolean isCheckedOut;
    boolean cleanRoom;

    public Room(int roomNumber, int numberOfBeds, int price, boolean isOccupied, boolean isDirty, boolean isAvailable, boolean isCheckIn, boolean isCheckOut, boolean cleanRoom) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
        this.isAvailable = isAvailable;
        this.isCheckedIn = isCheckIn;
        this.isCheckedOut = isCheckOut;
        this.cleanRoom = cleanRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable() {

        return !isDirty() && !isOccupied();


    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public boolean isCheckIn() {

        if (isAvailable && !isCheckedIn) {
            isAvailable = false;
            isCheckedIn = true;
            isDirty = true;
            isOccupied = true;
            return true;
        } else {
            System.out.println("Room Not Available");
        } throw new RuntimeException("Invalid input");


    }

    public void setCheckIn(boolean checkIn) {
        isCheckedIn = checkIn;
    }

    public boolean isCheckOut() {

        if (isCheckedOut) {
            if (!cleanRoom && isDirty) {
                isAvailable = false;
            } else {
                System.out.println("Room is available for checkout");
            }
        }




        return isCheckedOut;
    }

    public void setCheckOut(boolean checkOut) {
        isCheckedOut = checkOut;
    }

    public boolean isCleanRoom() {
        return isDirty && isOccupied;





    }

      public void checkIn() {

        setDirty(true); setOccupied(true);






    }

    public void checkOut() {

        setDirty(true); setOccupied(false);
    }

    public boolean cleanRoom() {

        setDirty(false);
        return false;
    }


}









