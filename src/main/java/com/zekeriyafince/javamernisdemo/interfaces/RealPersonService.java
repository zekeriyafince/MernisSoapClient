/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zekeriyafince.javamernisdemo.interfaces;

import com.zekeriyafince.javamernisdemo.entities.Customer;

/**
 *
 * @author Zekeriya Furkan İNCE
 * @date 03.05.2021 17:18
 */
public interface RealPersonService {

    com.zekeriyafince.javamernisdemo.models.Result CheckIfRealPerson(Customer customer);
}
