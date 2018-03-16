
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "excludeCodes",
    "includeEligible",
    "includeGiftCoupons",
    "includeNonProduct",
    "minimum",
    "preTaxValidation"
})
public class SaleAmountCondition {

    @JsonProperty("excludeCodes")
    private String excludeCodes;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("includeEligible")
    private Boolean includeEligible;
    @JsonProperty("includeGiftCoupons")
    private Boolean includeGiftCoupons;
    @JsonProperty("includeNonProduct")
    private Boolean includeNonProduct;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    private Double minimum;
    @JsonProperty("preTaxValidation")
    private Boolean preTaxValidation;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("excludeCodes")
    public String getExcludeCodes() {
        return excludeCodes;
    }

    @JsonProperty("excludeCodes")
    public void setExcludeCodes(String excludeCodes) {
        this.excludeCodes = excludeCodes;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("includeEligible")
    public Boolean getIncludeEligible() {
        return includeEligible;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("includeEligible")
    public void setIncludeEligible(Boolean includeEligible) {
        this.includeEligible = includeEligible;
    }

    @JsonProperty("includeGiftCoupons")
    public Boolean getIncludeGiftCoupons() {
        return includeGiftCoupons;
    }

    @JsonProperty("includeGiftCoupons")
    public void setIncludeGiftCoupons(Boolean includeGiftCoupons) {
        this.includeGiftCoupons = includeGiftCoupons;
    }

    @JsonProperty("includeNonProduct")
    public Boolean getIncludeNonProduct() {
        return includeNonProduct;
    }

    @JsonProperty("includeNonProduct")
    public void setIncludeNonProduct(Boolean includeNonProduct) {
        this.includeNonProduct = includeNonProduct;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    public Double getMinimum() {
        return minimum;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("minimum")
    public void setMinimum(Double minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("preTaxValidation")
    public Boolean getPreTaxValidation() {
        return preTaxValidation;
    }

    @JsonProperty("preTaxValidation")
    public void setPreTaxValidation(Boolean preTaxValidation) {
        this.preTaxValidation = preTaxValidation;
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
