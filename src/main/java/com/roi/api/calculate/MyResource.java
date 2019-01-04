package com.roi.api.calculate;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.roi.api.model.Message;
import com.roi.api.service.MessageService;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

	MessageService messageService=new MessageService(); 
	
  /*  @GET
    @Produces(MediaType.APPLICATION_XML)
    public Message getIt() {
       return messageService.getAllmessage();
    }*/
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Message cal(Message message) {
    	return messageService.addMessage(message);
    }
}
