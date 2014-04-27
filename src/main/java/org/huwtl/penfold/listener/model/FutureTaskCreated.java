package org.huwtl.penfold.listener.model;

import org.joda.time.DateTime;

public class FutureTaskCreated extends TaskCreated
{
    public FutureTaskCreated(final String eventType, final String aggregateId, final String aggregateVersion, final DateTime created, final QueueBinding queueBinding, final DateTime triggerDate, final Payload payload, final Long score)
    {
        super(eventType, aggregateId, aggregateVersion, created, queueBinding, triggerDate, payload, score);
    }
}
