
package com.farshiverpeaks.gw2verifyclient.api;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import com.farshiverpeaks.gw2verifyclient.resource.configuration.Configuration;
import com.farshiverpeaks.gw2verifyclient.resource.updates.Updates;
import com.farshiverpeaks.gw2verifyclient.resource.users.Users;

public class GuildWars2VerificationAPIClient {

    private String _baseUrl;
    public final Configuration configuration;
    public final Updates updates;
    public final Users users;

    public GuildWars2VerificationAPIClient(String baseUrl) {
        _baseUrl = baseUrl;
        configuration = new Configuration(getBaseUri(), getClient());
        updates = new Updates(getBaseUri(), getClient());
        users = new Users(getBaseUri(), getClient());
    }

    public GuildWars2VerificationAPIClient() {
        this("https://farshiverpeaks.com:8321/{version}");
    }

    protected Client getClient() {
        return ClientBuilder.newClient();
    }

    protected String getBaseUri() {
        return _baseUrl;
    }

    public static GuildWars2VerificationAPIClient create(String baseUrl) {
        return new GuildWars2VerificationAPIClient(baseUrl);
    }

    public static GuildWars2VerificationAPIClient create() {
        return new GuildWars2VerificationAPIClient();
    }

}
