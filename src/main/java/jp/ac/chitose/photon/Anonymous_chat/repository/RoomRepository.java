package jp.ac.chitose.photon.Anonymous_chat.repository;

import jp.ac.chitose.photon.Anonymous_chat.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Integer> {

    @Query(value = "SELECT COUNT * FROM ROOM WHERE ルームID = :sid", nativeQuery = true )
    public int searchRoomId(@Param("sid") int roomId);


}
