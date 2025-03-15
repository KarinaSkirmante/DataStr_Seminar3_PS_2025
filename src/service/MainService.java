package service;

import datastr.MyHeap;
import model.Patient;

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
		System.out.println("--------------------PATIENT HEAP--------------------------");
		MyHeap<Patient> heapForPatients = new MyHeap<>(2);
		System.out.println("--------------------ENQUEUE--------------------------");
		heapForPatients.enqueue(new Patient("Jānis", "Bērziņš", 3));
		heapForPatients.enqueue(new Patient("Līga", "Jaukā", 5));
		heapForPatients.enqueue(new Patient("Baiba", "Nejaukā", 9));
		heapForPatients.enqueue(new Patient("Gatis", "Gudrais", 10));
		try {
			heapForPatients.print();
			System.out.println("--------------------DEQUEUE--------------------------");
			System.out.println("Max patient: " + heapForPatients.dequeue());//Gatis
			System.out.println("Max patient: " + heapForPatients.dequeue());//Baiba
			heapForPatients.print();//saknē Līga un kreisajā pusē Jānis
			System.out.println("--------------------MAKE EMPTY--------------------------");
			heapForPatients.makeEmpty();
			heapForPatients.enqueue(new Patient("Kārlis", "Kalniņš", 5));
			heapForPatients.enqueue(new Patient("Karlīne", "Liepiņa", 9));
			heapForPatients.print();//saknē Karlīne un kreisajā pusē Kārlis
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
