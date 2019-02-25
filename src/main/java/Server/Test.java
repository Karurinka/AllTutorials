package Server;

import ORM.Manager.testManager;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/test")
public class Test {

    //@Inject
    //private EJBInterface ejbinterface;

    private testManager manager = new testManager();

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String message(){
        manager.CreateTest();
        manager.CreateUser();
        manager.CreateKweet();
        manager.CreateUser();
        manager.CreateFollower();
        return Integer.toString(manager.GetKweet().getUser().getUserId());
    }
}