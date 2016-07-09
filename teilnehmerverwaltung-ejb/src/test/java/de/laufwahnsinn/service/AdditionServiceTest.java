/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package de.laufwahnsinn.service;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author anne
 */
public class AdditionServiceTest {
    
    public AdditionService additionService = new AdditionService();

    @Test
    public void test01Addition() {

        int result = additionService.add(1,2);
        assertEquals(result, 3);
        
        System.out.println(result);
        
    }
}
