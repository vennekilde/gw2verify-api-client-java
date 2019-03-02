
package com.farshiverpeaks.gw2verifyclient.resource.updates;

import javax.ws.rs.client.Client;
import com.farshiverpeaks.gw2verifyclient.resource.updates.service_id.ServiceId;

public class Updates {

    private String _baseUrl;
    private Client _client;

    public Updates(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/updates");
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
