package jp.ac.chitose.photon.Anonymous_chat.service;

import jp.ac.chitose.photon.Anonymous_chat.entity.Enquete;
import jp.ac.chitose.photon.Anonymous_chat.entity.EnquetePrimaryKey;

import java.util.List;
import java.util.Optional;

public interface EnqueteService {

    void save(Enquete enquete);
    Optional<Enquete> findById(EnquetePrimaryKey primaryKey);
    List<Enquete> findAll();
    void delete(Enquete enquete);


}
