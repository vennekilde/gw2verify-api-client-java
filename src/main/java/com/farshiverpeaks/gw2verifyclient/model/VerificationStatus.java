
package com.farshiverpeaks.gw2verifyclient.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "status",
    "expires",
    "account_id",
    "ban_reason",
    "is_primary",
    "primary_user_id",
    "service_links",
    "attributes"
})
public class VerificationStatus {

    @JsonProperty("status")
    private String status;
    @JsonProperty("expires")
    private Long expires;
    @JsonProperty("account_id")
    private String accountId;
    @JsonProperty("ban_reason")
    private String banReason;
    @JsonProperty("is_primary")
    private Boolean isPrimary;
    @JsonProperty("primary_user_id")
    private String primaryUserId;
    @JsonProperty("service_links")
    private List<ServiceLink> serviceLinks = new ArrayList<ServiceLink>();
    @JsonProperty("attributes")
    private List<String> attributes = new ArrayList<String>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public VerificationStatus() {
    }

    /**
     * 
     * @param accountId
     * @param serviceLinks
     * @param expires
     * @param isPrimary
     * @param attributes
     * @param status
     * @param banReason
     * @param primaryUserId
     */
    public VerificationStatus(String status, Long expires, String accountId, String banReason, Boolean isPrimary, String primaryUserId, List<ServiceLink> serviceLinks, List<String> attributes) {
        super();
        this.status = status;
        this.expires = expires;
        this.accountId = accountId;
        this.banReason = banReason;
        this.isPrimary = isPrimary;
        this.primaryUserId = primaryUserId;
        this.serviceLinks = serviceLinks;
        this.attributes = attributes;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    public VerificationStatus withStatus(String status) {
        this.status = status;
        return this;
    }

    @JsonProperty("expires")
    public Long getExpires() {
        return expires;
    }

    @JsonProperty("expires")
    public void setExpires(Long expires) {
        this.expires = expires;
    }

    public VerificationStatus withExpires(Long expires) {
        this.expires = expires;
        return this;
    }

    @JsonProperty("account_id")
    public String getAccountId() {
        return accountId;
    }

    @JsonProperty("account_id")
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public VerificationStatus withAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }

    @JsonProperty("ban_reason")
    public String getBanReason() {
        return banReason;
    }

    @JsonProperty("ban_reason")
    public void setBanReason(String banReason) {
        this.banReason = banReason;
    }

    public VerificationStatus withBanReason(String banReason) {
        this.banReason = banReason;
        return this;
    }

    @JsonProperty("is_primary")
    public Boolean getIsPrimary() {
        return isPrimary;
    }

    @JsonProperty("is_primary")
    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public VerificationStatus withIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
        return this;
    }

    @JsonProperty("primary_user_id")
    public String getPrimaryUserId() {
        return primaryUserId;
    }

    @JsonProperty("primary_user_id")
    public void setPrimaryUserId(String primaryUserId) {
        this.primaryUserId = primaryUserId;
    }

    public VerificationStatus withPrimaryUserId(String primaryUserId) {
        this.primaryUserId = primaryUserId;
        return this;
    }

    @JsonProperty("service_links")
    public List<ServiceLink> getServiceLinks() {
        return serviceLinks;
    }

    @JsonProperty("service_links")
    public void setServiceLinks(List<ServiceLink> serviceLinks) {
        this.serviceLinks = serviceLinks;
    }

    public VerificationStatus withServiceLinks(List<ServiceLink> serviceLinks) {
        this.serviceLinks = serviceLinks;
        return this;
    }

    @JsonProperty("attributes")
    public List<String> getAttributes() {
        return attributes;
    }

    @JsonProperty("attributes")
    public void setAttributes(List<String> attributes) {
        this.attributes = attributes;
    }

    public VerificationStatus withAttributes(List<String> attributes) {
        this.attributes = attributes;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    public VerificationStatus withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("status", status).append("expires", expires).append("accountId", accountId).append("banReason", banReason).append("isPrimary", isPrimary).append("primaryUserId", primaryUserId).append("serviceLinks", serviceLinks).append("attributes", attributes).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accountId).append(serviceLinks).append(expires).append(isPrimary).append(attributes).append(additionalProperties).append(status).append(banReason).append(primaryUserId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof VerificationStatus) == false) {
            return false;
        }
        VerificationStatus rhs = ((VerificationStatus) other);
        return new EqualsBuilder().append(accountId, rhs.accountId).append(serviceLinks, rhs.serviceLinks).append(expires, rhs.expires).append(isPrimary, rhs.isPrimary).append(attributes, rhs.attributes).append(additionalProperties, rhs.additionalProperties).append(status, rhs.status).append(banReason, rhs.banReason).append(primaryUserId, rhs.primaryUserId).isEquals();
    }

}
