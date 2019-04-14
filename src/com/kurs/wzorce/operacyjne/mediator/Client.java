package com.kurs.wzorce.operacyjne.mediator;

public class Client {

    public static void main(String... args) {
        AirTrafficControlMediator atcMediator = new ATCMediator();
        Flight airbusA380 = new Flight(atcMediator);
        Runway mainRunway = new Runway(atcMediator);

        atcMediator.registerFlight(airbusA380);
        atcMediator.registerRunway(mainRunway);

        airbusA380.getReady();
        mainRunway.land();
        airbusA380.land();
    }
}
