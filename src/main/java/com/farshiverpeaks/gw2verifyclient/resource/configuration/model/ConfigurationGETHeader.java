
package com.farshiverpeaks.gw2verifyclient.resource.configuration.model;


public class ConfigurationGETHeader {

    private String _xAccessToken;

    public ConfigurationGETHeader(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public void setXAccessToken(String xAccessToken) {
        _xAccessToken = xAccessToken;
    }

    public String getXAccessToken() {
        return _xAccessToken;
    }

}
