package service;

import datastr.MyHeap;

public class MainService {

	public static void main(String[] args) {
		//recursionExample1(); <- ja vēlas bezgalīgo rekursiju
		//recursionExample2(10); //10, 9, 8, 6, 5 (pie 5 rekursiju beigsies)
		
		System.out.println("--------------------INT HEAP--------------------------");
		//TODO izveidot kaudzi priekš int vērtībam
		MyHeap<Integer> heapForInt = new MyHeap<>(2);
		System.out.println("--------------------ENQUEUE--------------------------");
		heapForInt.enqueue(5);
		heapForInt.enqueue(45);
		heapForInt.enqueue(33);
		heapForInt.enqueue(47);
		heapForInt.enqueue(46);
		heapForInt.enqueue(50);
		try {
			heapForInt.print();
			System.out.println("--------------------DEQUEUE--------------------------");
			System.out.println("MAX element: " + heapForInt.dequeue());
			System.out.println("MAX element: " + heapForInt.dequeue());
			heapForInt.print();
			System.out.println("--------------------MAKE EMPTY--------------------------");
			heapForInt.makeEmpty();
			heapForInt.enqueue(100);
			heapForInt.print();//ir tikai 100
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//izņemt lielāko vērtību un to izprintēt
		//apskatīties, kas tur ir
		//izņemt lielāko vērtību un to izprintēt
		//apskatīties, kas tur ir
		//makeEmpty funkcijas izsaukums
		//ielikt jaunu elementu
		//apskatīties, kas tur ir

	}
	
	//bezgalīgas rekursijas piemērs
	public static void recursionExample1() {
		System.out.println("A");
		recursionExample1();
	}
	
	public static void recursionExample2(int N) {
		System.out.println("A -> " + N);
		if(N > 5)
		{
			recursionExample2(N-1);
		}
	}

}
