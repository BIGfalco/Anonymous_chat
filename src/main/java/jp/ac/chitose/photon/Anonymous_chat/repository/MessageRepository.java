package jp.ac.chitose.photon.Anonymous_chat.repository;

import jp.ac.chitose.photon.Anonymous_chat.form.Message;
import jp.ac.chitose.photon.Anonymous_chat.form.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class MessageRepository {

    @Autowired
    private JdbcTemplate jdbc;
    
    public int insert(Message message, Room room,String userId) {
        var sql = "insert into MESSAGE values(?,?,?,?)";
        var n = jdbc.update(sql,room.getRoomId(),userId,message.getMessage(),message.getTimeStamp());
        return n;
    }
}
