/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackage;

import javax.ejb.Local;

/**
 *
 * @author student
 */
@Local
public interface ArithmeticSLBeanLocal {

    Integer add(int a, int b);
    
}
