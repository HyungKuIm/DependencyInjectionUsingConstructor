package com.oraclejava.message;

public class KakaoMessage implements Messaging{
    @Override
    public void sendMessage() {
        System.out.println("카카오톡을 활용한 메시지...");
    }
}
