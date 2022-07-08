package com.java.objects;

public class Timer {

    private int timer_max_value;
    private int timer_crr_value;

    public Timer() {
        this.timer_max_value = 10;
        this.timer_crr_value = timer_max_value;
    }

    public int getTimer_crr_value() {
        return this.timer_crr_value;
    }


    public void timeTick() {

        try {
            this.timer_crr_value = this.timer_crr_value - 1;

            if (this.timer_crr_value < 0) {
                this.timer_crr_value = this.timer_max_value;
            }

            Thread.sleep(1000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public String toString() {
        if(this.timer_crr_value < 10) {
            return "0" + this.timer_crr_value;
        }

        return "" + this.timer_crr_value;
    }




}
