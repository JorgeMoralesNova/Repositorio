package java_AnnotationsSpring;

import org.springframework.stereotype.Component;

@Component
public class InformeFinanciero implements CreaciónInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "este es el informe financiero, inyectado a la clase vendedor "
				+ "por medio de autowired";
	}

}
