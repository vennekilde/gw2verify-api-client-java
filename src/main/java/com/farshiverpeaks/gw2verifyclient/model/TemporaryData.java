
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
    "world",
    "access_type",
    "display_name"
})
public class TemporaryData {

    @JsonProperty("world")
    private Long world;
    @JsonProperty("access_type")
    private String accessType;
    @JsonProperty("display_name")
    private String displayName;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public TemporaryData() {
    }

    /**
     * 
     * @param accessType
     * @param world
     * @param displayName
     */
    public TemporaryData(Long world, String accessType, String displayName) {
        super();
        this.world = world;
        this.accessType = accessType;
        this.displayName = displayName;
    }

    @JsonProperty("world")
    public Long getWorld() {
        return world;
    }

    @JsonProperty("world")
    public void setWorld(Long world) {
        this.world = world;
    }

    public TemporaryData withWorld(Long world) {
        this.world = world;
        return this;
    }

    @JsonProperty("access_type")
    public String getAccessType() {
        return accessType;
    }

    @JsonProperty("access_type")
    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public TemporaryData withAccessType(String accessType) {
        this.accessType = accessType;
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

    public TemporaryData withDisplayName(String displayName) {
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

    public TemporaryData withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("world", world).append("accessType", accessType).append("displayName", displayName).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(accessType).append(world).append(additionalProperties).append(displayName).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TemporaryData) == false) {
            return false;
        }
        TemporaryData rhs = ((TemporaryData) other);
        return new EqualsBuilder().append(accessType, rhs.accessType).append(world, rhs.world).append(additionalProperties, rhs.additionalProperties).append(displayName, rhs.displayName).isEquals();
    }

}
