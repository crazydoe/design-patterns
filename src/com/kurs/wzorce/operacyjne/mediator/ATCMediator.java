package com.kurs.wzorce.operacyjne.mediator;

public class ATCMediator implements AirTrafficControlMediator {

    private Flight flight;
    private Runway runway;
    public boolean land = false;
    public boolean readyToLand = false;

    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    public boolean isLandingOk() {
        return land;
    }

    @Override
    public boolean isReadyToLand() {
        return readyToLand;
    }

    @Override
    public void setLandingStatus(boolean status) {
        this.land = status;
    }

    @Override
    public void setLandingReadyStatus(boolean status) {
        this.readyToLand = status;
    }
}
