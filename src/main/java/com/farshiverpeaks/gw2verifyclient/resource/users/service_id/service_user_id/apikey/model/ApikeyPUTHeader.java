
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.model;


public class ApikeyPUTHeader {

    private String _xAccessToken;

    public ApikeyPUTHeader(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public void setXAccessToken(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public String getXAccessToken() {
        return _xAccessToken;
    }

}
