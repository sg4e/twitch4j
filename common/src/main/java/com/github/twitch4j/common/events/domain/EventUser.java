package com.github.twitch4j.common.events.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventUser {

    /**
     * User Id
     */
    private final Long id;

    /**
     * User Name
     */
    private final String name;

}
