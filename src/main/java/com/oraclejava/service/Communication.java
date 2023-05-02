package com.oraclejava.service;

import com.oraclejava.message.ActiveMQMessage;
import com.oraclejava.message.Messaging;

public class Communication {
    private Messaging message;

    public Communication(Messaging message) {
        this.message = message;
    }

    public void communicate() {
        message.sendMessage();
    }
}
