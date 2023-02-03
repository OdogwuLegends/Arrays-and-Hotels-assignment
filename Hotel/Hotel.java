package Hotel;

import java.util.Arrays;

public class Hotel {
    private String [] rooms;

    public Hotel(int roomLength) {
        this.rooms = new String[roomLength];
    }
    public String bookRoom(String user) {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] ==  null){
            rooms[i] = user;
            break;}
        }
        return "Room Successfully booked!!!";
    }

    public boolean checkOut(int roomNumber) {
        boolean hasCheckedOut = false;
        if(rooms[roomNumber -1] != null){
            rooms[roomNumber -1] = null;
            hasCheckedOut = true;
        }
        return hasCheckedOut;
    }

    public int getRooms(){
        return rooms.length;
    }


    public int availableRooms() {
        int freeRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] ==  null){
            freeRooms++;
            }
        }
        return freeRooms;
    }
    public int BookedRooms() {
        int bookedRooms = 0;
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] !=  null){
                bookedRooms++;
            }
        }
        return bookedRooms;
    }

    public String getRoomGuest(int guest) {
        return rooms[guest];
    }

    public String getAllRoomGuest() {
        String[] totalGuest = new String [BookedRooms()];
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] != null) {
                totalGuest[i] = rooms[i];
            }
        }
        return Arrays.toString(totalGuest);
    }

}
