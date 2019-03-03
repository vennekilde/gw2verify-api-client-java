package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.name;

import com.farshiverpeaks.gw2verifyclient.exceptions.GuildWars2VerificationAPIException;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.name.model.NamePUTHeader;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status.Family;

public class Name {

    private String _baseUrl;
    private Client _client;

    public Name(String baseUrl, Client _client) {
        _baseUrl = (baseUrl + "/name");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    /**
     * SetGet a service user's apikey name they are required to use if apikey
     * name restriction is enforced
     *
     */
    public com.farshiverpeaks.gw2verifyclient.model.APIKeyName put(NamePUTHeader headers) throws GuildWars2VerificationAPIException {
        WebTarget target = this._client.target(getBaseUri());
        final javax.ws.rs.client.Invocation.Builder invocationBuilder = target.request(MediaType.APPLICATION_JSON_TYPE);
        if (headers.getXAccessToken() != null) {
            invocationBuilder.header("X-Access-Token", headers.getXAccessToken());
        }
        Response response = invocationBuilder.put(null);
        if (response.getStatusInfo().getFamily() != Family.SUCCESSFUL) {
            Response.StatusType statusInfo = response.getStatusInfo();
            throw new GuildWars2VerificationAPIException(response, statusInfo.getStatusCode(), statusInfo.getReasonPhrase());
        }
        return response.readEntity(com.farshiverpeaks.gw2verifyclient.model.APIKeyName.class);
    }

}
