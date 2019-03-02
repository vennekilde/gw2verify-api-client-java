package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.model.PropertiesGETHeader;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.model.PropertiesGETResponse;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.model.PropertiesPUTHeader;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.model.PropertiesPUTQueryParam;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.property.Property;
import java.util.List;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.Response;

public class Properties {

    private String _baseUrl;
    private Client _client;

    public Properties(String baseUrl, Client _client) {
        _baseUrl = (baseUrl + "/properties");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Get all user properties
     *
     */
    public List<PropertiesGETResponse> get(PropertiesGETHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE);
        if (headers.getXAccessToken() != null) {
            invocationBuilder.header("X-Access-Token", headers.getXAccessToken());
        }
        Response response = invocationBuilder.get();
        if (response.getStatusInfo().getFamily() != javax.ws.rs.core.Response.Status.Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(new GenericType<List<PropertiesGETResponse>>() {

        }
        );
    }

    /**
     * Set a user property
     *
     */
    public String put(PropertiesPUTQueryParam queryParameters, PropertiesPUTHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        if (queryParameters.getName() != null) {
            target = target.queryParam("name", queryParameters.getName());
        }
        if (queryParameters.getValue() != null) {
            target = target.queryParam("value", queryParameters.getValue());
        }
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(javax.ws.rs.core.MediaType.APPLICATION_JSON_TYPE);
        if (headers.getXAccessToken() != null) {
            invocationBuilder.header("X-Access-Token", headers.getXAccessToken());
        }
        Response response = invocationBuilder.put(null);
        if (response.getStatusInfo().getFamily() != javax.ws.rs.core.Response.Status.Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(String.class);
    }

    public final Property property(String property) {
        return new Property(getBaseUri(), getClient(), property);
    }

}
