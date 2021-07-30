package org.example;

import org.example.commands.AddCommand;
import org.example.commands.MultiplyCommand;
import org.example.commands.SetCommand;
import org.example.events.EventListener;
import org.junit.jupiter.api.Test;

/**
 * Created by rishi on 31/07/2021
 */
public class SimpleStateMachineTest {

    @Test
    void sampleRun() {
        final EventListener eventListener = new EventListener();
        final SimpleStateMachine stateMachine = new SimpleStateMachine();
        stateMachine.addListener(eventListener);

        final AddCommand add = new AddCommand();
        add.setValue(7);

        final MultiplyCommand multiply = new MultiplyCommand();
        multiply.setValue(6);

        final SetCommand set = new SetCommand();
        set.setValue(5);

        stateMachine.set(set);
        stateMachine.multiply(multiply);
        stateMachine.add(add);
    }
}
