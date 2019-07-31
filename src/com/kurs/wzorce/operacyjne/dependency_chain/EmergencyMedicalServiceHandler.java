package com.kurs.wzorce.operacyjne.dependency_chain;

import java.util.Objects;

import static com.kurs.wzorce.operacyjne.dependency_chain.EmergencyType.*;

public class EmergencyMedicalServiceHandler extends AbstractHandler {
    @Override
    public void handleRequest(EmergencyType emergencyType) {
        if(CAR_ACCIENT.equals(emergencyType) || FIRE.equals(emergencyType) || BEATING.equals(emergencyType)) {
            System.out.println("An ambulance is on the way");
        }

        if(Objects.nonNull(next)) {
            next.handleRequest(emergencyType);
        }
    }
}
