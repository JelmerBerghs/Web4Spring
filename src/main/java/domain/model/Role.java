package domain.model;

import com.fasterxml.jackson.annotation.JsonValue;

public enum Role {
	BIB("bibliothekaris"), LID("lid");

	private String description;

	Role(String description) {
		this.description = description;
	}
	
	Role() {
		
	}
	@JsonValue
	public String getDescription() {
		return description;
	}
}
