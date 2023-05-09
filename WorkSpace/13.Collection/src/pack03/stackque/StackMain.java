package pack03.stackque;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackMain {
	public static void main(String[] args) {
		// 실제로 사용빈도가 낮음
		// last-in-first-out(LIFO): 후입선출 자료구조, 프링글스 자료구조
		// push
		Stack<Integer> intStack = new Stack<>();
		intStack.push(10);
		intStack.push(20);
		System.out.println(intStack.pop());
		System.out.println(intStack.pop());

		// first-in-first-out(FIFO): 선입선출 자료구조
		Queue<Integer> intQue = new LinkedList<Integer>(); // LinkedList는 Interface구조 Queue를 상속받음
		intQue.offer(10);
		intQue.offer(20);
		System.out.println(intQue.poll());
		System.out.println(intQue.poll());

		// DEQUE <- 양쪽으로 빼는게 가능한 구조

	}
}
