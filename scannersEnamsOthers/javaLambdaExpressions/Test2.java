/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLambdaExpression;

/**
 *
 * @author it05082022
 */
public class Test2 {
static void def(I i){
    System.out.println(i.abs("privet"));
}
    public static void main(String[] args) {
        int i = 10;
        def((String s)-> {
            System.out.println(i);
            return s.length();});
        //System.out.println(def);
    }
}
interface I{
    int abs(String s); 
}