package org.example;

import org.example.Controller.Controller;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.addCustomer("Ivanov Ivan", "Moskow","88004445680");
        controller.addCustomer("Sidorov Petr", "Moskow", "89003456785");
        controller.addCustomer("Akimov Vitaly","Moskow", "89657967854");
        controller.addCustomer("Molokova Darya","Moskow", "89658897854");
        controller.addToy("doll",100,5);
        controller.addToy("dog",120, 7);
        controller.addToy("cat",110, 10);
        controller.deletCustomer(4);
        controller.deletToy(2);
        controller.changeDropFreuency(1,150);
        controller.prank(1);
        controller.prank(3);
        controller.getPriz(2);
        controller.showWinners();
        controller.prank(1);
        controller.showWinners();
        controller.showGotPrizes();

    }
}