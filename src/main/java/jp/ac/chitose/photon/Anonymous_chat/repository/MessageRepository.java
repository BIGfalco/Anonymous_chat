package jp.ac.chitose.photon.Anonymous_chat.repository;

import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;

import jp.ac.chitose.photon.Anonymous_chat.form.Message;
import jp.ac.chitose.photon.Anonymous_chat.form.MessageForm;
import jp.ac.chitose.photon.Anonymous_chat.form.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MessageRepository {

    @Autowired
    private JdbcTemplate jdbc;
    
    public int insert(Message message) {
        var sql = "insert into MESSAGE values(?,?,?,?)";
        var n = jdbc.update(sql,message.getUserId(),message.getMessage(),message.getRoomId(),message.getTimeStamp());
        return n;
    }

    public List<Message> select() {
        var sql = "select * from MESSAGE order by TIME desc";
        return jdbc.query(sql,newInstance(Message.class));
    }
}
