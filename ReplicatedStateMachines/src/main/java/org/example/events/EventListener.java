package org.example.events;

import java.util.logging.Logger;

/**
 * Created by rishi on 31/07/2021
 */
public class EventListener {

    private final Logger logger = Logger.getLogger(EventListener.class.getName());

    public void newValue(NewValueEvent event) {
        logger.info("Current Value = " + event.getCurrentValue());
    }
}
