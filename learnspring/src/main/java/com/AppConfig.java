package com;

import com.learning.repository.SpeakerRepository;
import com.learning.repository.SpeakerRepositoryImpl;
import com.learning.service.SpeakerService;
import com.learning.service.SpeakerServiceImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
@ComponentScan({"com.learning"})
public class AppConfig {

//    @Bean(name = "speakerService")
//    @Scope(value = BeanDefinition.SCOPE_PROTOTYPE)
//    public SpeakerService getSpeakerService() {
//        SpeakerServiceImpl serviceImpl = new SpeakerServiceImpl();
//       // serviceImpl.setRepository(getSpeakerRepository());
//        return serviceImpl;
//    }
//
//    @Bean(name = "speakerRepositoryBean")
//    public SpeakerRepository getSpeakerRepository(){
//        return new SpeakerRepositoryImpl();
//    }

}
