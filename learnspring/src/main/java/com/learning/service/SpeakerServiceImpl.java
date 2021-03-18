package com.learning.service;

import com.learning.model.Speaker;
import com.learning.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {

    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println(repository);
        this.repository = repository;
    }
}
