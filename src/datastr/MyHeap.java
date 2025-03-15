package datastr;

public class MyHeap<Ttype> {
	//mainīgie
	private Ttype[] heap;
	private final int DEFAULT_SIZE = 10;
	private int size = DEFAULT_SIZE;
	private int counter = 0;
	
	//bezargumenta konstruktors
		public MyHeap() {
			heap = (Ttype[])new Object[size];
		}
		
		//argumenta konstruktors
		public MyHeap(int inputSize) {
			if(inputSize > 0) {
				size = inputSize;
			}
			
			heap = (Ttype[])new Object[size];	
		}
		
		public boolean isFull()
		{
			return (counter == size);
		}
		
		public boolean isEmpty() {
			return (counter == 0);
		}
		
		public int howManyElements() {
			return counter;
		}
		
		private void resize() {
			size = (counter < 100) ? size * 2 : (int)(size * 1.5);
			Ttype[] listNew = (Ttype[]) new Object[size];
			
			for(int i = 0; i < counter; i++) {
				listNew[i] = heap[i];
			}
			heap = listNew;
			System.gc();//izsaucam atkritumu savācēju, kas izdzēsīs mazā masīva elementus
			
		}
		
		public void enqueue(Ttype element) {
			if(isFull())
			{
				resize();
			}
			
			heap[counter] = element;
			counter++;
			
			//TODO jāsakārto jeb jānodrošina kārtības īpašība jeb jāizsauc reheapUp funkcija
			
			
		}
		

}
