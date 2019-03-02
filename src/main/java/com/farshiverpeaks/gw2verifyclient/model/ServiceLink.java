
package com.farshiverpeaks.gw2verifyclient.model;

import java.util.HashMap;
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
    "service_user_id",
    "service_id",
    "display_name"
})
public class ServiceLink {

    @JsonProperty("service_user_id")
    private String serviceUserId;
    @JsonProperty("service_id")
    private Long serviceId;
    @JsonProperty("display_name")
    private String displayName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public ServiceLink() {
    }

    /**
     * 
     * @param serviceUserId
     * @param displayName
     * @param serviceId
     */
    public ServiceLink(String serviceUserId, Long serviceId, String displayName) {
        super();
        this.serviceUserId = serviceUserId;
        this.serviceId = serviceId;
        this.displayName = displayName;
    }

    @JsonProperty("service_user_id")
    public String getServiceUserId() {
        return serviceUserId;
    }

    @JsonProperty("service_user_id")
    public void setServiceUserId(String serviceUserId) {
        this.serviceUserId = serviceUserId;
    }

    public ServiceLink withServiceUserId(String serviceUserId) {
        this.serviceUserId = serviceUserId;
        return this;
    }

    @JsonProperty("service_id")
    public Long getServiceId() {
        return serviceId;
    }

    @JsonProperty("service_id")
    public void setServiceId(Long serviceId) {
        this.serviceId = serviceId;
    }

    public ServiceLink withServiceId(Long serviceId) {
        this.serviceId = serviceId;
        return this;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ServiceLink withDisplayName(String displayName) {
        this.displayName = displayName;
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

    public ServiceLink withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("serviceUserId", serviceUserId).append("serviceId", serviceId).append("displayName", displayName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(serviceUserId).append(serviceId).append(displayName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ServiceLink) == false) {
            return false;
        }
        ServiceLink rhs = ((ServiceLink) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(serviceUserId, rhs.serviceUserId).append(serviceId, rhs.serviceId).append(displayName, rhs.displayName).isEquals();
    }

}
