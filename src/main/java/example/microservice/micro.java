package example.microservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService(name="miServicio")
public class micro {

	@WebMethod()
	public String sayHello(@WebParam(name="nombre") String name) {
	    System.out.println("Hello: " + name);
	    return "Hello " + name + "!";
	}
	
	@WebMethod()
	public int sumar(@WebParam(name="valor1") int a,@WebParam(name="valor2") int b) {
	    System.out.println("sumar: " + (a+b));
	    return (a+b);
	}
	
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
