/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.ejb.Stateless;

/**
 *
 * @author student
 */
@Stateless
public class ArithmeticSLBean implements ArithmeticSLBeanLocal {

    @Override
    public Integer add(int a, int b) {
        int c = a + b;
        return c; 
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
