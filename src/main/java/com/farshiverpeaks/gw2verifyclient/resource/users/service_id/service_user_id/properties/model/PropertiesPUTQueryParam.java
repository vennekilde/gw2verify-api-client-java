
package com.farshiverpeaks.gw2verifyclient.resource.users.service_id.service_user_id.properties.model;


public class PropertiesPUTQueryParam {

    /**
     * Property name
     * 
     */
    private String _name;
    /**
     * Property value
     * 
     */
    private String _value;

    /**
     * 
     * @param name
     *     Property name
     * @param value
     *     Property value
     */
    public PropertiesPUTQueryParam(String name, String value) {
        _name = name;
        _value = value;
    }

    public void setName(String name) {
        _name = name;
    }

    /**
     * 
     * @return
     *     Property name
     */
    public String getName() {
        return _name;
    }

    public void setValue(String value) {
        _value = value;
    }

    /**
     * 
     * @return
     *     Property value
     */
    public String getValue() {
        return _value;
    }

}
