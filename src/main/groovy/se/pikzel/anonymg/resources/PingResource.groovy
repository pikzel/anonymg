package se.pikzel.anonymg.resources

import com.codahale.metrics.annotation.Timed

import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/ping")
@Produces(MediaType.APPLICATION_JSON)
class PingResource {
    @GET
    @Timed
    static pong() {
        return { "\"answer\": \"pong\" " }
    }
}
