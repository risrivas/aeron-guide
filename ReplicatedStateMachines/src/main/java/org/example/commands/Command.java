package org.example.commands;

/**
 * Created by rishi on 31/07/2021
 */
public abstract class Command {

    protected int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
