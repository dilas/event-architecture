package br.com.dilas.consumer.event;

import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;

@EnableBinding(ContractMessageSource.class)
public class EventConsumer {
    @StreamListener(ContractMessageSource.INPUT)
    public void newContractEventReceived(NewContractEvent event) {
        System.out.println("New Contract Event: " + event.toString());
    }
}
