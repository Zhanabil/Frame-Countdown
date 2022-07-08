package com.java.play;

import com.java.GUI.ClockWindow;
import com.java.objects.GUI;
import com.java.objects.KeyGenerator;
import com.java.objects.Timer;

public class StartTestMain {
    public static void main(String args[]) {

    // ClockWindow clockWindow = new ClockWindow();

//       GUI gui = new GUI();

        Timer timer = new Timer();
        KeyGenerator keyGenerator = new KeyGenerator();

        int i = 0;
        do {
            System.out.println(timer);

            if (timer.getTimer_crr_value() == 0) {
                System.out.println(keyGenerator.genKey());
            }

            timer.timeTick();
            i++;
        } while (i <= 30);
    }
}
