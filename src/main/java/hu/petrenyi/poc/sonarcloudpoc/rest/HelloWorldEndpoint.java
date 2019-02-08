package hu.petrenyi.poc.sonarcloudpoc.rest;

import static java.util.function.Function.identity;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Path("/hello")
public class HelloWorldEndpoint {

    @GET
    @Produces("text/plain")
    public Response doGet() {
        if (true) {
            List<String> strings = getStrings();
            Map<String, String> stringmap = strings.stream().collect(Collectors.toMap(identity(), identity()));
            String value = stringmap.get("querty");
            String subs = value.substring(2, 4);
            return Response.ok("Hello " + subs + " from Thorntail!").build();
        }
        return Response.ok().build();
    }

    private List<String> getStrings() {
        List<String> strings = new ArrayList<String>();
        strings.add("100");
        strings.add("qwerty");
        strings.add("something");
        strings.clear();
        return strings;
    }
}
