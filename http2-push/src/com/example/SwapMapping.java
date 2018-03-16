
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "regular",
    "swap"
})
public class SwapMapping {

    /**
     * Source product Id
     * 
     */
    @JsonProperty("regular")
    @JsonPropertyDescription("Source product Id")
    private String regular;
    /**
     * Target product Id
     * 
     */
    @JsonProperty("swap")
    @JsonPropertyDescription("Target product Id")
    private String swap;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Source product Id
     * 
     */
    @JsonProperty("regular")
    public String getRegular() {
        return regular;
    }

    /**
     * Source product Id
     * 
     */
    @JsonProperty("regular")
    public void setRegular(String regular) {
        this.regular = regular;
    }

    /**
     * Target product Id
     * 
     */
    @JsonProperty("swap")
    public String getSwap() {
        return swap;
    }

    /**
     * Target product Id
     * 
     */
    @JsonProperty("swap")
    public void setSwap(String swap) {
        this.swap = swap;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
