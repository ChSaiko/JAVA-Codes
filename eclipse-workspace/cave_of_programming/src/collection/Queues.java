package collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Queues {

	public static void main(String[] args) {
//(head)<-ooooooooooooooooooooooo<-(tail=end of queues)
		Queue<Integer> q1 = new ArrayBlockingQueue<Integer>(3);

		// System.out.println("The head of queue is: "+q1.element());

		q1.add(10);
		q1.add(55);
		q1.add(87);
		// q1.add(44);

		System.out.println("The head of queue is: " + q1.element());
		try {
			q1.add(44);
		} catch (IllegalStateException e) {

			System.out.println("Tried to add too many items to the queue.");

		}
		for (Integer value : q1) {
			System.out.println("Queue value:" + value);
		}

		System.out.println("Remove from queue :" + q1.remove());
		System.out.println("Remove from queue :" + q1.remove());
		System.out.println("Remove from queue :" + q1.remove());

		try {

			System.out.println("Remove from queue :" + q1.remove());

		} catch (Exception e) {
			System.out.println("Try to remove a item from the queue");
		}
		Queue<Integer> q2 = new ArrayBlockingQueue<Integer>(2);

		System.out.println("Queue 2 peek: " + q2.peek());

		q2.offer(10);
		q2.offer(55);

		System.out.println("Queue 2 peek: " + q2.peek());

		if (q2.offer(87) == false) {
			System.out.println("Offer faild to add thrid item");
			// offer=add
		}

		for (Integer value : q2) {

			System.out.println("Queue 2 value:" + value);
		}
		System.out.println("Queue 2 poll " + q2.poll());
		// remove=poll

	}

}
