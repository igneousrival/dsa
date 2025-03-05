package org.example;

import org.example.classes.listandnode.ReversibleList;
import org.example.classes.listandnode.Impl.DoubleLinkedListImpl;
import org.example.classes.listandnode.Impl.LinkedListLImpl;
import org.example.classes.listandnode.LinkedList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }

        LinkedList<Object> list = new LinkedListLImpl<>();
        list.add(10);
        list.add("Hi");  // ✅ Now allowed

        list.printElements();

        ReversibleList<Object> dList= new DoubleLinkedListImpl<>();
        dList.add(19);
        dList.add(29);

        dList.printReverse();
        dList.printElements();

    }
}