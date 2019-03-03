package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import com.farshiverpeaks.gw2verifyclient.model.APIKeyData;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.model.ApikeyPUTHeader;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.model.ApikeyPUTQueryParam;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.name.Name;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public class Apikey {

    private String _baseUrl;
    private Client _client;
    public final Name name;

    public Apikey(String baseUrl, Client _client) {
        _baseUrl = (baseUrl + "/apikey");
        this._client = _client;
        name = new Name(getBaseUri(), getClient());
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Set a service user's API key
     *
     */
    public String put(APIKeyData body, ApikeyPUTQueryParam queryParameters, ApikeyPUTHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        if (queryParameters.getSkipRequirements() != null) {
            target = target.queryParam("skip-requirements", queryParameters.getSkipRequirements());
        }
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        if (headers.getXAccessToken() != null) {
            invocationBuilder.header("X-Access-Token", headers.getXAccessToken());
        }
        Response response = invocationBuilder.put(Entity.json(body));
        if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(String.class);
    }

}
