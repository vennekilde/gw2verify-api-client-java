package com.farshiverpeaks.gw2verifyclient.exceptions;

import com.farshiverpeaks.gw2verifyclient.model.Error;
import javax.ws.rs.core.Response;

public class GuildWars2VerificationAPIException
        extends Exception {

    private int statusCode;
    private String reason;
    private Error error;

    public GuildWars2VerificationAPIException(Response response, int statusCode, String reasonPhrase) {
        this.statusCode = statusCode;
        this.reason = reasonPhrase;
        if (response.hasEntity()) {
            error = response.readEntity(Error.class);
        } else {
            error = null;
        }
    }

    public Error getError() {
        return error;
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public String getReason() {
        return this.reason;
    }

}
