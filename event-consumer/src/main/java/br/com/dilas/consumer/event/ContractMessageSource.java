package br.com.dilas.consumer.event;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.stereotype.Component;

@Component
public interface ContractMessageSource {
    String INPUT = "contractInput";

    @Input(INPUT)
    SubscribableChannel intput();

    String OUTPUT = "contractOutput";

    @Output(OUTPUT)
    MessageChannel output();
}
