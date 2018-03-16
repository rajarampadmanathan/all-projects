
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
    "includePromotional",
    "maximum",
    "minimum",
    "shouldSerializeMaximum"
})
public class ItemsQuantityCondition {

    @JsonProperty("excludeCodes")
    private String excludeCodes;
    @JsonProperty("includeEligible")
    private Boolean includeEligible;
    @JsonProperty("includeGiftCoupons")
    private Boolean includeGiftCoupons;
    @JsonProperty("includeNonProduct")
    private Boolean includeNonProduct;
    @JsonProperty("includePromotional")
    private Boolean includePromotional;
    @JsonProperty("maximum")
    private Integer maximum;
    @JsonProperty("minimum")
    private Integer minimum;
    @JsonProperty("shouldSerializeMaximum")
    private Boolean shouldSerializeMaximum;
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

    @JsonProperty("includeEligible")
    public Boolean getIncludeEligible() {
        return includeEligible;
    }

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

    @JsonProperty("includePromotional")
    public Boolean getIncludePromotional() {
        return includePromotional;
    }

    @JsonProperty("includePromotional")
    public void setIncludePromotional(Boolean includePromotional) {
        this.includePromotional = includePromotional;
    }

    @JsonProperty("maximum")
    public Integer getMaximum() {
        return maximum;
    }

    @JsonProperty("maximum")
    public void setMaximum(Integer maximum) {
        this.maximum = maximum;
    }

    @JsonProperty("minimum")
    public Integer getMinimum() {
        return minimum;
    }

    @JsonProperty("minimum")
    public void setMinimum(Integer minimum) {
        this.minimum = minimum;
    }

    @JsonProperty("shouldSerializeMaximum")
    public Boolean getShouldSerializeMaximum() {
        return shouldSerializeMaximum;
    }

    @JsonProperty("shouldSerializeMaximum")
    public void setShouldSerializeMaximum(Boolean shouldSerializeMaximum) {
        this.shouldSerializeMaximum = shouldSerializeMaximum;
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
