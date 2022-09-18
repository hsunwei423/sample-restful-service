package org.hsunwei.router

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.core.Response

@Path("/test")
class Greeting {
    @GET
    fun sayHello(): Response {
        return Response.ok("Hi").build()
    }
}