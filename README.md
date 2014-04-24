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