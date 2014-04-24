package com.enonic.harvest.harvestclient;

import org.apache.commons.codec.binary.Base64;

abstract class HarvestRequest
{
    protected String username;
    protected String password;
    protected String subDomain;
    protected String url;

    protected String getUrl()
    {
        return "https://" + this.getSubDomain() + ".harvestapp.com" + this.url;
    }

    protected String getAuthenticationHeader()
            throws Exception
    {
        String credentials = this.getUsername() + ":" + this.getPassword();
        return "Basic " + Base64.encodeBase64String(credentials.getBytes("ASCII"));
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public String getSubDomain()
    {
        return subDomain;
    }

    public void setSubdomain(String subDomain)
    {
        this.subDomain = subDomain;
    }

    public void setUrl(String url)
    {
        this.url = url;
    }
}
