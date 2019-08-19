package kr.co.mlec.test;

import java.util.Arrays;
import java.util.List;

import kr.co.mlec.domain.Member;
import kr.co.mlec.dao.TestMapper1;

public class Test1 {
	
	private TestMapper1 mapper = new TestMapper1();
	
	// 데이터를 조회하기 : 하나의 로우를 반환
	private void test01() {
		/*
		Member m = mapper.selectMemberInfo1("member-2");
		if (m != null) {
			System.out.println("이름 : " + m.getName());
			System.out.println("주소 : " + m.getAddr());
		}
		*/
		/*
		Member param = new Member();
		param.setId("member-3");
		param.setName("jsp");
		
		Member m = mapper.selectMemberInfo2(param);
		if (m != null) {
			System.out.println("이름 : " + m.getName());
			System.out.println("주소 : " + m.getAddr());
		}
		*/
		System.out.println("이름 : " + mapper.selectMemberInfo3("member-1"));
		
		System.out.println("이름 : " + mapper.selectMemberInfo4());
	}
	
	// 여러개의 로우를 결과로 받기
	private void test02() { 
		/*
		List<Member> list  = mapper.selectMemberList1();
		for (Member m : list) {
			System.out.println("이름 : " + m.getName() + ", 가입일 : " + m.getJoinDate());
		}
		*/
		/*
		List<String> list  = mapper.selectMemberList2();
		for (String name : list) {
			System.out.println("이름 : " + name);
		}
		*/
		List<Member> list  = mapper.selectMemberList3();
		for (Member m : list) {
			System.out.println("이름 : " + m.getName() + ", 가입일 : " + m.getJoinDate());
		}
	}

	// 회원 등록
	private void insertMember() {
		Member param = new Member();
		param.setId("member-5");
		param.setName("testtest");
		param.setEmail("test@a.com");
		param.setAddr("test동");
		
		mapper.insertMember(param);
		
		System.out.println("데이터가 등록 되었습니다.");
		
		// 목록확인하기
		test02();
	}
	
	// 회원 수정
	private void updateMember()  {
		Member param = new Member();
		param.setId("member-5");
		param.setName("testtest");
		param.setEmail("testuuu@a.com");
		param.setAddr("testuuu동");
		
		mapper.updateMember(param);
		
		System.out.println("데이터가 수정 되었습니다.");
		
		// 목록확인하기
		test02();
	}
	
	// 회원 삭제
	private void deleteMember() {
		// member-5 회원삭제하기	
		mapper.deleteMember("member-5");
		System.out.println("회원이 삭제 되었습니다.");
		test02();
	}
	
	// 동적 쿼리 처리방식
	private void dynamicSearch() {
	}
	
	
	public static void main(String[] args) {
		try {
			Test1 t = new Test1();
//			t.test01(); // 결과값이 하나인것 테스트
//			t.test02(); // 결과값이 여러개인것 테스트
//			t.insertMember();
//			t.updateMember();
			t.deleteMember();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}










