import java.util.Comparator;

public class PriorityQueue {

	public static void main(String[] args) {
		
		//used anonymous instantiation for the comparator
		java.util.PriorityQueue<String> pq = new java.util.PriorityQueue<String>(new Comparator<String>() {

			public int compare(String s1, String s2) {
				
				return s1.compareTo(s2);
			}
			
		});
		
		pq.add("gef");
		pq.add("abc");
		pq.add("bde");
		//Use poll method to get the sorted list
		System.out.println(pq.poll());
		System.out.println(pq.poll());
		System.out.println(pq.poll());

	}

}
