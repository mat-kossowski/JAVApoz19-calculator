package pl.sda.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sda.spring.operation.OperationType;

public class App {

    public static void main( String[] args ) {
        ApplicationContext appCtx = new AnnotationConfigApplicationContext(AppConfig.class);
        Calculator bean = appCtx.getBean(Calculator.class);
        double result = bean.calculate(OperationType.POWER, 5.0, 2.0);

        System.out.println("Calculation result: " + result);
    }
}
