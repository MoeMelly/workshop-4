public class BookRooms {
    int totalBasicRooms;
    int totalSuites;
    int bookedSuites = 0;
    int bookedBasicRooms = 0;


    public BookRooms(int totalBasicRooms, int totalSuites) {
        this.totalBasicRooms = totalBasicRooms;
        this.totalSuites = totalSuites;
        this.bookedSuites = 0;
        this.bookedBasicRooms = 0;
    }


    public boolean bookRoom(int numberOfRooms, boolean isSuites) {
        if (numberOfRooms <= 0) {
            return false;

        }


        if (isSuites) {
            if (numberOfRooms <= getAvailableSuites()) {
                bookedBasicRooms += numberOfRooms;
                return true;
            }

        }
        return false;
    }

    public int getAvailableSuites() {
        return totalSuites - bookedSuites;
    }

    public int getAvailableRooms() {

        return  totalBasicRooms - bookedBasicRooms;

    }
}





