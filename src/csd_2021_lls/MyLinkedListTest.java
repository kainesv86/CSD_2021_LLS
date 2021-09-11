/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd_2021_lls;

/**
 *
 * @author Kaine
 */
public class MyLinkedListTest {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();
        
        list.addFirst(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        MyIterator iterator = list.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
        System.out.println();
        
        LL_Element p = list.search(5);
        if (p != null) System.out.println("5 exist.");
        else System.out.println("5 DOES NOT existed!");
        
        // ============================ Test add and add after operation ============================
        
        list.addBefore(new LL_Element(55), p);
        list.addBefore(new LL_Element(555), p);
        iterator = list.iterator();
        
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
        System.out.println();
        
        // ============================ Test remove operation ============================
        list.remove(5);
        iterator = list.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
        System.out.println();
        
        // ============================ Test addLast operation ============================
        list.addLast(11, 12, 13, 14);
        iterator = list.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
        System.out.println();
        
        // ============================ Test for remove first and last operations ============================
        list.removeFirst();
        list.removeLast();
        iterator = list.iterator();
        while (iterator.hasNext()) System.out.print(iterator.next() + ", ");
        System.out.println();
        
    }
}
