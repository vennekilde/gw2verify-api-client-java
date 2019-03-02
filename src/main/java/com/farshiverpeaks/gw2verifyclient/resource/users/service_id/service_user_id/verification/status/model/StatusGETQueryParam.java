
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.verification.status.model;


public class StatusGETQueryParam {

    /**
     * Display name of the user of the service. Will be stored as the latest used diplay name by that user
     * 
     */
    private String _displayName;

    public StatusGETQueryParam() {
    }

    /**
     * 
     * @param displayName
     *     Display name of the user of the service. Will be stored as the latest used diplay name by that user
     */
    public StatusGETQueryParam withDisplayName(String displayName) {
        _displayName = displayName;
        return this;
    }

    public void setDisplayName(String displayName) {
        _displayName = displayName;
    }

    /**
     * 
     * @return
     *     Display name of the user of the service. Will be stored as the latest used diplay name by that user
     */
    public String getDisplayName() {
        return _displayName;
    }

}
