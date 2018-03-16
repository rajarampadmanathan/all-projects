
package com.example;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "discountLimit",
    "discountType",
    "priceFromCode",
    "type",
    "value"
})
public class Action {

    /**
     * Defines the maximum value of the discount that can be applied due to the promotion.
     * 
     */
    @JsonProperty("discountLimit")
    @JsonPropertyDescription("Defines the maximum value of the discount that can be applied due to the promotion.")
    private Double discountLimit;
    /**
     * Unknow = 0, PROMO = 1, PRICE = 2.
     * (Required)
     * 
     */
    @JsonProperty("discountType")
    @JsonPropertyDescription("Unknow = 0, PROMO = 1, PRICE = 2.")
    private Action.DiscountType discountType;
    /**
     * Optional product Code (PLU) to copy the price from. It is possible to have both the price and priceFromCode attributes set, but only for relative and percentage prices.
     * (Required)
     * 
     */
    @JsonProperty("priceFromCode")
    @JsonPropertyDescription("Optional product Code (PLU) to copy the price from. It is possible to have both the price and priceFromCode attributes set, but only for relative and percentage prices.")
    private String priceFromCode;
    /**
     * UnKnow = 0, Percent = 1, Relative = 2, Absolute = 3.
     * 
     */
    @JsonProperty("type")
    @JsonPropertyDescription("UnKnow = 0, Percent = 1, Relative = 2, Absolute = 3.")
    private Action.Type type;
    /**
     * The section <Actions> define the actions to be performed by the Sales Channel Applications in order to apply the promotion.
     * 
     */
    @JsonProperty("value")
    @JsonPropertyDescription("The section <Actions> define the actions to be performed by the Sales Channel Applications in order to apply the promotion.")
    private Double value;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Defines the maximum value of the discount that can be applied due to the promotion.
     * 
     */
    @JsonProperty("discountLimit")
    public Double getDiscountLimit() {
        return discountLimit;
    }

    /**
     * Defines the maximum value of the discount that can be applied due to the promotion.
     * 
     */
    @JsonProperty("discountLimit")
    public void setDiscountLimit(Double discountLimit) {
        this.discountLimit = discountLimit;
    }

    /**
     * Unknow = 0, PROMO = 1, PRICE = 2.
     * (Required)
     * 
     */
    @JsonProperty("discountType")
    public Action.DiscountType getDiscountType() {
        return discountType;
    }

    /**
     * Unknow = 0, PROMO = 1, PRICE = 2.
     * (Required)
     * 
     */
    @JsonProperty("discountType")
    public void setDiscountType(Action.DiscountType discountType) {
        this.discountType = discountType;
    }

    /**
     * Optional product Code (PLU) to copy the price from. It is possible to have both the price and priceFromCode attributes set, but only for relative and percentage prices.
     * (Required)
     * 
     */
    @JsonProperty("priceFromCode")
    public String getPriceFromCode() {
        return priceFromCode;
    }

    /**
     * Optional product Code (PLU) to copy the price from. It is possible to have both the price and priceFromCode attributes set, but only for relative and percentage prices.
     * (Required)
     * 
     */
    @JsonProperty("priceFromCode")
    public void setPriceFromCode(String priceFromCode) {
        this.priceFromCode = priceFromCode;
    }

    /**
     * UnKnow = 0, Percent = 1, Relative = 2, Absolute = 3.
     * 
     */
    @JsonProperty("type")
    public Action.Type getType() {
        return type;
    }

    /**
     * UnKnow = 0, Percent = 1, Relative = 2, Absolute = 3.
     * 
     */
    @JsonProperty("type")
    public void setType(Action.Type type) {
        this.type = type;
    }

    /**
     * The section <Actions> define the actions to be performed by the Sales Channel Applications in order to apply the promotion.
     * 
     */
    @JsonProperty("value")
    public Double getValue() {
        return value;
    }

    /**
     * The section <Actions> define the actions to be performed by the Sales Channel Applications in order to apply the promotion.
     * 
     */
    @JsonProperty("value")
    public void setValue(Double value) {
        this.value = value;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public enum DiscountType {

        _0(0),
        _1(1),
        _2(2);
        private final Integer value;
        private final static Map<Integer, Action.DiscountType> CONSTANTS = new HashMap<Integer, Action.DiscountType>();

        static {
            for (Action.DiscountType c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private DiscountType(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer value() {
            return this.value;
        }

        @JsonCreator
        public static Action.DiscountType fromValue(Integer value) {
            Action.DiscountType constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

    public enum Type {

        _0(0),
        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, Action.Type> CONSTANTS = new HashMap<Integer, Action.Type>();

        static {
            for (Action.Type c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private Type(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer value() {
            return this.value;
        }

        @JsonCreator
        public static Action.Type fromValue(Integer value) {
            Action.Type constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
