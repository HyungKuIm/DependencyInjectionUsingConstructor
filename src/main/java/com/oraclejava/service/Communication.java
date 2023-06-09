package com.oraclejava.service;

import com.oraclejava.message.ActiveMQMessage;

public class Communication {
    private ActiveMQMessage activeMQMessage;

    public Communication(ActiveMQMessage activeMQMessage) {
        this.activeMQMessage = activeMQMessage;
    }

    public void communicate() {
        activeMQMessage.sendMessage();
    }
}
