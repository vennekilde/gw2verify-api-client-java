
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
    "apikey",
    "primary"
})
public class APIKeyData {

    @JsonProperty("apikey")
    private String apikey;
    @JsonProperty("primary")
    private Boolean primary;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public APIKeyData() {
    }

    /**
     * 
     * @param apikey
     * @param primary
     */
    public APIKeyData(String apikey, Boolean primary) {
        super();
        this.apikey = apikey;
        this.primary = primary;
    }

    @JsonProperty("apikey")
    public String getApikey() {
        return apikey;
    }

    @JsonProperty("apikey")
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    public APIKeyData withApikey(String apikey) {
        this.apikey = apikey;
        return this;
    }

    @JsonProperty("primary")
    public Boolean getPrimary() {
        return primary;
    }

    @JsonProperty("primary")
    public void setPrimary(Boolean primary) {
        this.primary = primary;
    }

    public APIKeyData withPrimary(Boolean primary) {
        this.primary = primary;
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

    public APIKeyData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("apikey", apikey).append("primary", primary).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(apikey).append(primary).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof APIKeyData) == false) {
            return false;
        }
        APIKeyData rhs = ((APIKeyData) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(apikey, rhs.apikey).append(primary, rhs.primary).isEquals();
    }

}
