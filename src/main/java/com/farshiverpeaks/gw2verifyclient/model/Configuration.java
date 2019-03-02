
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
    "expiration_time",
    "temporary_access_expiration_time",
    "home_world",
    "link_worlds"
})
public class Configuration {

    @JsonProperty("expiration_time")
    private Long expirationTime;
    @JsonProperty("temporary_access_expiration_time")
    private Long temporaryAccessExpirationTime;
    @JsonProperty("home_world")
    private Long homeWorld;
    @JsonProperty("link_worlds")
    private List<Long> linkWorlds = new ArrayList<Long>();
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public Configuration() {
    }

    /**
     * 
     * @param expirationTime
     * @param linkWorlds
     * @param temporaryAccessExpirationTime
     * @param homeWorld
     */
    public Configuration(Long expirationTime, Long temporaryAccessExpirationTime, Long homeWorld, List<Long> linkWorlds) {
        super();
        this.expirationTime = expirationTime;
        this.temporaryAccessExpirationTime = temporaryAccessExpirationTime;
        this.homeWorld = homeWorld;
        this.linkWorlds = linkWorlds;
    }

    @JsonProperty("expiration_time")
    public Long getExpirationTime() {
        return expirationTime;
    }

    @JsonProperty("expiration_time")
    public void setExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
    }

    public Configuration withExpirationTime(Long expirationTime) {
        this.expirationTime = expirationTime;
        return this;
    }

    @JsonProperty("temporary_access_expiration_time")
    public Long getTemporaryAccessExpirationTime() {
        return temporaryAccessExpirationTime;
    }

    @JsonProperty("temporary_access_expiration_time")
    public void setTemporaryAccessExpirationTime(Long temporaryAccessExpirationTime) {
        this.temporaryAccessExpirationTime = temporaryAccessExpirationTime;
    }

    public Configuration withTemporaryAccessExpirationTime(Long temporaryAccessExpirationTime) {
        this.temporaryAccessExpirationTime = temporaryAccessExpirationTime;
        return this;
    }

    @JsonProperty("home_world")
    public Long getHomeWorld() {
        return homeWorld;
    }

    @JsonProperty("home_world")
    public void setHomeWorld(Long homeWorld) {
        this.homeWorld = homeWorld;
    }

    public Configuration withHomeWorld(Long homeWorld) {
        this.homeWorld = homeWorld;
        return this;
    }

    @JsonProperty("link_worlds")
    public List<Long> getLinkWorlds() {
        return linkWorlds;
    }

    @JsonProperty("link_worlds")
    public void setLinkWorlds(List<Long> linkWorlds) {
        this.linkWorlds = linkWorlds;
    }

    public Configuration withLinkWorlds(List<Long> linkWorlds) {
        this.linkWorlds = linkWorlds;
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

    public Configuration withAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("expirationTime", expirationTime).append("temporaryAccessExpirationTime", temporaryAccessExpirationTime).append("homeWorld", homeWorld).append("linkWorlds", linkWorlds).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(linkWorlds).append(additionalProperties).append(temporaryAccessExpirationTime).append(homeWorld).append(expirationTime).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Configuration) == false) {
            return false;
        }
        Configuration rhs = ((Configuration) other);
        return new EqualsBuilder().append(linkWorlds, rhs.linkWorlds).append(additionalProperties, rhs.additionalProperties).append(temporaryAccessExpirationTime, rhs.temporaryAccessExpirationTime).append(homeWorld, rhs.homeWorld).append(expirationTime, rhs.expirationTime).isEquals();
    }

}
