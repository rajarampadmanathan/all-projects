
package com.example;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "code",
    "type",
    "message",
    "property",
    "path",
    "service"
})
public class Error {

    /**
     * The standardized error code.
     * (Required)
     * 
     */
    @JsonProperty("code")
    @JsonPropertyDescription("The standardized error code.")
    private Integer code;
    /**
     * Error catogory type of the exception.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("Error catogory type of the exception.")
    private String type;
    /**
     * Field specific error messages if required.
     * 
     */
    @JsonProperty("message")
    @JsonPropertyDescription("Field specific error messages if required.")
    private String message;
    /**
     * Property Name which failed validation.
     * 
     */
    @JsonProperty("property")
    @JsonPropertyDescription("Property Name which failed validation.")
    private String property;
    /**
     * Property Path from the request payload which failed validation.
     * 
     */
    @JsonProperty("path")
    @JsonPropertyDescription("Property Path from the request payload which failed validation.")
    private String path;
    /**
     * Service Name or Application throwing the exception.
     * (Required)
     * 
     */
    @JsonProperty("service")
    @JsonPropertyDescription("Service Name or Application throwing the exception.")
    private String service;

    /**
     * The standardized error code.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * The standardized error code.
     * (Required)
     * 
     */
    @JsonProperty("code")
    public void setCode(Integer code) {
        this.code = code;
    }

    /**
     * Error catogory type of the exception.
     * 
     */
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    /**
     * Error catogory type of the exception.
     * 
     */
    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Field specific error messages if required.
     * 
     */
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Field specific error messages if required.
     * 
     */
    @JsonProperty("message")
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * Property Name which failed validation.
     * 
     */
    @JsonProperty("property")
    public String getProperty() {
        return property;
    }

    /**
     * Property Name which failed validation.
     * 
     */
    @JsonProperty("property")
    public void setProperty(String property) {
        this.property = property;
    }

    /**
     * Property Path from the request payload which failed validation.
     * 
     */
    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    /**
     * Property Path from the request payload which failed validation.
     * 
     */
    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    /**
     * Service Name or Application throwing the exception.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public String getService() {
        return service;
    }

    /**
     * Service Name or Application throwing the exception.
     * (Required)
     * 
     */
    @JsonProperty("service")
    public void setService(String service) {
        this.service = service;
    }

}
