/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaLambdaExpression;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Function;

/**
 *
 * @author it05082022
 */
public class StudentInfo {

    void testStudents(ArrayList<Student> al, Predicate<Student> pr) {
        for (Student s : al) {
            if (pr.test(s)) {
                System.out.println(s);
            }
        }
    }
//    void printStudentOverGrade(ArrayList<Student> al, double grade) {
    //       al.stream().filter((s) -> (s.avgGrade > grade)).forEachOrdered((s) -> {
    //         System.out.println(s);
    //  });
    //}
//
//    void printStudentUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age < age) {
    //  System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.age < age && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }

}

class Test {

    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.1);
        Student st2 = new Student("Nickoglay", 'm', 32, 3, 8.2);
        Student st3 = new Student("Vera", 'f', 20, 3, 7.6);
        Student st4 = new Student("Artur", 'm', 12, 3, 9.2);
        Student st5 = new Student("Geka", 'm', 18, 3, 3.2);
        ArrayList<Student> students = new ArrayList<>();
        students.add(st5);
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);

        
        
  //      StudentInfo info = new StudentInfo();

//         Collections.sort(students, new Comparator<Student>() {
//            @Override
//            public int compare(Student s1, Student s2) {
//           return s1.course-s2.course; 
//            }
//        });
//        Collections.sort(students, (stu1, stu2) -> stu1.age - stu2.age);
// 
//        System.out.println(students);

        //info.testStudents(students,new CheckOverGrade());
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//         return s.age<30;
//            }
//        });  
//Predicate<Student> p1 = student ->  student.avgGrade > 7.5;
//Predicate<Student> p2 = student ->  student.sex == 'm';


       // info.testStudents(students, p1.negate());
        //System.out.println("_____________________________________");
        //info.testStudents(students, p2);
        //System.out.println("_____________________________________");
        
      //  info.testStudents(students,(Student p)-> {return p.avgGrade<8;   }); 
        // info.testStudents(students, s-> s.avgGrade >8); 

//           StudentChecks sc= (Student p)-> {return p.avgGrade<8;   };
//         
//         
//         System.out.println("--------------------");
//         info.testStudents(students, (Student p)-> {return p.age<30;   }); 
//         System.out.println("--------------------");
//         info.testStudents(students, (Student p)-> {return p.age<21 && p.avgGrade<9 && p.sex=='f';}); 
//     info.testStudents(students,(Student p)-> {return p.avgGrade<8;   }); 
//         info.testStudents(students, s-> s.avgGrade >8); 


//info.printStudentOverGrade(students,8);
//        System.out.println("----------------------");
//        info.printStudentUnderAge(students, 31);
//        System.out.println("----------------------");
//         info.printStudentMixCondition(students, 19, 8, 'm');
//    }
    
Function<Student,Double> f = student -> student.avgGrade;}
  //  double res = avgOfSmth(students, stud -> stud.avgGrade); 
    
    

private static double avgOfSmth(List<Student> list,Function<Student,Double>f ){
    double result=0;
     for(Student st: list){
         result+=f.apply(st);
         
     }
     result = result/list.size();
     return  result;

}}

//interface StudentChecks {

   // boolean check(Student s);



//class CheckOverGrade implements StudentChecks {
//
//    @Override
//    public boolean check(Student s) {
//        return s.avgGrade > 8;
//    }}


