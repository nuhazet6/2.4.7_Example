package users;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class annotationsUse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//leer el xml de configuración
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//pedir un bean al contenedor
		
		Users Antonio=contexto.getBean("tier1User",Users.class);
		
		//usar el bean
		System.out.println(Antonio.getTierCard());
		Antonio.getPersonalCard().improveLevel();
		System.out.println(Antonio.getTierCard());
		
		//cerrar el contexto
		contexto.close();
		
	}

}
