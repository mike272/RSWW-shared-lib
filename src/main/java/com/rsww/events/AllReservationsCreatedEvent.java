package com.rsww.events;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


/**
 * Event to indicate that all reservations have been confirmed.
 */
@Data
@Builder(setterPrefix = "with")
@NoArgsConstructor
@AllArgsConstructor
public class AllReservationsCreatedEvent
{
    private int tripReservationId;
    private String location;
    private String dates;
    private int customerId;
}
