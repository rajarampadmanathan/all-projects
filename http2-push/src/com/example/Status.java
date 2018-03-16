
package com.example;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "message",
    "code",
    "type",
    "errors"
})
public class Status {

    /**
     * Response payload message
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Response payload message")
    private String message;
    /**
     * Result code number
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("Result code number")
    private Integer code;
    /**
     * Success or Error
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Success or Error")
    private String type;
    /**
     * All errors should be wrapped in errors array.
     * 
     */
    @JsonProperty("errors")
    @JsonPropertyDescription("All errors should be wrapped in errors array.")
    private List<Error> errors = null;

    /**
     * Response payload message
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Response payload message
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Result code number
     * (Required)
     * 
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * Result code number
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Success or Error
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Success or Error
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * All errors should be wrapped in errors array.
     * 
     */
    @JsonProperty("errors")
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * All errors should be wrapped in errors array.
     * 
     */
    @JsonProperty("errors")
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

}
