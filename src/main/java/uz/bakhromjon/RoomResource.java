package uz.bakhromjon;

import org.eclipse.microprofile.graphql.Description;
import org.eclipse.microprofile.graphql.GraphQLApi;
import org.eclipse.microprofile.graphql.Query;
import javax.inject.Inject;
import java.util.List;

@GraphQLApi
public class RoomResource {
    @Inject
    RoomService roomService;

    @Query("getAllRooms")
    @Description("Get all rooms that empty")
    public List<Room> getRooms() {
        return roomService.getRooms();
    }

    @Query("getFirstEmptyRoom")
    @Description("Get first room that empty")
    public Room getFirstRooms() {
        return roomService.getRooms().get(0);
    }
}
