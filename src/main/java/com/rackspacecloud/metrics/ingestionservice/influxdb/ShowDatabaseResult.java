package com.rackspacecloud.metrics.ingestionservice.influxdb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShowDatabaseResult {
    @JsonProperty("results")
    Result[] results;

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class Result {
        @JsonProperty("series")
        SeriesItem[] series;
    }

    @Data
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class SeriesItem {
        @JsonProperty("name")
        String name;

        @JsonProperty("values")
        String[][] values;
    }
}
