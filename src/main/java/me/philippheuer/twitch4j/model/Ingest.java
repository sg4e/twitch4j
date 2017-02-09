package me.philippheuer.twitch4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;

import java.util.Date;

@Data
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Ingest {

	@JsonProperty("_id")
	private Long id;

	private String name;

	private Boolean availability;

	@JsonProperty("default")
	private Boolean isDefault;

	private String urlTemplate;
}
