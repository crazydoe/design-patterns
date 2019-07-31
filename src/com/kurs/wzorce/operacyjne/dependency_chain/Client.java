package com.kurs.wzorce.operacyjne.dependency_chain;

public class Client {

    public static void main(String... args) {
        AbstractHandler handler = createChain();

        System.out.println("--- executing car accident request");
        handler.handleRequest(EmergencyType.CAR_ACCIENT);
        System.out.println("--- request handled \n");

        System.out.println("--- executing theft request");
        handler.handleRequest(EmergencyType.THEFT);
        System.out.println("--- request handled \n");

        System.out.println("--- executing fire request");
        handler.handleRequest(EmergencyType.FIRE);
        System.out.println("--- request handled \n");

        System.out.println("--- executing beating request");
        handler.handleRequest(EmergencyType.BEATING);
        System.out.println("--- request handled \n");

    }

    public static AbstractHandler createChain() {
        AbstractHandler firstHandler = new FirefighterHander();
        AbstractHandler secondHandler = new PoliceHandler();
        AbstractHandler thirdHandler  = new EmergencyMedicalServiceHandler();


        firstHandler.setNext(secondHandler);
        secondHandler.setNext(thirdHandler);

        return firstHandler;
    }
}
