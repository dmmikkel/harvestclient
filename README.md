# HarvestClient

HarvestClient is an easy to use wrapper for the Harvest API.

It can currently only be used to fetch data from Harvest,
but will eventually support creating and updating data as well.

## Usage

Example that fetches all users:

    HarvestClientFactory factory = new HarvestClientFactory();
    HarvestClient client = factory.create("subdomain", "username", "password");
    UserCollection users = client.getUsers();

    for (User user : users)
    {
        // Do something
    }

`subdomain` is the subdomain of your harvest account (e.g. https://**subdomain**.harvestapp.com

## Methods

### getUsers()

Gets all users.

### getUsers(Date updatedSince)

Gets all users updated since `updatedSince`.

### getUser(int id)

Gets a user by id.

### getClients()

Gets all clients.

### getClients(Date updatedSince)

Gets all clients updated since `updatedSince`.

### getClient(int id)

Gets a client by id.

### getDayEntriesByUser(GetDayEntriesByUserParameters params)

Gets all day entries by a user.

Filters available in params.

### getDayEntriesByProject(GetDayEntriesByProjectParameters params)

Gets all day entries by a project.

Filters available in params.

### getProjects()

Gets all projects.

### getProjects(Date updatedSince)

Gets all projects updated since `updatedSince`.

### getProjects(int clientId)

Gets all projects for a client

### getProjects(int clientId, Date updatedSince)

Gets all projects for a client updated since `updatedSince`.

### getProject(int id)

Gets a project by id.

### getTasks()

Gets all tasks.

### getTasks(Date updatedSince)

Gets all tasks updated since `updatedSince`.

### getTask(int id)

Gets a task by id.

### getUserAssignments(int projectId)

Gets all user assignments for a project.

### getUserAssignments(int projectId, Date updatedSince)

Gets all user assignments for a project updated since `updatedSince`.

### getTaskAssignments(int projectId)

Gets all task assignments for a project.

### getTaskAssignments(int projectId, Date updatedSince)

Gets all task assignments for a project updated since `updatedSince`.

### getRecentInvoices(GetRecentInvoicesParameters params)

Gets the 50 most recent invoices.

Pagination and filters available in params.

### getInvoice(int id)

Gets an invoice by id.

### getInvoiceItemCategories()

Gets all invoice item categories.

### getInvoiceMessages(int invoiceId)

Gets all invoice messages for an invoice.

### getInvoiceMessage(int invoiceId, int id)

Gets an invoice message.

### getInvoicePayments(int invoiceId)

Gets all invoice payments for an invoice.

### getInvoicePayment(int invoiceId, int id)

Gets an invoice payment for an invoice.

## Exceptions

Any client method can throw a HarvestClientException.

### MissingParameterException

Will be thrown if a required parameter is missing.

### ThrottleLimitReachedException

Will be thrown if the Harvest API throttle is reached.

If you encounter this you should consider caching.