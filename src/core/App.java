package core;

import java.io.*;
import java.net.*;
import javax.ws.rs.*;

@Path("/")
public class App {
	String ip = "http://api.ipify.org";
	@GET
	@Path("/ip")
	public String name() throws MalformedURLException, IOException {
		return new BufferedReader(new InputStreamReader(new URL(ip).openStream())).readLine();
	}
	
	
}
