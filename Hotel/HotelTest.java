package Hotel;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HotelTest {
    Hotel hotel;
    @BeforeEach
    void startAllTestWith(){
        hotel = new Hotel(10);
        assertNotNull(hotel);
    }

    @Test
    void testThatRoomCanBeBooked(){
        assertEquals("Room Successfully booked!!!", hotel.bookRoom("Kinzy"));
    }
    @Test
    void testUserCanCheckOut(){
        hotel.bookRoom("Kinzy");
        assertTrue(hotel.checkOut(1));
    }

    @Test
    void getAllRoomsTest(){
       assertEquals(10, hotel.getRooms());
    }

    @Test
    void TestForAvailableRooms(){
       hotel.bookRoom("Lampard");
       hotel.bookRoom("Hazard");
       hotel.bookRoom("Drogba");
       hotel.bookRoom("Messi");
       assertEquals(6, hotel.availableRooms());
    }

    @Test
    void TestForBookedRooms(){
        hotel.bookRoom("Lampard");
        hotel.bookRoom("Hazard");
        assertEquals(2, hotel.BookedRooms());
    }

    @Test
    void TestForRoomGuest() {
        hotel.bookRoom("Lampard");
        hotel.bookRoom("Hazard");
        hotel.bookRoom("Messi");
        assertEquals("Hazard", hotel.getRoomGuest(1));
    }

    @Test
    void TestForGetAllRoomGuest() {
        hotel.bookRoom("Lampard");
        hotel.bookRoom("Hazard");
        hotel.bookRoom("Messi");
        assertEquals("[Lampard, Hazard, Messi]", hotel.getAllRoomGuest());
    }





}
