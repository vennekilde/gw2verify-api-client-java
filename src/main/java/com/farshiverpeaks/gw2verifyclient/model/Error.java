
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
    "error",
    "safe-display-error"
})
public class Error {

    @JsonProperty("error")
    private String error;
    @JsonProperty("safe-display-error")
    private String safeDisplayError;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Error() {
    }

    /**
     * 
     * @param error
     * @param safeDisplayError
     */
    public Error(String error, String safeDisplayError) {
        super();
        this.error = error;
        this.safeDisplayError = safeDisplayError;
    }

    @JsonProperty("error")
    public String getError() {
        return error;
    }

    @JsonProperty("error")
    public void setError(String error) {
        this.error = error;
    }

    public Error withError(String error) {
        this.error = error;
        return this;
    }

    @JsonProperty("safe-display-error")
    public String getSafeDisplayError() {
        return safeDisplayError;
    }

    @JsonProperty("safe-display-error")
    public void setSafeDisplayError(String safeDisplayError) {
        this.safeDisplayError = safeDisplayError;
    }

    public Error withSafeDisplayError(String safeDisplayError) {
        this.safeDisplayError = safeDisplayError;
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

    public Error withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("error", error).append("safeDisplayError", safeDisplayError).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(error).append(safeDisplayError).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(error, rhs.error).append(safeDisplayError, rhs.safeDisplayError).isEquals();
    }

}
