package com.enonic.harvest.harvestclient.parameters;

import java.util.Date;

public class GetLatestInvoicesParameters
{
    public Integer page;
    public Date fromDate;
    public Date toDate;
    public Date updatedSince;
    public String status;
    public Integer client;
}
