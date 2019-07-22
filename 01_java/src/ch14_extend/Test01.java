package ch14_extend;

public class Test01 {
	public static void main(String[] args) {
		Employee01 e1 = new Employee01();
		e1.setEmpNo(1);
		e1.setName("아놀드");
		
		Employee01 e2 = new Employee01(2, "실버스타");
		
		Manager01 m = new Manager01(3, "배트맨");
		m.addEmployee(e1);
		m.addEmployee(e2);
		
		System.out.println(m.info());
		
		/*
		System.out.println(e1.info());
		System.out.println(e2.info());
		*/
	}
}
