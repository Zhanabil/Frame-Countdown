package com.java.objects;

public class StopWatch {

    private int stopWatch_max_value;
    private int stopWatch_crr_value;

    public StopWatch(int stopWatch_max_value) {
        this.stopWatch_max_value = stopWatch_max_value;
        this.stopWatch_crr_value = 0;
    }

    public int stopWatchGetCrrValue() {
        return this.stopWatch_crr_value;
    }

    public void stopWatchTicking() {

        this.stopWatch_crr_value = this.stopWatch_crr_value + 1;

        if(this.stopWatch_crr_value >= this.stopWatch_max_value) {
            this.stopWatch_crr_value = this.stopWatch_max_value;
        }
    }

    public String toString() {
        if(this.stopWatch_crr_value < 10) {
            return "0" + this.stopWatch_crr_value;
        }

        return "" + this.stopWatch_crr_value;
    }

}
