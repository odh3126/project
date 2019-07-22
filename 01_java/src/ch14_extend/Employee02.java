package ch14_extend;
//부모 클래스
public class Employee02 {
	/**사번*/
	int empNo;
	/**사원명*/
	String name;
	
	public Employee02() {}
	
	public Employee02(int empNo, String name) {
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
	public String info() {
		//return "name  = " + name + ", empNo=" + empNo;
		return String.format("name = %s, empNo = %d", name, empNo);
	}
	
}
