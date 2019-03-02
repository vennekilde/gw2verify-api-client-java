
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.apikey.model;


public class ApikeyPUTQueryParam {

    /**
     * Skip the variuse apikey requirements that might be in place
     * 
     */
    private Boolean _skipRequirements;

    /**
     * 
     * @param skipRequirements
     *     Skip the variuse apikey requirements that might be in place
     */
    public ApikeyPUTQueryParam(Boolean skipRequirements) {
        _skipRequirements = skipRequirements;
    }

    public void setSkipRequirements(Boolean skipRequirements) {
        _skipRequirements = skipRequirements;
    }

    /**
     * 
     * @return
     *     Skip the variuse apikey requirements that might be in place
     */
    public Boolean getSkipRequirements() {
        return _skipRequirements;
    }

}
