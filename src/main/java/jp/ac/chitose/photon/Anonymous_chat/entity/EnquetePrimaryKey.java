package jp.ac.chitose.photon.Anonymous_chat.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Data
@Embeddable
public class EnquetePrimaryKey implements Serializable {

    @Column(name = "ルームID")
    private int roomId;
    @Column(name = "タグ")
    private String tag;
}
