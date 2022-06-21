package com.pattern.airplane;

public class Pilot {
    DefaultAirplane defaultAirplane;

    // 파일럿 생성자에서 비행기 객체를 받아 저장한다.
    public Pilot(DefaultAirplane defaultAirplaneReceived) {
        this.defaultAirplane = defaultAirplaneReceived;
    }

    // 메소드에서도 비행기 객체를 교체할 수 있게 만든다.
    public void setDefaultAirplane(DefaultAirplane defaultAirplane) {
        this.defaultAirplane = defaultAirplane;
    }

    // 비행기 타기 2번
    public void intoAirplane(){
        defaultAirplane.airplaneFeature();;
    }

}
