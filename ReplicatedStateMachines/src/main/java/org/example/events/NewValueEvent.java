package org.example.events;

/**
 * Created by rishi on 31/07/2021
 */
public class NewValueEvent {
    private int currentValue;

    public int getCurrentValue() {
        return currentValue;
    }

    public void setCurrentValue(int currentValue) {
        this.currentValue = currentValue;
    }
}
