package com.kurs.wzorce.operacyjne.dependency_chain;

import java.util.Objects;

import static com.kurs.wzorce.operacyjne.dependency_chain.EmergencyType.*;

public class PoliceHandler extends AbstractHandler {

    @Override
    public void handleRequest(EmergencyType emergencyType) {
        if(CAR_ACCIENT.equals(emergencyType) || BEATING.equals(emergencyType) || FIRE.equals(emergencyType) || THEFT.equals(emergencyType)) {
            System.out.println("The police officer is on his way");
        }

        if(Objects.nonNull(next)) {
            next.handleRequest(emergencyType);
        }
    }

}
