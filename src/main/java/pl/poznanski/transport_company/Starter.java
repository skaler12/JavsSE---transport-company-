package pl.poznanski.transport_company;


import pl.poznanski.transport_company.dto.OrderType;
import pl.poznanski.transport_company.entity.Company;
import pl.poznanski.transport_company.entity.Driver;
import pl.poznanski.transport_company.entity.Order;
import pl.poznanski.transport_company.entity.Vehicle;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Starter {
    public static void main(String[] args) throws IOException {
        Company company = new Company();
        Driver driver = new Driver();
        driver.setAge(22);
        driver.setName("Grzegorz");
        company.getDriverList().add(driver);
        System.out.println(company.getDriverList().get(0));

        Company company1 = new Company();
        company1.setCompanyName("DHL");
        Driver driver1 = new Driver();
        driver1.setAge(20);
        driver1.setName("Piotr");
        company1.getDriverList().add(driver1);
        System.out.println(company1.getDriverList().get(0));

        Driver driver2 = new Driver();
        driver2.setAge(25);
        driver2.setName("Krzysztof");
        System.out.println(driver2.addDriverList(company1,driver2));

        for (Driver drversToView : company1.getDriverList()) {
            System.out.println(drversToView);
        }
        System.out.println(driver1.getDriverCompanyName());
        System.out.println(driver2.getDriverCompanyName());

        System.out.println();
        System.out.println();
        Vehicle  vehicle = new Vehicle("Ford",70,2100f,false);
        System.out.println(vehicle.toString());
        System.out.println();
        System.out.println(vehicle.getFuelLevel());
        System.out.println(vehicle.getVehicleData(vehicle));
        vehicle.ifEngineRun(vehicle);
        driver.addVehicle(driver,vehicle);

        Order order =new Order(4,43);
        order.setOrigin(OrderType.FOREIGN);
        System.out.println(order.toString());
        // mockito adnotacje wyjatki polimorfizm
        System.out.println();
    }
}
