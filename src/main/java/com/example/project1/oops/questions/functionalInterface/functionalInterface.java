package com.example.project1.oops.questions.functionalInterface;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class functionalInterface {
    //Predicate
    //Consumer
    //Supplier
    //Comparator
    public static void main(String[] args) {
        List<Student> list=List.of(new Student("Subb",11),
                new Student("Sub",13),
                new Student("Subbb",12)
                ,new Student("Su",10));
        Predicate<Integer> predicate=(i)->i%1==0;
        Comparator<Student> comparator=(x,y)->x.getRollNo()>y.getRollNo()?1:-1;
        Comparator<Student> comparator1=(x,y)->x.getName().length()>y.getName().length()?1:-1;
        list.stream().sorted(comparator1).forEach(System.out::println);

    }

}
@AllArgsConstructor
@Data
class  Student{
    private String name;
    private Integer rollNo;
}
