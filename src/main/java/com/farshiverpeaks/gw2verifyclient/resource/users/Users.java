
package com.farshiverpeaks.gw2verifyclient.resource.users;

import javax.ws.rs.client.Client;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.ServiceId;

public class Users {

    private String _baseUrl;
    private Client _client;

    public Users(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/users");
        this._client = _client;
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

    public final ServiceId serviceId(String serviceId) {
        return new ServiceId(getBaseUri(), getClient(), serviceId);
    }

}
