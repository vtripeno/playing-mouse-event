package com.victor.tripeno;

import java.awt.*;
import java.util.Calendar;

public class Application {
    public static void main(String[] args) throws AWTException {

        Application application = new Application();
        application.moveMouse(250, 250);

    }

    private synchronized void moveMouse(int x, int y) throws AWTException {
        while (true) {
            System.out.println("always moving mouse ==> " + Calendar.getInstance().getTime());
            try {
                this.wait(2000);
                Robot robot = new Robot();
                if(x == 250) {
                    x = 500;
                    y = 500;
                } else {
                    x = 250;
                    y = 250;
                }
                robot.mouseMove(x, y);
            } catch (InterruptedException e) {

                e.printStackTrace();
            }
        }
    }
}
