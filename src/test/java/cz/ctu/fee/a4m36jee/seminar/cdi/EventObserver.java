package cz.ctu.fee.a4m36jee.seminar.cdi;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;

import cz.ctu.fee.a4m36jee.seminar.cdi.factorial.util.FactorialComputationFinished;

@ApplicationScoped
public class EventObserver {
    private FactorialComputationFinished event;

    @SuppressWarnings("unused")
    private void observe(@Observes FactorialComputationFinished event) {
        this.event = event;
    }

    public FactorialComputationFinished getEvent() {
        return event;
    }

    public void reset() {
        event = null;
    }
}
