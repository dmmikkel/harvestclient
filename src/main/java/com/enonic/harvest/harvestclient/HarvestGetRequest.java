package com.enonic.harvest.harvestclient;

import com.enonic.harvest.harvestclient.exceptions.HarvestClientException;
import com.enonic.harvest.harvestclient.exceptions.ThrottleLimitReachedException;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.InputStream;


class HarvestGetRequest
        extends HarvestRequest
{

    public InputStream getInputStream()
            throws HarvestClientException
    {
        try
        {
            HttpClient client = HttpClientBuilder.create().build();
            HttpGet request = new HttpGet(this.getUrl());
            request.addHeader("Authorization", this.getAuthenticationHeader());
            request.addHeader("Accept", "application/xml");
            request.addHeader("User-Agent", "HarvestClient");
            HttpResponse response = client.execute(request);

            if (response.getStatusLine().getStatusCode() == 503)
                throw new ThrottleLimitReachedException();
            else if (response.getStatusLine().getStatusCode() != 200)
                throw new HarvestClientException(String.format("Returned status code %s: %s", response.getStatusLine().getStatusCode(), this.getUrl()));

            return response.getEntity().getContent();
        }
        catch (ThrottleLimitReachedException e)
        {
            throw e;
        }
        catch (Exception e)
        {
            throw new HarvestClientException("Error performing request.", e);
        }
    }

}
