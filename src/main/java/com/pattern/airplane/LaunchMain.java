package com.pattern.airplane;

public class LaunchMain {
    public static void main(String[] args) {
        Pilot defaultPilot = new Pilot(new DefaultAirplane());
        defaultPilot.intoAirplane();

        Pilot propellerPilot = new Pilot(new PropellerAirplane());
        propellerPilot.intoAirplane();

        System.out.println("제트 엔진으로 바꿔볼까?");
        propellerPilot.setDefaultAirplane(new JetAirplane());

        propellerPilot.intoAirplane();
    }
}
