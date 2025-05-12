public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;
    private boolean cancellationPolicy;
    private double parkingFee;


    public Reservation(String roomType, int numberOfNights, boolean isWeekend, double reservationTotal, double parkingFee) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
        this.reservationTotal = reservationTotal;
        this.parkingFee = parkingFee;


    }





    public int getRoomType() {

        if (this.roomType.equals("king")) {
            return 139;

        } else if (this.roomType.equals("double")) {
            return 124;

        } else {
            throw new RuntimeException("Invalid Choice.");
        }


    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public int isWeekend(int weekendPrice) {
        if (isWeekend) {
            if (this.roomType.equals("king")) {
                return 160;
            } else if (this.roomType.equals("double")) {
                return 140;
            } else {
                throw new RuntimeException("Invalid Response");
            }
        }



        return 0;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getReservationTotal() {



        return reservationTotal;
    }

    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }




    public void setCancellationPolicy(boolean cancellationPolicy) {
        this.cancellationPolicy = cancellationPolicy;
    }


    public double getParkingFee() {
        return parkingFee;
    }

    public void setParkingFee(double parkingFee) {
        this.parkingFee = parkingFee;
    }

    @Override
    public String toString() {
        return String.format("Reservation: roomType='%s', numberOfNights=%d, isWeekend=%b, reservationTotal=%.2f, isBreakfast=%b, cancellationPolicy='%s', cleaningFees=%.2f, parkingFee=%.2f",
                roomType, numberOfNights, isWeekend, reservationTotal, cancellationPolicy, parkingFee);
    }


}











