package jp.ac.chitose.photon.Anonymous_chat.service.impl;

import jp.ac.chitose.photon.Anonymous_chat.entity.Enquete;
import jp.ac.chitose.photon.Anonymous_chat.entity.EnquetePrimaryKey;
import jp.ac.chitose.photon.Anonymous_chat.repository.EnqueteRepository;
import jp.ac.chitose.photon.Anonymous_chat.service.EnqueteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnqueteServiceImpl implements EnqueteService {

    @Autowired
    EnqueteRepository enqueteRepository;

    @Autowired
    EnqueteService enqueteService;

    @Override
    public void save (Enquete enquete) {
        enqueteRepository.save(enquete);
    }

    @Override
    public Optional<Enquete> findById(EnquetePrimaryKey primaryKey) {
        return enqueteRepository.findById(primaryKey);
    }

    @Override
    public List<Enquete> findAll() {
        return enqueteRepository.findAll();
    }

    @Override
    public void delete(Enquete enquete) {
        enqueteRepository.delete(enquete);
    }

}
