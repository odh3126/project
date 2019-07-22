package ch14_extend;

public class Manager01 {
	int empNo;
	String name;
	Employee01ArrayList mngList = new Employee01ArrayList();
	
	public Manager01() {}
	
	public Manager01(int empNo, String name) {
		this.empNo = empNo;
		this.name = name;	
	}
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void addEmployee(Employee01 e) {
		mngList.add(e);
	}
	
	public String info() {
		StringBuilder msg = new StringBuilder(
				String.format("name = %s, empNo = %d", name, empNo));
		msg.append("\n관리하는 사원의 정보\n");
		msg.append("----------------\n");
		for (int i =0; i < mngList.size(); i++) {
			Employee01 e = mngList.get(i);
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

