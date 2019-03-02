
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification;

import javax.ws.rs.client.Client;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.refresh.Refresh;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.status.Status;
import com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.temporary.Temporary;

public class Verification {

    private String _baseUrl;
    private Client _client;
    public final Status status;
    public final Refresh refresh;
    public final Temporary temporary;

    public Verification(String baseUrl, Client _client) {
        _baseUrl = (baseUrl +"/verification");
        this._client = _client;
        status = new Status(getBaseUri(), getClient());
        refresh = new Refresh(getBaseUri(), getClient());
        temporary = new Temporary(getBaseUri(), getClient());
    }

    protected Client getClient() {
        return this._client;
    }

    private String getBaseUri() {
        return _baseUrl;
    }

}
