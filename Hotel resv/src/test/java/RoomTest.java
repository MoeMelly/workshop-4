import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn() {
        Room room = new Room(230,1,124,true,true,true,false,false,false);
           room.checkIn();


        Assertions.assertTrue(room.isDirty && room.isOccupied);
        Assertions.assertFalse(room.isAvailable());
        }

    @Test
    void checkOut() {

        Room room = new Room(400,1,124,false,true,true,false,true,false);
        room.checkOut();



        Assertions.assertFalse(room.isOccupied() && room.isDirty());
        Assertions.assertTrue(room.isAvailable);
    }

    @Test
    void cleanRoom() {
        Room room = new Room(320, 1, 124, false, false, true, false, true, true);
        room.cleanRoom();
        boolean actual = room.cleanRoom();        //Returned true and passed

        Assertions.assertTrue(room.cleanRoom);
        assertTrue(room.isAvailable());
    }





    }


