package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.property;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.property.model.PropertyGETHeader;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.property.model.PropertyGETQueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public class Property {

    private String _baseUrl;
    private Client _client;

    public Property(String baseUrl, Client _client, String uriParam) {
        _baseUrl = (baseUrl + ("/" + uriParam));
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Get a user property
     *
     */
    public com.farshiverpeaks.gw2verifyclient.model.Property get(PropertyGETQueryParam queryParameters, PropertyGETHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        if (queryParameters.getName() != null) {
            target = target.queryParam("name", queryParameters.getName());
        }
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        if (headers.getXAccessToken() != null) {
            invocationBuilder.header("X-Access-Token", headers.getXAccessToken());
        }
        Response response = invocationBuilder.get();
        if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(com.farshiverpeaks.gw2verifyclient.model.Property.class);
    }

}
