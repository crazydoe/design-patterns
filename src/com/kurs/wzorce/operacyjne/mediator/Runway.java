package com.kurs.wzorce.operacyjne.mediator;

public class Runway implements Command {

    private AirTrafficControlMediator atcMediator;

    public Runway(AirTrafficControlMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    @Override
    public void land() {
        if(atcMediator.isReadyToLand()) {
            System.out.println("Landing permission granted.");
            atcMediator.setLandingStatus(true);
        } else {
            System.out.println("Flight didn't asked for permission.");
        }
    }
}
