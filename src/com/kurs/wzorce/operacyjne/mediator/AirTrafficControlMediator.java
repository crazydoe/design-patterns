package com.kurs.wzorce.operacyjne.mediator;

public interface AirTrafficControlMediator {

    void registerRunway(Runway runway);

    void registerFlight(Flight flight);

    boolean isLandingOk();

    boolean isReadyToLand();

    void setLandingStatus(boolean status);

    void setLandingReadyStatus(boolean status);
}
