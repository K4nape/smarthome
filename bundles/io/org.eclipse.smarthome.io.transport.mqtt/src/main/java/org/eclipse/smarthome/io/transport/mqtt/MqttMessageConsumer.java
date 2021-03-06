/**
 * Copyright (c) 2014,2018 Contributors to the Eclipse Foundation
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information regarding copyright ownership.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.eclipse.smarthome.io.transport.mqtt;

import org.eclipse.smarthome.core.events.EventPublisher;

/**
 * All message consumers which want to register as a message consumer to a MqttBrokerConnection should implement this
 * interface.
 *
 * This is a deprecated interface. Please use MqttMessageSubscriber instead.
 *
 * @author Davy Vanherbergen
 * @deprecated
 */
@Deprecated
public interface MqttMessageConsumer extends MqttMessageSubscriber {
    /**
     * Set Topic to subscribe to. May contain + or # wildcards
     *
     * @param topic to subscribe to.
     */
    public void setTopic(String topic);

    /**
     * Set the event publisher to use when broadcasting received messages onto the smarthome event bus.
     *
     * @param eventPublisher
     */
    public void setEventPublisher(EventPublisher eventPublisher);

}
