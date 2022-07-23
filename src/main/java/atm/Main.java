package atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//        DataSourceDB dataSourceDB = new DataSourceDB();
//        DataSourceFile dataSourceFile = new DataSourceFile("customers.txt");
//        Bank bank = new Bank("My Bank", dataSourceFile);
//        Bank bankXYZ = new Bank("XYZ bank", "customersXYZ.txt");
//        Bank bankABC = new Bank("ABC bank", "customersABC.txt");
//        ATM atm = new ATM(bank);
//        AtmUI atmUI = new AtmUI(atm);

        //Annotation Based
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        AtmUI atmUI = context.getBean(AtmUI.class);

        atmUI.run();
    }
}
