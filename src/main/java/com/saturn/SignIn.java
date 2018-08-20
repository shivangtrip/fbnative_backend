package com.saturn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



/**
 * Created by marom on 27/09/16.
 */
@Path("facebook")
public class SignIn {

    Logger logger =  LoggerFactory.getLogger(SignIn.class);


    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt(@QueryParam("hub.mode") String hubMode, @QueryParam("hub.verify_token") String hubToken, @QueryParam("hub.challenge") String hubChallenge) {
        //logger.info(hubMode);
        //logger.info(hubToken);
        //logger.info(hubChallenge);
        System.out.println(hubChallenge + hubMode +hubToken);

        return hubChallenge;
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response foo() {

        logger.info("Received a Message");
        return Response.ok().build();

    }
}