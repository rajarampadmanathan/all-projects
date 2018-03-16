
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
    "action",
    "alias",
    "anyProduct",
    "maxUnitPrice",
    "maxUnitPriceAlias",
    "minUnitPrice",
    "minUnitPriceAlias",
    "products",
    "promoItem",
    "quantity",
    "sortMethod",
    "swapMapping"
})
public class ProductSet {

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("action")
    private Action action;
    /**
     * Optional alias to assign to the matched item(s). This alias can be referenced by the promotion actions tomodify sale items. E.g.: alias=”Item to give discount.
     * (Required)
     * 
     */
    @JsonProperty("alias")
    @JsonPropertyDescription("Optional alias to assign to the matched item(s). This alias can be referenced by the promotion actions tomodify sale items. E.g.: alias=\u201dItem to give discount.")
    private String alias;
    /**
     * When set to true, the attribute codes will be ignored and this condition will match any product code. E.g.: anyProduct=true.
     * (Required)
     * 
     */
    @JsonProperty("anyProduct")
    @JsonPropertyDescription("When set to true, the attribute codes will be ignored and this condition will match any product code. E.g.: anyProduct=true.")
    private Boolean anyProduct;
    /**
     * Defines the maximum product unit price required to match (lesser than or equal to). E.g.: maxUnitPrice=10.00.
     * (Required)
     * 
     */
    @JsonProperty("maxUnitPrice")
    @JsonPropertyDescription("Defines the maximum product unit price required to match (lesser than or equal to). E.g.: maxUnitPrice=10.00.")
    private Integer maxUnitPrice;
    /**
     * Defines from which alias to get the maximum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.
     * (Required)
     * 
     */
    @JsonProperty("maxUnitPriceAlias")
    @JsonPropertyDescription("Defines from which alias to get the maximum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.")
    private String maxUnitPriceAlias;
    /**
     * Defines the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPrice=10.00
     * (Required)
     * 
     */
    @JsonProperty("minUnitPrice")
    @JsonPropertyDescription("Defines the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPrice=10.00")
    private Integer minUnitPrice;
    /**
     * Defines from which alias to get the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.
     * (Required)
     * 
     */
    @JsonProperty("minUnitPriceAlias")
    @JsonPropertyDescription("Defines from which alias to get the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.")
    private String minUnitPriceAlias;
    @JsonProperty("products")
    private List<Integer> products = null;
    /**
     * This action promo’s a Menu Item (i.e. give it for free).
     * (Required)
     * 
     */
    @JsonProperty("promoItem")
    @JsonPropertyDescription("This action promo\u2019s a Menu Item (i.e. give it for free).")
    private Boolean promoItem;
    /**
     * Number of sale items to search for. E.g.: qty=5.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    @JsonPropertyDescription("Number of sale items to search for. E.g.: qty=5.")
    private Integer quantity;
    /**
     * Criteria used to select 'Buy' and 'Get' products when more than one product in the order meets the criteria for eligible or conditional products or both.
     * 
     */
    @JsonProperty("sortMethod")
    @JsonPropertyDescription("Criteria used to select 'Buy' and 'Get' products when more than one product in the order meets the criteria for eligible or conditional products or both.")
    private Integer sortMethod;
    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("swapMapping")
    private List<SwapMapping> swapMapping = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("action")
    public Action getAction() {
        return action;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("action")
    public void setAction(Action action) {
        this.action = action;
    }

    /**
     * Optional alias to assign to the matched item(s). This alias can be referenced by the promotion actions tomodify sale items. E.g.: alias=”Item to give discount.
     * (Required)
     * 
     */
    @JsonProperty("alias")
    public String getAlias() {
        return alias;
    }

    /**
     * Optional alias to assign to the matched item(s). This alias can be referenced by the promotion actions tomodify sale items. E.g.: alias=”Item to give discount.
     * (Required)
     * 
     */
    @JsonProperty("alias")
    public void setAlias(String alias) {
        this.alias = alias;
    }

    /**
     * When set to true, the attribute codes will be ignored and this condition will match any product code. E.g.: anyProduct=true.
     * (Required)
     * 
     */
    @JsonProperty("anyProduct")
    public Boolean getAnyProduct() {
        return anyProduct;
    }

    /**
     * When set to true, the attribute codes will be ignored and this condition will match any product code. E.g.: anyProduct=true.
     * (Required)
     * 
     */
    @JsonProperty("anyProduct")
    public void setAnyProduct(Boolean anyProduct) {
        this.anyProduct = anyProduct;
    }

    /**
     * Defines the maximum product unit price required to match (lesser than or equal to). E.g.: maxUnitPrice=10.00.
     * (Required)
     * 
     */
    @JsonProperty("maxUnitPrice")
    public Integer getMaxUnitPrice() {
        return maxUnitPrice;
    }

    /**
     * Defines the maximum product unit price required to match (lesser than or equal to). E.g.: maxUnitPrice=10.00.
     * (Required)
     * 
     */
    @JsonProperty("maxUnitPrice")
    public void setMaxUnitPrice(Integer maxUnitPrice) {
        this.maxUnitPrice = maxUnitPrice;
    }

    /**
     * Defines from which alias to get the maximum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.
     * (Required)
     * 
     */
    @JsonProperty("maxUnitPriceAlias")
    public String getMaxUnitPriceAlias() {
        return maxUnitPriceAlias;
    }

    /**
     * Defines from which alias to get the maximum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.
     * (Required)
     * 
     */
    @JsonProperty("maxUnitPriceAlias")
    public void setMaxUnitPriceAlias(String maxUnitPriceAlias) {
        this.maxUnitPriceAlias = maxUnitPriceAlias;
    }

    /**
     * Defines the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPrice=10.00
     * (Required)
     * 
     */
    @JsonProperty("minUnitPrice")
    public Integer getMinUnitPrice() {
        return minUnitPrice;
    }

    /**
     * Defines the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPrice=10.00
     * (Required)
     * 
     */
    @JsonProperty("minUnitPrice")
    public void setMinUnitPrice(Integer minUnitPrice) {
        this.minUnitPrice = minUnitPrice;
    }

    /**
     * Defines from which alias to get the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.
     * (Required)
     * 
     */
    @JsonProperty("minUnitPriceAlias")
    public String getMinUnitPriceAlias() {
        return minUnitPriceAlias;
    }

    /**
     * Defines from which alias to get the minimum product unit price required to match (greater than or equal to). E.g.: minUnitPriceAlias='Some item'.
     * (Required)
     * 
     */
    @JsonProperty("minUnitPriceAlias")
    public void setMinUnitPriceAlias(String minUnitPriceAlias) {
        this.minUnitPriceAlias = minUnitPriceAlias;
    }

    @JsonProperty("products")
    public List<Integer> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Integer> products) {
        this.products = products;
    }

    /**
     * This action promo’s a Menu Item (i.e. give it for free).
     * (Required)
     * 
     */
    @JsonProperty("promoItem")
    public Boolean getPromoItem() {
        return promoItem;
    }

    /**
     * This action promo’s a Menu Item (i.e. give it for free).
     * (Required)
     * 
     */
    @JsonProperty("promoItem")
    public void setPromoItem(Boolean promoItem) {
        this.promoItem = promoItem;
    }

    /**
     * Number of sale items to search for. E.g.: qty=5.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public Integer getQuantity() {
        return quantity;
    }

    /**
     * Number of sale items to search for. E.g.: qty=5.
     * (Required)
     * 
     */
    @JsonProperty("quantity")
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    /**
     * Criteria used to select 'Buy' and 'Get' products when more than one product in the order meets the criteria for eligible or conditional products or both.
     * 
     */
    @JsonProperty("sortMethod")
    public Integer getSortMethod() {
        return sortMethod;
    }

    /**
     * Criteria used to select 'Buy' and 'Get' products when more than one product in the order meets the criteria for eligible or conditional products or both.
     * 
     */
    @JsonProperty("sortMethod")
    public void setSortMethod(Integer sortMethod) {
        this.sortMethod = sortMethod;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("swapMapping")
    public List<SwapMapping> getSwapMapping() {
        return swapMapping;
    }

    /**
     * 
     * (Required)
     * 
     */
    @JsonProperty("swapMapping")
    public void setSwapMapping(List<SwapMapping> swapMapping) {
        this.swapMapping = swapMapping;
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
