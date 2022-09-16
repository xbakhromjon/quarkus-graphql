package uz.bakhromjon;

import javax.enterprise.context.ApplicationScoped;
import java.util.List;

@ApplicationScoped
public class RoomService {

    public List<Room> getRooms() {
        return List.of(new Room("r1", "r1", "r"),
                new Room("r2", "r2", "r"),
                new Room("r3", "r3", "r"));
    }
}
