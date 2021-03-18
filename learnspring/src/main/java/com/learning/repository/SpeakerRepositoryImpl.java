package com.learning.repository;

import com.learning.model.Speaker;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("speakerRepositoryImpl")
@Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
public class SpeakerRepositoryImpl implements SpeakerRepository{
    public List<Speaker> findAll() {
        List<Speaker> speakers = new ArrayList<Speaker>();

        Speaker speaker = new Speaker();

        speaker.setFirstName("Bryan");
        speaker.setLastName("Hansen");

        speakers.add(speaker);

        return speakers;
    }
}


