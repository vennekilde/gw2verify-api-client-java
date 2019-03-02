
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.status.model;


public class StatusGETHeader {

    private String _xAccessToken;

    public StatusGETHeader(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public void setXAccessToken(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public String getXAccessToken() {
        return _xAccessToken;
    }

}
