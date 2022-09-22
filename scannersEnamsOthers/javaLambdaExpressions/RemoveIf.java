/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLambdaExpression;

import java.util.ArrayList;
import java.util.function.Predicate;

/**
 *
 * @author it05082022
 */
public class RemoveIf {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("priva");
        al.add("poka");
        al.add("dalan");
        al.add("ok");
        al.add("lapaluga");
                //al.removeIf(( t) ->  t.length()<5);
                Predicate<String> p =t ->  t.length()<5;
                al.removeIf(p);
                System.out.println(al);
                
    }
    
    
}
