package java_AnnotationsSpring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UsoAnnotation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(ClaseConfig.class);
		
		Empleados juan= context.getBean("Vendedor_x", Vendedor2.class);
		
		System.out.println(juan.getTareas() + "\n" + juan.getInforme());
		
		
		context.close();
	}

}
