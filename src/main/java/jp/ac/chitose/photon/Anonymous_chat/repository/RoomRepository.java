package jp.ac.chitose.photon.Anonymous_chat.repository;

import jp.ac.chitose.photon.Anonymous_chat.form.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

@Repository
public class RoomRepository {

    @Autowired
    private JdbcTemplate jdbc;

    public int insert(Room room) {
        var sql = "insert into ROOM values(?,?,?)";
        var n = jdbc.update(sql,room.getRoomId(),room.getRoomName(),room.getPassword());
        return n;
    }

    public int searchRoomId(int roomId) {
        var sql ="select count (*) from ROOM where ROOM_ID=?";
        var n = jdbc.queryForObject(sql,Integer.class,roomId);
        return n;
    }

    public Room select(int roomId) {
        var sql = "select ROOM_ID, ROOM_NAME, PASSWORD from ROOM where ROOM_ID=?";
        return jdbc.queryForObject(sql,newInstance(Room.class),roomId);
    }
}
