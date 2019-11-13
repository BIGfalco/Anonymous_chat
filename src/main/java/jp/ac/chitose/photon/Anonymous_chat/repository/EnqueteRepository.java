package jp.ac.chitose.photon.Anonymous_chat.repository;

import jp.ac.chitose.photon.Anonymous_chat.entity.Enquete;
import jp.ac.chitose.photon.Anonymous_chat.entity.EnquetePrimaryKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnqueteRepository extends JpaRepository<Enquete, EnquetePrimaryKey> {


}
