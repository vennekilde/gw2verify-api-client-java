package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.status;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.status.model.StatusGETHeader;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.status.model.StatusGETQueryParam;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public class Status {

    private String _baseUrl;
    private Client _client;

    public Status(String baseUrl, Client _client) {
        _baseUrl = (baseUrl + "/status");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * Get a users verification status
     *
     */
    public com.farshiverpeaks.gw2verifyclient.model.VerificationStatus get(StatusGETQueryParam queryParameters, StatusGETHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        if (queryParameters.getDisplayName() != null) {
            target = target.queryParam("display_name", queryParameters.getDisplayName());
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
        return response.readEntity(com.farshiverpeaks.gw2verifyclient.model.VerificationStatus.class);
    }

}
