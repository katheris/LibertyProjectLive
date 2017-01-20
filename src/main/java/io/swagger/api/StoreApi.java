package io.swagger.api;

import java.util.Map;
import io.swagger.model.Order;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;

import io.swagger.annotations.*;

import java.util.List;

@Path("/store")

@Api(description = "the store API")


@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2017-01-20T13:58:03.619Z")

public class StoreApi  {

    @DELETE
    @Path("/order/{orderId}")
    
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Delete purchase order by ID", notes = "For valid response try integer IDs with positive integer value. Negative or non-integer values will generate API errors", response = void.class, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = void.class),
        @ApiResponse(code = 404, message = "Order not found", response = void.class) })
    public Response deleteOrder(@PathParam("orderId") Long orderId) {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/inventory")
    
    @Produces({ "application/json" })
    @ApiOperation(value = "Returns pet inventories by status", notes = "Returns a map of status codes to quantities", response = Integer.class, responseContainer = "Map", authorizations = {
        @Authorization(value = "api_key")
    }, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Integer.class, responseContainer = "Map") })
    public Response getInventory() {
    	return Response.ok().entity("magic!").build();
    }

    @GET
    @Path("/order/{orderId}")
    
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Find purchase order by ID", notes = "For valid response try integer IDs with value >= 1 and <= 10. Other values will generated exceptions", response = Order.class, tags={ "store",  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid ID supplied", response = Order.class),
        @ApiResponse(code = 404, message = "Order not found", response = Order.class) })
    public Response getOrderById(@PathParam("orderId") Long orderId) {
    	return Response.ok().entity("magic!").build();
    }

    @POST
    @Path("/order")
    
    @Produces({ "application/xml", "application/json" })
    @ApiOperation(value = "Place an order for a pet", notes = "", response = Order.class, tags={ "store" })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Order.class),
        @ApiResponse(code = 400, message = "Invalid Order", response = Order.class) })
    public Response placeOrder(Order body) {
    	return Response.ok().entity("magic!").build();
    }
}

