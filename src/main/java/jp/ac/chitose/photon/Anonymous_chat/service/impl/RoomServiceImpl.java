package jp.ac.chitose.photon.Anonymous_chat.service.impl;

import jp.ac.chitose.photon.Anonymous_chat.entity.Room;
import jp.ac.chitose.photon.Anonymous_chat.repository.RoomRepository;
import jp.ac.chitose.photon.Anonymous_chat.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RoomServiceImpl implements RoomService {

    @Autowired
    RoomRepository roomRepository;

    @Autowired
    RoomService roomService;

    @Override
    public void saveRoom(Room room) {
        roomRepository.save(room);
    }

    @Override
    public void deleteRoom(Room room) {
        roomRepository.delete(room);
    }

    @Override
    public Optional<Room> findById(int roomId) {
        return roomRepository.findById(roomId);
    }

}
