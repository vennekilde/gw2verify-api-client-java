
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id;

import javax.ws.rs.client.Client;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.Apikey;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.Properties;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.Verification;

public class ServiceUserId {

    private String _baseUrl;
    private Client _client;
    public final Apikey apikey;
    public final Properties properties;
    public final Verification verification;

    public ServiceUserId(String baseUrl, Client _client, String uriParam) {
        _baseUrl = (baseUrl +("/"+ uriParam));
        this._client = _client;
        apikey = new Apikey(getBaseUri(), getClient());
        properties = new Properties(getBaseUri(), getClient());
        verification = new Verification(getBaseUri(), getClient());
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

}
