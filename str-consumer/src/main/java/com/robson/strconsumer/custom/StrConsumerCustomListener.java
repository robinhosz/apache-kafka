package com.robson.strconsumer.custom;

import org.springframework.core.annotation.AliasFor;
import org.springframework.kafka.annotation.KafkaListener;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@KafkaListener
public @interface StrConsumerCustomListener {

    //Listener custom utilizando boas praticas de engenharia de software.

   //AliasFor basicamente serve para decorar atributos dentro de uma única anotação ou em uma anotação composta a partir de uma meta-anotação

    //Aqui eu deixo o topico padrão ( default )
    @AliasFor(annotation = KafkaListener.class, attribute = "topics")
    String[] topics() default "str-topic";

    //Aqui eu deixo o container factory padrão ( default )
    @AliasFor(annotation = KafkaListener.class, attribute = "containerFactory")
    String containerFactory() default "strContainerFactory";

    @AliasFor(annotation = KafkaListener.class, attribute = "groupId")
    String groupId() default "";

    @AliasFor(annotation = KafkaListener.class, attribute = "errorHandler")
    String errorHandler() default "errorCustomHandler";
}
