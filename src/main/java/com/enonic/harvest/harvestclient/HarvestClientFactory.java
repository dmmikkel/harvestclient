package com.enonic.harvest.harvestclient;

public class HarvestClientFactory
{
    public HarvestClient create(String subdomain, String username, String password)
    {
        return new DefaultHarvestClient(username, password, subdomain);
    }
}
