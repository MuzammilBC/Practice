package com.rakuten.ems.date_time;

import java.util.LinkedList;

public class Llist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> name=new LinkedList<String>();
		
		//To add elements into link-list we can use any of method (which is from LIST,STACK,QUEUE)
		name.add("Muzammil");
		name.push("manu"); //add the elements in the style of a stack
		name.offer("jayepaul");//add the elements in the style of queue
		
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		
		
		System.out.println(""
				+ ""
				+ ""
				+ "");
		
		
		//since link-list implements Dequeue(Double ended queue) it is possible to add elements to both the ends
		name.offerFirst("Abhinaya");
		name.offerLast("Muttu");
		
		System.out.println(name.getFirst());
		System.out.println(name.getLast());
		
		//can be used to display the to element 
		System.out.println(name.peek());
		System.out.println(name);
		
		//By default removes the top element
		System.out.println(name.poll());
		System.out.println(name);
		
		//to display the first element in the list
		name.peekFirst();
		//to display the last element in the list
		name.peekLast();
		
		//to remove the first element in the list
		name.pollFirst();
		//to remove the last element in the list
		name.pollLast();
		
		
		//To remove the top element in the style of stack
		System.out.println(name.pop());
		System.out.println(name);

	}

}
