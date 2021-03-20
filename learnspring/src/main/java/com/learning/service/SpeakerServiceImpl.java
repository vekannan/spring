package com.learning.service;

import com.learning.model.Speaker;
import com.learning.repository.SpeakerRepository;
import java.util.List;


public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    public SpeakerServiceImpl() {

    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println(repository);
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }


    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println(repository);
        this.repository = repository;
    }
}
