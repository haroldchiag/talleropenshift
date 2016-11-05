package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="verificadorPlacas")
public class verificadorPlacas {
	
	@WebMethod()
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
 
    @WebMethod()
    public boolean getPlacaVerificar(@WebParam(name="numero") String id) {
		if(id.equalsIgnoreCase("efg456")) {
			return true;
		}else
			return false;
		
    
    }
}
