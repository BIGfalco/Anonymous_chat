package jp.ac.chitose.photon.Anonymous_chat.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import jp.ac.chitose.photon.Anonymous_chat.form.Enquate;
import org.springframework.stereotype.Repository;

import java.util.List;
import static org.springframework.jdbc.core.BeanPropertyRowMapper.newInstance;


@Repository
public class EnquateRepository {

    @Autowired
    private JdbcTemplate jdbc;

    public List<Enquate> SelectMessage(String Tag) {
        var sql = "select MESSAGE from ENQUETE where TAG = ?";
        return jdbc.query(sql,newInstance(Enquate.class),Tag);
    }

}
