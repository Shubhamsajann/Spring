package Main;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp2 {

    public static void main(String[] args) {

        // Load Spring XML configuration
     
    	
    	DefaultListableBeanFactory beanFactory =  new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader =  new XmlBeanDefinitionReader(beanFactory);
    	
    	reader.loadBeanDefinitions("applicationConfig.xml");
    	
    	
        // Get Telusko bean from container
        Telusko t = beanFactory.getBean(Telusko.class);

        // Call business logic
        Boolean b = t.buythecourse(44.44);

        if (b) {
            System.out.println("Course purchased");
        } else {
            System.out.println("Course failed to purchase");
        }
    }
}
