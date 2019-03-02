
package com.farshiverpeaks.gw2verifyclient.resource.updates.service_id;

import javax.ws.rs.client.Client;
import com.farshiverpeaks.gw2verifyclient.resource.updates.service_id.subscribe.Subscribe;

public class ServiceId {

    private String _baseUrl;
    private Client _client;
    public final Subscribe subscribe;

    public ServiceId(String baseUrl, Client _client, String uriParam) {
        _baseUrl = (baseUrl +("/"+ uriParam));
        this._client = _client;
        subscribe = new Subscribe(getBaseUri(), getClient());
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

}
