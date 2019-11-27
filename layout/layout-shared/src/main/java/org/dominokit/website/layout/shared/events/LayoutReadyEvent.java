package org.dominokit.website.layout.shared.events;

import org.dominokit.domino.api.shared.extension.ActivationEvent;

public class LayoutReadyEvent extends ActivationEvent {
    public LayoutReadyEvent(boolean status) {
        super(status);
    }
}
