
package com.example;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "andConditions",
    "orConditions",
    "notConditions",
    "dateConditions",
    "dateSetConditions",
    "dayOfWeekConditions",
    "dayPartConditions",
    "hourOfDayConditions",
    "itemsQuantityConditions",
    "orderTakerPlatformConditions",
    "podConditions",
    "redemptionMode",
    "saleAmountConditions",
    "saleTypeConditions",
    "tenderTypeConditions",
    "transactionCountConditions"
})
public class Conditions {

    @JsonProperty("andConditions")
    private AndConditions andConditions;
    @JsonProperty("orConditions")
    private OrConditions orConditions;
    @JsonProperty("notConditions")
    private NotConditions notConditions;
    @JsonProperty("dateConditions")
    private List<DateCondition> dateConditions = null;
    @JsonProperty("dateSetConditions")
    private List<String> dateSetConditions = null;
    @JsonProperty("dayOfWeekConditions")
    private List<String> dayOfWeekConditions = null;
    @JsonProperty("dayPartConditions")
    private List<String> dayPartConditions = null;
    @JsonProperty("hourOfDayConditions")
    private List<HourOfDayCondition> hourOfDayConditions = null;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itemsQuantityConditions")
    private List<ItemsQuantityCondition> itemsQuantityConditions = null;
    @JsonProperty("orderTakerPlatformConditions")
    private List<String> orderTakerPlatformConditions = null;
    @JsonProperty("podConditions")
    private List<String> podConditions = null;
    @JsonProperty("redemptionMode")
    private Conditions.RedemptionMode redemptionMode;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("saleAmountConditions")
    private List<SaleAmountCondition> saleAmountConditions = null;
    @JsonProperty("saleTypeConditions")
    private List<String> saleTypeConditions = null;
    @JsonProperty("tenderTypeConditions")
    private List<Integer> tenderTypeConditions = null;
    @JsonProperty("transactionCountConditions")
    private List<TransactionCountCondition> transactionCountConditions = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("andConditions")
    public AndConditions getAndConditions() {
        return andConditions;
    }

    @JsonProperty("andConditions")
    public void setAndConditions(AndConditions andConditions) {
        this.andConditions = andConditions;
    }

    @JsonProperty("orConditions")
    public OrConditions getOrConditions() {
        return orConditions;
    }

    @JsonProperty("orConditions")
    public void setOrConditions(OrConditions orConditions) {
        this.orConditions = orConditions;
    }

    @JsonProperty("notConditions")
    public NotConditions getNotConditions() {
        return notConditions;
    }

    @JsonProperty("notConditions")
    public void setNotConditions(NotConditions notConditions) {
        this.notConditions = notConditions;
    }

    @JsonProperty("dateConditions")
    public List<DateCondition> getDateConditions() {
        return dateConditions;
    }

    @JsonProperty("dateConditions")
    public void setDateConditions(List<DateCondition> dateConditions) {
        this.dateConditions = dateConditions;
    }

    @JsonProperty("dateSetConditions")
    public List<String> getDateSetConditions() {
        return dateSetConditions;
    }

    @JsonProperty("dateSetConditions")
    public void setDateSetConditions(List<String> dateSetConditions) {
        this.dateSetConditions = dateSetConditions;
    }

    @JsonProperty("dayOfWeekConditions")
    public List<String> getDayOfWeekConditions() {
        return dayOfWeekConditions;
    }

    @JsonProperty("dayOfWeekConditions")
    public void setDayOfWeekConditions(List<String> dayOfWeekConditions) {
        this.dayOfWeekConditions = dayOfWeekConditions;
    }

    @JsonProperty("dayPartConditions")
    public List<String> getDayPartConditions() {
        return dayPartConditions;
    }

    @JsonProperty("dayPartConditions")
    public void setDayPartConditions(List<String> dayPartConditions) {
        this.dayPartConditions = dayPartConditions;
    }

    @JsonProperty("hourOfDayConditions")
    public List<HourOfDayCondition> getHourOfDayConditions() {
        return hourOfDayConditions;
    }

    @JsonProperty("hourOfDayConditions")
    public void setHourOfDayConditions(List<HourOfDayCondition> hourOfDayConditions) {
        this.hourOfDayConditions = hourOfDayConditions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itemsQuantityConditions")
    public List<ItemsQuantityCondition> getItemsQuantityConditions() {
        return itemsQuantityConditions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("itemsQuantityConditions")
    public void setItemsQuantityConditions(List<ItemsQuantityCondition> itemsQuantityConditions) {
        this.itemsQuantityConditions = itemsQuantityConditions;
    }

    @JsonProperty("orderTakerPlatformConditions")
    public List<String> getOrderTakerPlatformConditions() {
        return orderTakerPlatformConditions;
    }

    @JsonProperty("orderTakerPlatformConditions")
    public void setOrderTakerPlatformConditions(List<String> orderTakerPlatformConditions) {
        this.orderTakerPlatformConditions = orderTakerPlatformConditions;
    }

    @JsonProperty("podConditions")
    public List<String> getPodConditions() {
        return podConditions;
    }

    @JsonProperty("podConditions")
    public void setPodConditions(List<String> podConditions) {
        this.podConditions = podConditions;
    }

    @JsonProperty("redemptionMode")
    public Conditions.RedemptionMode getRedemptionMode() {
        return redemptionMode;
    }

    @JsonProperty("redemptionMode")
    public void setRedemptionMode(Conditions.RedemptionMode redemptionMode) {
        this.redemptionMode = redemptionMode;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("saleAmountConditions")
    public List<SaleAmountCondition> getSaleAmountConditions() {
        return saleAmountConditions;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("saleAmountConditions")
    public void setSaleAmountConditions(List<SaleAmountCondition> saleAmountConditions) {
        this.saleAmountConditions = saleAmountConditions;
    }

    @JsonProperty("saleTypeConditions")
    public List<String> getSaleTypeConditions() {
        return saleTypeConditions;
    }

    @JsonProperty("saleTypeConditions")
    public void setSaleTypeConditions(List<String> saleTypeConditions) {
        this.saleTypeConditions = saleTypeConditions;
    }

    @JsonProperty("tenderTypeConditions")
    public List<Integer> getTenderTypeConditions() {
        return tenderTypeConditions;
    }

    @JsonProperty("tenderTypeConditions")
    public void setTenderTypeConditions(List<Integer> tenderTypeConditions) {
        this.tenderTypeConditions = tenderTypeConditions;
    }

    @JsonProperty("transactionCountConditions")
    public List<TransactionCountCondition> getTransactionCountConditions() {
        return transactionCountConditions;
    }

    @JsonProperty("transactionCountConditions")
    public void setTransactionCountConditions(List<TransactionCountCondition> transactionCountConditions) {
        this.transactionCountConditions = transactionCountConditions;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public enum RedemptionMode {

        _0(0),
        _1(1),
        _2(2),
        _3(3);
        private final Integer value;
        private final static Map<Integer, Conditions.RedemptionMode> CONSTANTS = new HashMap<Integer, Conditions.RedemptionMode>();

        static {
            for (Conditions.RedemptionMode c: values()) {
                CONSTANTS.put(c.value, c);
            }
        }

        private RedemptionMode(Integer value) {
            this.value = value;
        }

        @JsonValue
        public Integer value() {
            return this.value;
        }

        @JsonCreator
        public static Conditions.RedemptionMode fromValue(Integer value) {
            Conditions.RedemptionMode constant = CONSTANTS.get(value);
            if (constant == null) {
                throw new IllegalArgumentException((value +""));
            } else {
                return constant;
            }
        }

    }

}
