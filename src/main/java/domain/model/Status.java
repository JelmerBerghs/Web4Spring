package domain.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Status {
    ONLINE("Online"), OFFLINE("Offline"), AWAY("Away");

    private String description;

    Status(String description) {
        this.description = description;
    }

    Status() {

    }

    @JsonValue
    public String getDescription() {
        return description;
    }

    @Override
    public String toString(){
        return this.getDescription();
    }
}
