package test;

public class MemberTest {

	public static void main(String[] args) {
		Member me = new Member();
		
		me.setId("user01");
		me.setName("홍길동");
		me.setAge(100);
		
		String id = me.getId();
		String name = me.getName();
		int age = me.getAge();
		
		System.out.println(me.toString());
	}
}

class Member {
	private String id;
	private String name;
	private  int age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() {
		return String.format("Id: %s,이름: %s,나이: %d", this.id ,this.name,this.age);
	}
	
	
	
	
	
}
