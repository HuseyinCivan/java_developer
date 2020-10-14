package com.cybertek.core;

public class SelectionStatements {

    public static void demoIfStatement() {
        String userName = "Huseyin";

        if (userName.equals("Huseyin")) {
            System.out.println("PASS");
        } else if (userName.equals("Ozzy")) {
            System.out.println("FAIL");
        } else {
            System.out.println("Not Valid");
        }
    }

    public static void demoSwitchCaseStatement() {
        String userName = "Mike";

        switch (userName) {
            case "Huseyin":
                System.out.println("PASS");
                break;
            case "Mike":
                System.out.println("FAIL");
                break;
            default:
                System.out.println("Not Valid");
        }


    }


}
