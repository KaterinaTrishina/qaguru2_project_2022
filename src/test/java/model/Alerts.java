package model;

import io.cucumber.core.internal.com.fasterxml.jackson.annotation.JsonProperty;

public class Alerts {

    @JsonProperty ("sender_name")
    private String senderName;

    private String events;
    private Long starts;
    private Long end;
    private String description;

}
