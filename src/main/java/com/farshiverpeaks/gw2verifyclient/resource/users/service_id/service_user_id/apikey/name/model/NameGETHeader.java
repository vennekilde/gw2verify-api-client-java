package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.name.model;

public class NameGETHeader {

    private String _xAccessToken;

    public NameGETHeader(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public void setXAccessToken(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public String getXAccessToken() {
        return _xAccessToken;
    }

}
