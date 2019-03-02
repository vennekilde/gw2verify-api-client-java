package com.farshiverpeaks.gw2verifyclient.resource.updates.service_id.subscribe;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public class Subscribe {

    private String _baseUrl;
    private Client _client;

    public Subscribe(String baseUrl, Client _client) {
        _baseUrl = (baseUrl + "/subscribe");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Long polling rest endpoint for receiving verification updates
     *
     */
    public com.farshiverpeaks.gw2verifyclient.model.VerificationStatus get() throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        Response response = invocationBuilder.get();
        if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(com.farshiverpeaks.gw2verifyclient.model.VerificationStatus.class);
    }

}
