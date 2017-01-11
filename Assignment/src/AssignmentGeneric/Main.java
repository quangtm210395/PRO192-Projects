/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentGeneric;

import java.util.*;

/**
 *
 * @author Minnn
 */
public class Main {
    
    
    public static void accept(ArrayList<String> list){
        char check;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Enter Data: ");
            list.add(sc.nextLine());
            System.out.print("Do you want to continue? <Y/N>!: ");
            check = sc.next().charAt(0);
            sc.nextLine();
        } while(check != 'n' && check != 'N');
    }

    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        MyPredicates mp = new MyPredicates();
        PredicateAnimal pa = new PredicateAnimal();
        PersonPredicate pp = new PersonPredicate();
        
        accept(al);
        System.out.println("The Animal List :");
        System.out.println(al);
        if (MyPredicates.find(al, pa) != -1) {
            System.out.println("The first Item in List for which the predicate is true: " + al.get(MyPredicates.find(al, pa)));
        }
        MyPredicates.remove(al, pa);
        System.out.println("The Animal List after predicates: ");
        System.out.println(al);
        
        ArrayList<Person> listP = new ArrayList<>();
        listP.add(new Person("Thanh",19));
        listP.add(new Person("Quynh",20));
        listP.add(new Person("Quang",21));
        listP.add(new Person("Hai",22));
        listP.add(new Person("Kien",20));
        System.out.println("The Person List: ");
        System.out.println(listP);
        if (MyPredicates.find(listP, pp) != -1) {
            System.out.println("The first Item in List for which the predicate is true: " + listP.get(MyPredicates.find(listP, pp)));
        }
        MyPredicates.remove(listP, pp);
        System.out.println("The Person List after predicates: ");
        System.out.println(listP);
        
    }
    
    
}
