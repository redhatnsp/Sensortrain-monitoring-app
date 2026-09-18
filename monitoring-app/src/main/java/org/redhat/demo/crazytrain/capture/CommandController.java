package org.redhat.demo.crazytrain.capture;

import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;

import jakarta.inject.Inject;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;



@Path("/capture")
public class CommandController {

    @Inject
    @Channel("commands-out")
    Emitter<String> commandEmitter;

    @POST
    @Path("/start")
    public void startCapture(String command) {
        commandEmitter.send(command);
    }

    @POST
    @Path("/stop")
    public void stopCapture(String command) {
        commandEmitter.send(command);
    }

    @POST
    @Path("/connectReconnect")
    public void connectReconnect(String command) {
        commandEmitter.send(command);
    }
     @POST
    @Path("/startMovement")
    public void startMovement(String command) {
        commandEmitter.send(command);
     }
    @POST
    @Path("/stopMovement")
    public void stopMovement(String command) {
        commandEmitter.send(command);
    }
}
