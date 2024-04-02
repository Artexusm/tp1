package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresSpringXML {
    public static <ApplicationContext> void main(String[] args)  {
        ApplicationContext context = (ApplicationContext) new ClassPathXmlApplicationContext("applicationContext.xml");
        IMetier metier=(IMetier) context.getClass();
        System.out.println("Résultat=>"+metier.calcul());



    }
}
