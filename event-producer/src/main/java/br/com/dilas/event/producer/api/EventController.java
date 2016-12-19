package br.com.dilas.event.producer.api;

import br.com.dilas.event.producer.event.EventProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
    @Autowired
    EventProducer eventProducer;

    @RequestMapping("/contract/new")
    public void produceNewContractEvent() {
        eventProducer.newContractEvent();
    }
}
