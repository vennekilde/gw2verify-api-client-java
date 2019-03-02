
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id;

import javax.ws.rs.client.Client;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.ServiceUserId;

public class ServiceId {

    private String _baseUrl;
    private Client _client;

    public ServiceId(String baseUrl, Client _client, String uriParam) {
        _baseUrl = (baseUrl +("/"+ uriParam));
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    public final ServiceUserId serviceUserId(String serviceUserId) {
        return new ServiceUserId(getBaseUri(), getClient(), serviceUserId);
    }

}
