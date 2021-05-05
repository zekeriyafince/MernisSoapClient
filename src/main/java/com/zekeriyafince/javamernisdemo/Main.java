package com.zekeriyafince.javamernisdemo;

import com.zekeriyafince.javamernisdemo.adapters.MernisServiceAdapter;
import com.zekeriyafince.javamernisdemo.entities.Customer;
import com.zekeriyafince.javamernisdemo.interfaces.CustomerCheckService;
import com.zekeriyafince.javamernisdemo.interfaces.CustomerService;
import com.zekeriyafince.javamernisdemo.services.StarbucksCustomerCheckManager;
import com.zekeriyafince.javamernisdemo.services.StarbucksCustomerManager;
import java.util.GregorianCalendar;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:10
 */
public class Main {

    public static void main(String[] args) {
        Customer enginCustomer = new Customer();
        enginCustomer.setId(1);
        enginCustomer.setIdentityNumber("0000000000");
        enginCustomer.setFirstName("Zekeriya ");
        enginCustomer.setLastName("İnce");
        enginCustomer.setBirthDate(new GregorianCalendar(1993, 05, 25).getTime());

        CustomerCheckService customerCheckService = new StarbucksCustomerCheckManager(new MernisServiceAdapter());

        CustomerService customerService = new StarbucksCustomerManager(customerCheckService);
        customerService.add(enginCustomer);
    }
}
