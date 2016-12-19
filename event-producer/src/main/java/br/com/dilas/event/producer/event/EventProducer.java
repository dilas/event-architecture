package br.com.dilas.event.producer.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.messaging.support.MessageBuilder;

@EnableBinding(ContractMessageSource.class)
public class EventProducer {
    @Autowired
    private ContractMessageSource contractChannel;

    public void newContractEvent() {
        contractChannel.output().send(MessageBuilder.withPayload(new NewContractEvent(1, "dilas")).build());
    }
}
