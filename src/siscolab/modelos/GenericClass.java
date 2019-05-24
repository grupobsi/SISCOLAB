/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siscolab.modelos;
import java.io.Serializable;

/**
 *
 * @author phantom
 */
public class GenericClass implements Serializable {
    public int one, two, three;
    public GenericClass(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
}
