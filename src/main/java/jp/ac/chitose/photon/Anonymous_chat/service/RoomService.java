package jp.ac.chitose.photon.Anonymous_chat.service;

import jp.ac.chitose.photon.Anonymous_chat.entity.Room;

import java.util.Optional;

public interface RoomService {

    Optional<Room> findById(int roomID);

    void saveRoom(Room room);

    void deleteRoom(Room room);



}
