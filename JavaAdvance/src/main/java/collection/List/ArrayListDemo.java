package collection.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import entity.Person;

public class ArrayListDemo {

	public static void main(String[] args) {

		List<Person> listPerson = new ArrayList<Person>();
		Person p1 = new Person();
		p1.setId(1);
		p1.setName("DongVV2");
		listPerson.add(p1);
		
		p1 = new Person();
		p1.setId(3);
		p1.setName("DongVo");
		listPerson.add(p1);
		
		p1 = new Person();
		p1.setId(2);
		p1.setName("DongVanVo");
		listPerson.add(p1);
		
		// before sort
		System.out.println("Before Sort");
		for(Person p : listPerson) {
			System.out.println(p.getId() + " - " + p.getName());
		}
		
		System.out.println("After Sort");
		// Có 3 loại sort, nhưng giờ dùng 2 loại là comparator và comparable
		// comparable thì implements trong class Person -> trong main này chỉ gọi ra và dùng thôi
		// còn comparator thì có thể dùng trong này lun hoặc cũng có thể implement như comparable
		Collections.sort(listPerson, new Comparator<Person>() {

			public int compare(Person p1, Person p2) {
				if (p1.getId() > p2.getId()) {
					return 1;
				} else if(p1.getId() == p2.getId()) {
					return 0;
				} else {
					return -1;
				}
			}
		});
		Iterator it = listPerson.iterator();
		while(it.hasNext()) {
			Person p = (Person) it.next();
			System.out.println(p.getId() + " - " + p.getName());
		}
	}
	
}