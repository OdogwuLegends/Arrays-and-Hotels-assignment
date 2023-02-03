package Hotel;

import java.util.Scanner;

public class HotelMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Hotel royale = new Hotel(10);
        String response;

        System.out.println("Welcome! There are " +royale.availableRooms()+ " available rooms");

        System.out.println("\nDo you want to book a room?");
        response = scanner.next();
        if(response.equalsIgnoreCase("Yes")){
            System.out.println("What is your name please?");
            String name = scanner.next();
            System.out.println(royale.bookRoom(name));
        } else {
            System.out.println("Thank you. Goodbye.");
            System.exit(10);
        }

        System.out.println("\nHow many rooms are booked so far?");
        System.out.println("There are " +royale.BookedRooms()+ " room(s) that are booked, and "+royale.availableRooms()+" available rooms currently.");

        System.out.println("\nCan i get the names of the guests please?");
        System.out.println(royale.getAllRoomGuest());

        System.out.println("Want to check out?");
        response = scanner.next();
        if (response.equalsIgnoreCase("Yes")){
            royale.checkOut(1);
            System.out.println("\nThere are now "+royale.availableRooms()+ " available rooms now.");
            System.out.println("\nThank you for your patronage!");
        }






    }
}
