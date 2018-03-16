
package com.example;

import java.util.HashMap;
import java.util.List;
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
    "archived",
    "currentPunch",
    "duration",
    "expirationChanged",
    "expirationChangedAt",
    "expired",
    "extendToEOD",
    "id",
    "imageBaseName",
    "localValidFrom",
    "localValidThru",
    "longDescription",
    "name",
    "offerType",
    "orderDiscount",
    "orderDiscountBA",
    "orderDiscountType",
    "productSets",
    "conditions",
    "reedemed",
    "reedemedAt",
    "restaurants",
    "selected",
    "shortDescription",
    "totalPunch"
})
public class Offer {

    /**
     * Indicates if this offer has been archived (marked as 'not interested')
     * (Required)
     * 
     */
    @JsonProperty("archived")
    @JsonPropertyDescription("Indicates if this offer has been archived (marked as 'not interested')")
    private Boolean archived;
    /**
     * The CurrentPunch is the offer’s punch, it exists only for ‘Frequency offers’ and determines howmany punches were already stamped in the offer.
     * (Required)
     * 
     */
    @JsonProperty("currentPunch")
    @JsonPropertyDescription("The CurrentPunch is the offer\u2019s punch, it exists only for \u2018Frequency offers\u2019 and determines howmany punches were already stamped in the offer.")
    private Integer currentPunch;
    /**
     * Used to inform the duration (in hours) of the offer snooze (Default value is null).
     * (Required)
     * 
     */
    @JsonProperty("duration")
    @JsonPropertyDescription("Used to inform the duration (in hours) of the offer snooze (Default value is null).")
    private Integer duration;
    /**
     * Used to inform if the initial expiration date has changed.
     * 
     */
    @JsonProperty("expirationChanged")
    @JsonPropertyDescription("Used to inform if the initial expiration date has changed.")
    private Boolean expirationChanged;
    /**
     * The ISO 8601 timestamp that register when the initial expiration date changed.
     * 
     */
    @JsonProperty("expirationChangedAt")
    @JsonPropertyDescription("The ISO 8601 timestamp that register when the initial expiration date changed.")
    private String expirationChangedAt;
    /**
     * Indicates if this offer has expired.
     * (Required)
     * 
     */
    @JsonProperty("expired")
    @JsonPropertyDescription("Indicates if this offer has expired.")
    private Boolean expired;
    /**
     *  Used to inform if the snooze can be extended to the end of the day (Default value is null).
     * 
     */
    @JsonProperty("extendToEOD")
    @JsonPropertyDescription(" Used to inform if the snooze can be extended to the end of the day (Default value is null).")
    private Integer extendToEOD;
    /**
     * Offer unique identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("Offer unique identifier.")
    private Integer id;
    /**
     * Path to the offer's image.
     * (Required)
     * 
     */
    @JsonProperty("imageBaseName")
    @JsonPropertyDescription("Path to the offer's image.")
    private String imageBaseName;
    /**
     * Optional date when the offer begins to be valid. This is always expressed in the local store time.
     * (Required)
     * 
     */
    @JsonProperty("localValidFrom")
    @JsonPropertyDescription("Optional date when the offer begins to be valid. This is always expressed in the local store time.")
    private String localValidFrom;
    /**
     * The date to which the Offer will be valid.
     * (Required)
     * 
     */
    @JsonProperty("localValidThru")
    @JsonPropertyDescription("The date to which the Offer will be valid.")
    private String localValidThru;
    /**
     * Long description of the offer.
     * 
     */
    @JsonProperty("longDescription")
    @JsonPropertyDescription("Long description of the offer.")
    private String longDescription;
    /**
     * Name of the offer.
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("Name of the offer.")
    private String name;
    /**
     * Reward = 1, Weekly = 2, LimitedTime = 3, Everyday = 4, Frequency = 5, LocationBased = 6, MSA = 7.
     * (Required)
     * 
     */
    @JsonProperty("offerType")
    @JsonPropertyDescription("Reward = 1, Weekly = 2, LimitedTime = 3, Everyday = 4, Frequency = 5, LocationBased = 6, MSA = 7.")
    private Integer offerType;
    /**
     * Value of the discount if the offer is offerdiscount.
     * 
     */
    @JsonProperty("orderDiscount")
    @JsonPropertyDescription("Value of the discount if the offer is offerdiscount.")
    private Integer orderDiscount;
    /**
     * Absolute value of the discount from a given offer.
     * 
     */
    @JsonProperty("orderDiscountBA")
    @JsonPropertyDescription("Absolute value of the discount from a given offer.")
    private Integer orderDiscountBA;
    /**
     * Unknow = 0, PROMO = 1, PRICE = 2.
     * 
     */
    @JsonProperty("orderDiscountType")
    @JsonPropertyDescription("Unknow = 0, PROMO = 1, PRICE = 2.")
    private Integer orderDiscountType;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("productSets")
    private List<ProductSet> productSets = null;
    @JsonProperty("conditions")
    private Conditions conditions;
    /**
     * When a store send confirmation that an offer was used in a sale, then the corresponding offer will be marked as redeemed.
     * (Required)
     * 
     */
    @JsonProperty("reedemed")
    @JsonPropertyDescription("When a store send confirmation that an offer was used in a sale, then the corresponding offer will be marked as redeemed.")
    private Boolean reedemed;
    /**
     * The ISO 8601 timestamp that register when the corresponding offer was marked as redeemed.
     * 
     */
    @JsonProperty("reedemedAt")
    @JsonPropertyDescription("The ISO 8601 timestamp that register when the corresponding offer was marked as redeemed.")
    private String reedemedAt;
    @JsonProperty("restaurants")
    private List<Integer> restaurants = null;
    /**
     * Indicates if the offer was previously selected by the customer.
     * (Required)
     * 
     */
    @JsonProperty("selected")
    @JsonPropertyDescription("Indicates if the offer was previously selected by the customer.")
    private Boolean selected;
    /**
     * Short description of the offer.
     * 
     */
    @JsonProperty("shortDescription")
    @JsonPropertyDescription("Short description of the offer.")
    private String shortDescription;
    /**
     * The total of punches necessary to redeem a Frequency offer type.
     * (Required)
     * 
     */
    @JsonProperty("totalPunch")
    @JsonPropertyDescription("The total of punches necessary to redeem a Frequency offer type.")
    private Integer totalPunch;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * Indicates if this offer has been archived (marked as 'not interested')
     * (Required)
     * 
     */
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    /**
     * Indicates if this offer has been archived (marked as 'not interested')
     * (Required)
     * 
     */
    @JsonProperty("archived")
    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    /**
     * The CurrentPunch is the offer’s punch, it exists only for ‘Frequency offers’ and determines howmany punches were already stamped in the offer.
     * (Required)
     * 
     */
    @JsonProperty("currentPunch")
    public Integer getCurrentPunch() {
        return currentPunch;
    }

    /**
     * The CurrentPunch is the offer’s punch, it exists only for ‘Frequency offers’ and determines howmany punches were already stamped in the offer.
     * (Required)
     * 
     */
    @JsonProperty("currentPunch")
    public void setCurrentPunch(Integer currentPunch) {
        this.currentPunch = currentPunch;
    }

    /**
     * Used to inform the duration (in hours) of the offer snooze (Default value is null).
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public Integer getDuration() {
        return duration;
    }

    /**
     * Used to inform the duration (in hours) of the offer snooze (Default value is null).
     * (Required)
     * 
     */
    @JsonProperty("duration")
    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Used to inform if the initial expiration date has changed.
     * 
     */
    @JsonProperty("expirationChanged")
    public Boolean getExpirationChanged() {
        return expirationChanged;
    }

    /**
     * Used to inform if the initial expiration date has changed.
     * 
     */
    @JsonProperty("expirationChanged")
    public void setExpirationChanged(Boolean expirationChanged) {
        this.expirationChanged = expirationChanged;
    }

    /**
     * The ISO 8601 timestamp that register when the initial expiration date changed.
     * 
     */
    @JsonProperty("expirationChangedAt")
    public String getExpirationChangedAt() {
        return expirationChangedAt;
    }

    /**
     * The ISO 8601 timestamp that register when the initial expiration date changed.
     * 
     */
    @JsonProperty("expirationChangedAt")
    public void setExpirationChangedAt(String expirationChangedAt) {
        this.expirationChangedAt = expirationChangedAt;
    }

    /**
     * Indicates if this offer has expired.
     * (Required)
     * 
     */
    @JsonProperty("expired")
    public Boolean getExpired() {
        return expired;
    }

    /**
     * Indicates if this offer has expired.
     * (Required)
     * 
     */
    @JsonProperty("expired")
    public void setExpired(Boolean expired) {
        this.expired = expired;
    }

    /**
     *  Used to inform if the snooze can be extended to the end of the day (Default value is null).
     * 
     */
    @JsonProperty("extendToEOD")
    public Integer getExtendToEOD() {
        return extendToEOD;
    }

    /**
     *  Used to inform if the snooze can be extended to the end of the day (Default value is null).
     * 
     */
    @JsonProperty("extendToEOD")
    public void setExtendToEOD(Integer extendToEOD) {
        this.extendToEOD = extendToEOD;
    }

    /**
     * Offer unique identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    /**
     * Offer unique identifier.
     * (Required)
     * 
     */
    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * Path to the offer's image.
     * (Required)
     * 
     */
    @JsonProperty("imageBaseName")
    public String getImageBaseName() {
        return imageBaseName;
    }

    /**
     * Path to the offer's image.
     * (Required)
     * 
     */
    @JsonProperty("imageBaseName")
    public void setImageBaseName(String imageBaseName) {
        this.imageBaseName = imageBaseName;
    }

    /**
     * Optional date when the offer begins to be valid. This is always expressed in the local store time.
     * (Required)
     * 
     */
    @JsonProperty("localValidFrom")
    public String getLocalValidFrom() {
        return localValidFrom;
    }

    /**
     * Optional date when the offer begins to be valid. This is always expressed in the local store time.
     * (Required)
     * 
     */
    @JsonProperty("localValidFrom")
    public void setLocalValidFrom(String localValidFrom) {
        this.localValidFrom = localValidFrom;
    }

    /**
     * The date to which the Offer will be valid.
     * (Required)
     * 
     */
    @JsonProperty("localValidThru")
    public String getLocalValidThru() {
        return localValidThru;
    }

    /**
     * The date to which the Offer will be valid.
     * (Required)
     * 
     */
    @JsonProperty("localValidThru")
    public void setLocalValidThru(String localValidThru) {
        this.localValidThru = localValidThru;
    }

    /**
     * Long description of the offer.
     * 
     */
    @JsonProperty("longDescription")
    public String getLongDescription() {
        return longDescription;
    }

    /**
     * Long description of the offer.
     * 
     */
    @JsonProperty("longDescription")
    public void setLongDescription(String longDescription) {
        this.longDescription = longDescription;
    }

    /**
     * Name of the offer.
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * Name of the offer.
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Reward = 1, Weekly = 2, LimitedTime = 3, Everyday = 4, Frequency = 5, LocationBased = 6, MSA = 7.
     * (Required)
     * 
     */
    @JsonProperty("offerType")
    public Integer getOfferType() {
        return offerType;
    }

    /**
     * Reward = 1, Weekly = 2, LimitedTime = 3, Everyday = 4, Frequency = 5, LocationBased = 6, MSA = 7.
     * (Required)
     * 
     */
    @JsonProperty("offerType")
    public void setOfferType(Integer offerType) {
        this.offerType = offerType;
    }

    /**
     * Value of the discount if the offer is offerdiscount.
     * 
     */
    @JsonProperty("orderDiscount")
    public Integer getOrderDiscount() {
        return orderDiscount;
    }

    /**
     * Value of the discount if the offer is offerdiscount.
     * 
     */
    @JsonProperty("orderDiscount")
    public void setOrderDiscount(Integer orderDiscount) {
        this.orderDiscount = orderDiscount;
    }

    /**
     * Absolute value of the discount from a given offer.
     * 
     */
    @JsonProperty("orderDiscountBA")
    public Integer getOrderDiscountBA() {
        return orderDiscountBA;
    }

    /**
     * Absolute value of the discount from a given offer.
     * 
     */
    @JsonProperty("orderDiscountBA")
    public void setOrderDiscountBA(Integer orderDiscountBA) {
        this.orderDiscountBA = orderDiscountBA;
    }

    /**
     * Unknow = 0, PROMO = 1, PRICE = 2.
     * 
     */
    @JsonProperty("orderDiscountType")
    public Integer getOrderDiscountType() {
        return orderDiscountType;
    }

    /**
     * Unknow = 0, PROMO = 1, PRICE = 2.
     * 
     */
    @JsonProperty("orderDiscountType")
    public void setOrderDiscountType(Integer orderDiscountType) {
        this.orderDiscountType = orderDiscountType;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("productSets")
    public List<ProductSet> getProductSets() {
        return productSets;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("productSets")
    public void setProductSets(List<ProductSet> productSets) {
        this.productSets = productSets;
    }

    @JsonProperty("conditions")
    public Conditions getConditions() {
        return conditions;
    }

    @JsonProperty("conditions")
    public void setConditions(Conditions conditions) {
        this.conditions = conditions;
    }

    /**
     * When a store send confirmation that an offer was used in a sale, then the corresponding offer will be marked as redeemed.
     * (Required)
     * 
     */
    @JsonProperty("reedemed")
    public Boolean getReedemed() {
        return reedemed;
    }

    /**
     * When a store send confirmation that an offer was used in a sale, then the corresponding offer will be marked as redeemed.
     * (Required)
     * 
     */
    @JsonProperty("reedemed")
    public void setReedemed(Boolean reedemed) {
        this.reedemed = reedemed;
    }

    /**
     * The ISO 8601 timestamp that register when the corresponding offer was marked as redeemed.
     * 
     */
    @JsonProperty("reedemedAt")
    public String getReedemedAt() {
        return reedemedAt;
    }

    /**
     * The ISO 8601 timestamp that register when the corresponding offer was marked as redeemed.
     * 
     */
    @JsonProperty("reedemedAt")
    public void setReedemedAt(String reedemedAt) {
        this.reedemedAt = reedemedAt;
    }

    @JsonProperty("restaurants")
    public List<Integer> getRestaurants() {
        return restaurants;
    }

    @JsonProperty("restaurants")
    public void setRestaurants(List<Integer> restaurants) {
        this.restaurants = restaurants;
    }

    /**
     * Indicates if the offer was previously selected by the customer.
     * (Required)
     * 
     */
    @JsonProperty("selected")
    public Boolean getSelected() {
        return selected;
    }

    /**
     * Indicates if the offer was previously selected by the customer.
     * (Required)
     * 
     */
    @JsonProperty("selected")
    public void setSelected(Boolean selected) {
        this.selected = selected;
    }

    /**
     * Short description of the offer.
     * 
     */
    @JsonProperty("shortDescription")
    public String getShortDescription() {
        return shortDescription;
    }

    /**
     * Short description of the offer.
     * 
     */
    @JsonProperty("shortDescription")
    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    /**
     * The total of punches necessary to redeem a Frequency offer type.
     * (Required)
     * 
     */
    @JsonProperty("totalPunch")
    public Integer getTotalPunch() {
        return totalPunch;
    }

    /**
     * The total of punches necessary to redeem a Frequency offer type.
     * (Required)
     * 
     */
    @JsonProperty("totalPunch")
    public void setTotalPunch(Integer totalPunch) {
        this.totalPunch = totalPunch;
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
