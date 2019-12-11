package jp.ac.chitose.photon.Anonymous_chat.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class MessagePrimarykey implements Serializable {

    @Column(name="ルームID")
    private int roomId;
    @Column(name="ユーザーID")
    private String userID;
}
