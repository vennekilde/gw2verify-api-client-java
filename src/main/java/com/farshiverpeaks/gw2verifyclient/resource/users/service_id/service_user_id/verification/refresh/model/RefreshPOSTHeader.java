
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.refresh.model;


public class RefreshPOSTHeader {

    private String _xAccessToken;

    public RefreshPOSTHeader(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public void setXAccessToken(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public String getXAccessToken() {
        return _xAccessToken;
    }

}
