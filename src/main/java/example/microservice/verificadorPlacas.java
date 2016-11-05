package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/verificador")
@Consumes({ "application/json" })
@Produces({ "application/json" })
public class verificadorPlacas {
	@GET
    @Path("/placas")
    public List<placas> getPlacas() {
	 List<placas> b = new ArrayList<placas>();
	 placas bo = new placas();
	 bo.setNumeroPlaca("abc123");
	 bo.setEsRobada(false);
	 b.add(bo);
    
	 bo = new placas();
	 bo.setNumeroPlaca("efg456");
	 bo.setEsRobada(true);
	 b.add(bo);
	 
	 bo = new placas();
	 bo.setNumeroPlaca("hij789");
	 bo.setEsRobada(false);
	 b.add(bo);
	 
	 return b;
    }
 
    @GET
    @Path("/placa/{numero}")
    public boolean getPlacaVerificar(@PathParam("numero") String id) {
		if(id.equalsIgnoreCase("efg456")) {
			return true;
		}else
			return false;
		
    
    }
}
