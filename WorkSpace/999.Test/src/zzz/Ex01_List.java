package zzz;

import java.util.ArrayList;
import java.util.List;

public class Ex01_List {
	public static void main(String[] args) {
		// Collection : FrameWork
		// Collection : 자료를 수집해서 가지고 있을 수 있는 기능을 가진 자료구조(클래스, 배열)
		// FrameWork : 어떤 목적이나 기능을 미리 쉽게 사용하게 만들어 놓은 것
		// List <Extend Object> list = new...<>();
		// List는 Object를 상속받은 객체 타입만 데이터를 수집하게 해놓음(클래스)
		// List는 <묶을 데이터 타입(DTO)> list = new 자료구조타입 (...);
		// List<E> : E는 요소(Element) : 어떤 내용이 내부에 묶여서 저장될지
		List<String> list = new ArrayList<String>();
		list.add("adfa1"); // List가 String 타입을 묶어놓기로 약속했기 때문에 String만 요소로 넣음
		list.add("adfa2");
		list.add("adfa3");
		list.add("adfa4");
		list.add("adfa5");
		list.add(3, "끼워넣기");
		
		System.out.println(list.size());
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println("========================================");
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
	}
}
