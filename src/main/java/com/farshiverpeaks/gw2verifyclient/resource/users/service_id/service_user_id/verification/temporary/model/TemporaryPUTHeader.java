
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.temporary.model;


public class TemporaryPUTHeader {

    private String _xAccessToken;

    public TemporaryPUTHeader(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public void setXAccessToken(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public String getXAccessToken() {
        return _xAccessToken;
    }

}
