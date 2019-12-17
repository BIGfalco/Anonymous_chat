package jp.ac.chitose.photon.Anonymous_chat.service;

import jp.ac.chitose.photon.Anonymous_chat.form.Room;
import jp.ac.chitose.photon.Anonymous_chat.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;

    public void save(int roomID, String roomName, String password) {
        var room = new Room(roomID, roomName, password);
        /*return*/ roomRepository.insert(room);
    }

    public boolean existsRoomId(int roomId) {
        int flag = roomRepository.searchRoomId(roomId);
        if(flag > 0){
            return true;
        }
        else {
            return false;
        }
    }

    public Room getRoom(int roomId) {
        var room = roomRepository.select(roomId);
        return room;
    }

}
