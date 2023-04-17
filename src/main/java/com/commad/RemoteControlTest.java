package com.commad;

public class RemoteControlTest {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light("거실");

        //각 기능을 세부적으로 정의한 명령클래스 객체를 만든다.
        // 각 명령 클래스에는 Command 기능을 구현했다.
        LightOnCommand lightOn = new LightOnCommand(light);
        LightOffCommand lightOff = new LightOffCommand(light);

        //remote.setCommand(lightOn);
        remote.setCommand(lightOff);
        remote.buttonWasPressed();

    }

}
