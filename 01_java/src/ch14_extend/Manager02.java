package ch14_extend;
//자식 클래스
public class Manager02 extends Employee02{
	
	Employee02ArrayList mngList = new Employee02ArrayList();
	
	public Manager02() {
		/*
		System.out.println(name);
		System.out.println(super.name);
		*/
	}
	
	public Manager02(int empNo, String name) {
		super(empNo, name);
		
	}
	public void addEmployee(Employee02 e) {
		mngList.add(e);
	}
	
	public String info() {
		StringBuilder msg = new StringBuilder(super.info());				
		
		msg.append("\n관리하는 사원의 정보\n");
		msg.append("----------------\n");
		for (int i = 0; i < mngList.size(); i++) {
			Employee02 e = mngList.get(i);
			msg.append(e.info() + "\n");
		}
		msg.append("----------------\n");		
		return msg.toString(); //문자열로 전환		
		
		/*
		String msg = String.format("name = %s, empNo = %d", name, empNo);
		msg += "\n관리하는 사원의 정보\n";
		msg += "----------------\n";
		for (int i =0; i < mngList.size(); i++) {
			Employee01 e = mngList.get(i);
			msg += e.info() + "\n";
		}
		msg += "----------------\n";
		
		return msg; 
		*/
	}
}

