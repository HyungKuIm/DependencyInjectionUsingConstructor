package com.oraclejava.message;

public class ActiveMQMessage implements Messaging{

    public void sendMessage() {
        System.out.println("Active MQ를 사용하여 메시지를 보냅니다..");
    }
}
