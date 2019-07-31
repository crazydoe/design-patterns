package com.kurs.wzorce.operacyjne.dependency_chain;

import java.util.Objects;

import static com.kurs.wzorce.operacyjne.dependency_chain.EmergencyType.CAR_ACCIENT;
import static com.kurs.wzorce.operacyjne.dependency_chain.EmergencyType.FIRE;

public class FirefighterHander extends AbstractHandler {

    @Override
    public void handleRequest(EmergencyType emergencyType) {
        if(CAR_ACCIENT.equals(emergencyType) || FIRE.equals(emergencyType)) {
            System.out.println("firefighters accepted the call");
        }

        if(Objects.nonNull(next)) {
            next.handleRequest(emergencyType);
        }
    }
}
