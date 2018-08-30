package com.qa.CDsYO.interop;


import com.google.gson.Gson;
import com.qa.CDsYO.domain.CD;
import com.qa.CDsYO.service.business.CDService;
import com.qa.CDsYO.util.JSONHandler;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/cd")
public class CDRest {

    @Inject
    CDService service;

    JSONHandler handle;
    public CDRest() {
        handle = new JSONHandler();
    }

    @GET
    @Path("/all")
    @Produces({MediaType.APPLICATION_JSON})
    public String getAllCds() {
        return handle.objectToJSON(service.getAllCds());
    }

    @GET
    @Path("/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public String getCdById(@PathParam("id") Long id) {
        return handle.objectToJSON(service.getCdById(id));
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public String createCD(String body) {
        return service.createCd(handle.jsonToObject(body, CD.class));
    }

    @PUT
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public String updateCD(@PathParam("id") Long id, String body) {
        return service.updateCD(id, handle.jsonToObject(body, CD.class));
    }

    @DELETE
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/{id}")
    public String deleteCD(@PathParam("id") Long id){
        return service.deleteCD(id);
    }


}
