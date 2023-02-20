package javaapplication51;
import java.util.ArrayList;
/**
 *
 * @author Dylan
 */
public class JavaApplication51 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Room> rooms = new ArrayList<>();
        Room kitchen = new Room("Kitchen");
        rooms.add(kitchen);
        House house = new House(rooms);
    }
    
}

/**
 *Room class to set up rooms with their appliances
 */
class Room {
    private String room_name;

    public Room(String room_name) {
        this.room_name = room_name;
    }
    
}

class House {
    private ArrayList<Room> rooms = new ArrayList<Room>();
    
    public House(ArrayList<Room> rooms ) {
        this.rooms = rooms;
    }
}