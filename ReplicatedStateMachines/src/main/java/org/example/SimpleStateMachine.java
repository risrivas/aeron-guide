package org.example;

import org.example.commands.AddCommand;
import org.example.commands.MultiplyCommand;
import org.example.commands.SetCommand;
import org.example.commands.SnapshotCommand;
import org.example.events.EventListener;
import org.example.events.NewValueEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rishi on 31/07/2021
 */
public class SimpleStateMachine {

    private int currentValue = 0;
    private List<EventListener> eventListeners = new ArrayList<>();

    public void addListener(EventListener eventListener) {
        eventListeners.add(eventListener);
    }

    public void add(AddCommand addCommand) {
        currentValue += addCommand.getValue();
        notifyListeners();
    }

    public void multiply(MultiplyCommand multiplyCommand) {
        currentValue *= multiplyCommand.getValue();
        notifyListeners();
    }

    public void set(SetCommand setCommand) {
        currentValue = setCommand.getValue();
        notifyListeners();
    }

    public void snapshot(SnapshotCommand snapshotCommand) {
        notifyListeners();
    }

    private void notifyListeners() {
        final NewValueEvent newValueEvent = new NewValueEvent();
        newValueEvent.setCurrentValue(currentValue);
        for (final EventListener eventListener : eventListeners) {
            eventListener.newValue(newValueEvent);
        }
    }

}
