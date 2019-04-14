package com.kurs.wzorce.operacyjne.mediator;

public class Flight implements Command {

    private AirTrafficControlMediator atcMediator;
    private boolean isReadyToLand = false;

    public Flight(AirTrafficControlMediator atcMediator) {
        this.atcMediator = atcMediator;
    }

    public void land() {
        if (atcMediator.isLandingOk() & isReadyToLand) {
            System.out.println("Successfully Landed.");
            atcMediator.setLandingStatus(true);
        }
        else
            System.out.println("Plane crashed.");
    }

    public void getReady() {
        System.out.println("Ready for landing.");
        atcMediator.setLandingReadyStatus(true);
        isReadyToLand = true;
    }
}
