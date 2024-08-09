package com.deliveryboy.service;

import com.deliveryboy.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    //private Logger logger = (Logger) LoggerFactory.getLogger(KafkaService.class);

    public boolean updateLocation(String location) {

        //this.logger.info("message produced");
            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
           // System.out.println(" message produced : "+ i);


        return true;
    }

}
