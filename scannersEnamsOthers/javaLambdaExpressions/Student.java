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
public class Student
{
String name;
char sex;
int age;
int course;
double avgGrade;

    public Student(String name, char sex, int age, int course, double avgGrade) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.course = course;
        this.avgGrade = avgGrade;
    }
    
    public Student() {
    }

    /**
     * @param args the command line arguments
     * @return 
     */
    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", sex=" + sex + ", age=" + age + ", course=" + course + ", avgGrade=" + avgGrade + '}';
        // TODO code application logic here
    }

    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
