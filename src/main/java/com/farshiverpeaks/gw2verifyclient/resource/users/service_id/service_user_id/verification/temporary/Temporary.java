package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.temporary;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import com.farshiverpeaks.gw2verifyclient.model.TemporaryData;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.temporary.model.TemporaryPUTHeader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public class Temporary {

    private String _baseUrl;
    private Client _client;

    public Temporary(String baseUrl, Client _client) {
        _baseUrl = (baseUrl + "/temporary");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Grant a user temporary world relation. Additionally, the "temp_expired"
     * property will be removed from the user's properties
     *
     */
    public Long put(TemporaryData body, TemporaryPUTHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        if (headers.getXAccessToken() != null) {
            invocationBuilder.header("X-Access-Token", headers.getXAccessToken());
        }
        Response response = invocationBuilder.put(Entity.json(body));
        if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(Long.class);
    }

}
