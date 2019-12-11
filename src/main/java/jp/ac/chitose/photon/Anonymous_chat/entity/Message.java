package jp.ac.chitose.photon.Anonymous_chat.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="MESSAGE")
public class Message {

    @EmbeddedId
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private MessagePrimarykey primarykey;

    @Column(name="メッセージ")
    private String message;

    @Column(name="時刻")
    private String timeStamp;


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }
}
