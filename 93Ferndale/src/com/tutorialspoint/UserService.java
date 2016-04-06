package com.tutorialspoint;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {


   @POST
   @Path("/onLoad")
   @Consumes(MediaType.APPLICATION_JSON)
   public ResultSet onLoad(JSONObject inputJsonObj) throws Exception {
	    ResultSet rs = new ResultSet();
	   
	   	System.out.println("Authenticated");
	   	return rs;
   }	
}