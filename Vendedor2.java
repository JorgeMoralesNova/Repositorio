package java_AnnotationsSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("Vendedor_x")
public class Vendedor2 implements Empleados {
	
	@Autowired
	@Qualifier("informeFinanciero")
	private CreaciónInformeFinanciero info;
	
	
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "solo vendo";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return info.getInformeFinanciero();
	}
	
	
	
	
	
	
	

}
