package jp.ac.chitose.photon.Anonymous_chat.service;

import jp.ac.chitose.photon.Anonymous_chat.form.Enquate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import jp.ac.chitose.photon.Anonymous_chat.repository.EnquateRepository;

import java.util.List;

@Service
public class EnquateService {

    @Autowired
    private EnquateRepository enquateRepository;

    public List<Enquate> messageSelect(String Tag){
        return enquateRepository.SelectMessage(Tag);
    }



}
