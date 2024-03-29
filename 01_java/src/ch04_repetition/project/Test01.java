﻿package ch04_repetition.project;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// 로그인 여부
		boolean isLogin = false;
		
		// 사용자 선택 메뉴
		int menu = -1;
		
		// 회원정보
		String id = "";
		String pass = "";
		String name = "";
		String birth = "";
		String addr = "";
		
		// 게시물
		// ---------------------------
		int boardCnt = 0;
		int boardNo = 0;
		String writer = "";
		String title = "";
		String content = "";
		String regDate = "";
		// ---------------------------
		
		// 쪽지
		// ---------------------------
		// 받은쪽지 관련
		int recvNoteCnt = 1;
		int recvNoteNo = 1;
		String sender = "고슬링";
		String recvDate = "2011-11-11 11:11:11";
		String recvContent = "반복과 조건을 이용한 쪽지 읽기";
		boolean recvReadYN = true;
		
		// 보낸쪽지 관련
		int sendNoteCnt = 1;
		int sendNoteNo = 1;
		String receiver = "제임스";
		String sendDate = "2011-11-11 10:10:10";
		String sendContent = "반복과 조건을 이용한 쪽지 읽기";
		String sendReadDate = "";
		// ---------------------------
		
		System.out.println("-----------------");
		System.out.println("자바로 구현하는 애플리케이션");
		System.out.println("-----------------");
		Scanner sc = new Scanner(System.in);
		outer: 
		while (true) {
			if (isLogin == false) {
				System.out.println("-----------------");
				System.out.println("1. 로그인");
				System.out.println("2. 회원가입");
				System.out.println("3. 공부게시판");
				System.out.println("0. 종료");
				System.out.println("-----------------");
				System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
				menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				
				case 1:
					System.out.println("로그인");
					System.out.println();
					System.out.print("아이디 : ");
					String loginId = sc.nextLine();
					System.out.print("패스워드 : ");
					String loginPass = sc.nextLine();
					System.out.println();

					String loginMsg = "입력정보를 확인하세요";
					if (loginId.equals(id) && loginPass.equals(pass)) {
						isLogin = true;
						loginMsg = "로그인 되었습니다.";
					} 
					System.out.println(loginMsg);
					break;
					
				case 2:
					
					System.out.println("회원가입");
					System.out.println();
					System.out.print("아이디 :");
					id = sc.nextLine();
					System.out.print("패스워드 :");
					pass = sc.nextLine();
					System.out.print("이름 :");
					name = sc.nextLine();
					System.out.print("생년월일 :");
					birth = sc.nextLine();
					System.out.print("주소 :");
					addr = sc.nextLine();
					
					String emptyMsg = "";
					if ("".equals(id)) {
						emptyMsg += "아이디는 필수 입력정보입니다.\n";
					}
					if ("".equals(pass)) {
						emptyMsg += "패스워드는 필수 입력정보입니다.\n";
					}
					if ("".equals(name)) {
						emptyMsg += "이름은 필수 입력정보입니다.\n";
					}
					if ("".equals(birth)) {
						emptyMsg += "생년월일은 필수 입력정보입니다.\n";
					}
					if ("".equals(addr)) {
						emptyMsg += "주소는 필수 입력정보입니다.\n";
					}
					
					System.out.println();
					if ("".equals(emptyMsg)) emptyMsg = "회원가입 되었습니다.";
					
					System.out.println(emptyMsg);						
					break;
					
				case 3:
					
					while (true) {
						System.out.println("-----------------");
						System.out.println("1. 전체 조회");
						System.out.println("2. 글번호 조회");
						System.out.println("3. 글등록");
						System.out.println("4. 글수정");
						System.out.println("5. 글삭제");
						System.out.println("0. 이전");
						System.out.println("-----------------");
						System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
						menu = Integer.parseInt(sc.nextLine());
						
						switch (menu) {
						
						case 1:
							System.out.println("전체 " + boardCnt + "개");
							System.out.println("-------------------------------");
							System.out.println("번호 글쓴이 제목  작성일");
							System.out.println("-------------------------------");
							if (boardCnt == 0) {
								System.out.println("게시물이 없습니다.");
							}
							for (int i = boardCnt ; i > 0; i--) {
								System.out.printf("%3d %10s %20s %15s\n", i, writer, title, regDate);
							}
							System.out.println("-------------------------------");
							break;
						
						case 2:
						case 3:
						case 4:
						case 5:
							System.out.println("로그인 후 사용 가능합니다.");
						case 0:
							continue outer;
						
						default:
							System.out.println("잘못된 메뉴번호 입니다.");
							System.out.println("다시 선택해 주세요.");
						}
					}
					
				case 0:
					System.out.println("자바 프로젝트 사이트를 종료합니다.");
					break outer;
				default:
					System.out.println("잘못된 메뉴번호 입니다.");
					System.out.println("다시 선택해 주세요.");
				}
			} else {
				System.out.println("-----------------");
				System.out.println("1. 로그아웃");
				System.out.println("2. 회원정보");
				System.out.println("3. 공부게시판");
				System.out.println("4. 쪽지");
				System.out.println("0. 종료");
				System.out.println("-----------------");
				System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
				menu = Integer.parseInt(sc.nextLine());
				switch (menu) {
				
				case 1:
					
					System.out.println("로그아웃 되었습니다.");
					isLogin = false;
					break;
					
				case 2:
					
					System.out.println();
					System.out.println("-------------------------------");
					System.out.println("아이디 : " + id);
					System.out.println("패스워드 : " + pass);
					System.out.println("이름 : " + name);
					System.out.println("생년월일 : " + birth);
					System.out.println("주소 : " + addr);
					while (true) {
						System.out.println("-------------------------------");
						System.out.println("1. 수정");
						System.out.println("2. 탈퇴");
						System.out.println("0. 이전");
						System.out.println("-------------------------------");
						System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
						menu = Integer.parseInt(sc.nextLine());
						
						switch (menu) {
						case 1:
							System.out.print("수정할 주소를 입력하세요 : ");
							addr = sc.nextLine();
							System.out.println("회원정보가 수정되었습니다.");
							break;
							
						case 2:
							System.out.println("탈퇴 시 사이트의 기능 사용이 제한됩니다.");
							System.out.print("탈퇴하시겠습니까?(Y/N) : ");
							String withdrawal = sc.nextLine();
							if ("Y".equalsIgnoreCase(withdrawal)) {
								System.out.println("탈퇴처리되었습니다.");
								isLogin = false;
								id = "";
								pass = "";
								birth = ""; 
								name = "";
								addr = "";
								continue outer;
							} 
							System.out.println("취소되었습니다.");
							break;
							
						case 0:
							continue outer;
							
						default:
							System.out.println("잘못된 메뉴번호 입니다.");
							System.out.println("다시 선택해 주세요.");
						}
					}
					
				case 3:
					while (true) {
						System.out.println("-----------------");
						System.out.println("1. 전체 조회");
						System.out.println("2. 글번호 조회");
						System.out.println("3. 글등록");
						System.out.println("4. 글수정");
						System.out.println("5. 글삭제");
						System.out.println("0. 이전");
						System.out.println("-----------------");
						System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
						menu = Integer.parseInt(sc.nextLine());
						
						switch (menu) {
						
						case 1:
							System.out.println("전체 " + boardCnt + "개");
							System.out.println("-------------------------------");
							System.out.println("번호 글쓴이 제목  작성일");
							System.out.println("-------------------------------");
							if (boardCnt == 0) {
								System.out.println("게시물이 없습니다.");
							}
							for (int i = boardCnt ; i > 0; i--) {
								System.out.printf("%3d %10s %20s %15s\n", i, writer, title, regDate);
							}
							System.out.println("-------------------------------");
							break;
						
						case 2:
							System.out.print("조회할 글번호를 입력하세요 : ");
							int searchNo = Integer.parseInt(sc.nextLine());
							System.out.println("-------------------------------");
							if (boardCnt == 1) {
								System.out.println("번호 : " + searchNo);
								System.out.println("글쓴이 : " + writer);
								System.out.println("제목 : " + title);
								System.out.println("내용 : " + content);
								System.out.println("작성일시 : " + regDate);
							} else {
								System.out.println("입력된 번호는 존재하지 않습니다.");	
							}
							System.out.println("-------------------------------");
							break;
							
						case 3:
							System.out.print("제목을 입력하세요 : ");
							title = sc.nextLine();
							System.out.print("내용을 입력하세요 : ");
							content = sc.nextLine();
							System.out.print("작성일시를 입력하세요 : ");
							regDate = sc.nextLine();
							
							// 로그인 정보에 있는 이름으로 작성자를 설정한다.
							writer = name;
							
							System.out.println();
							System.out.println("게시글이 등록되었습니다.");
							
							// 게시글 개수 올리기 : 데이터저장 처리 이후에는 1씩 증가시키기
							boardCnt = 1;
							
							break;
							
						case 4:
							System.out.print("수정할 글번호를 입력하세요 : ");
							sc.nextLine();
							System.out.print("제목을 입력하세요 : ");
							title = sc.nextLine();
							System.out.print("내용을 입력하세요 : ");
							content = sc.nextLine();
							
							System.out.println();
							System.out.println("게시글이 수정되었습니다.");
							
							break;
							
						case 5:
							System.out.print("삭제할 글번호를 입력하세요 : ");
							sc.nextLine();

							title = "";
							writer = "";
							regDate = "";
							
							boardCnt = 0;
							
							System.out.println();
							System.out.println("게시글이 삭제되었습니다.");
							break;

						case 0:
							continue outer;
						
						default:
							System.out.println("잘못된 메뉴번호 입니다.");
							System.out.println("다시 선택해 주세요.");
						}
					}
					
				case 4:
					while (true) {
						System.out.println("-----------------");
						System.out.println("1. 받은쪽지함");
						System.out.println("2. 보낸쪽지함");
						System.out.println("3. 쪽지보내기");
						System.out.println("0. 이전");
						System.out.println("-----------------");
						System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
						menu = Integer.parseInt(sc.nextLine());
						
						switch (menu) {
						
						case 1:
							System.out.println("받은쪽지함");
							System.out.println();
							
							while (true) {
								System.out.printf("전체 %d개%n", recvNoteCnt);
								System.out.println("-------------------------------");
								System.out.println("번호 보낸이 받은날짜  읽음");
								System.out.println("-------------------------------");
								if (recvNoteCnt == 1) {
									System.out.printf("%3d %10s %20s %15s\n", recvNoteNo, sender, recvDate, recvReadYN ? "읽음" : "안읽음");
								}
								else {
									System.out.println("받은 쪽지가 없습니다.");
								}
								System.out.println("-------------------------------");
								
								System.out.println("-------------------------------");
								if (recvNoteCnt == 1) {
									System.out.println("1. 읽기");
								}
								System.out.println("0. 이전");
								
								System.out.println("-------------------------------");
								System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
								menu = Integer.parseInt(sc.nextLine());
								if (menu == 1) {
									System.out.println("-------------------------------");
									System.out.println("번호 : " + recvNoteNo);
									System.out.println("보낸이 : " + sender);
									System.out.println("내용 : " + recvContent);
									System.out.println("받은날짜 : " + recvDate);
									System.out.println("-------------------------------");
									System.out.println("-------------------------------");
									System.out.println("1. 삭제");
									System.out.println("0. 이전");
									System.out.println("-------------------------------");
									System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
									int subMenu = Integer.parseInt(sc.nextLine());
									if (subMenu == 1) {
										System.out.print("삭제할 쪽지번호를 입력하세요 : ");
										sc.nextLine();
										System.out.println("쪽지가 삭제되었습니다.");
										recvNoteCnt = 0;
									} 
									continue;
								}
								if (menu == 0) {
									break;
								}
							}
							
							break;
						
						case 2:
							System.out.println("보낸쪽지함");
							System.out.println();
							
							while (true) {
								System.out.printf("전체 %d개%n", sendNoteCnt);
								System.out.println("-------------------------------");
								System.out.println("번호 받는사람 보낸날짜  받은날짜");
								System.out.println("-------------------------------");
								if (sendNoteCnt == 1) {
									System.out.printf("%3d %10s %20s %15s\n", sendNoteNo, receiver, sendDate, sendReadDate.equals("") ? "안읽음" : sendReadDate);
								}
								else {
									System.out.println("보낸 쪽지가 없습니다.");
								}
								System.out.println("-------------------------------");
								
								System.out.println("-------------------------------");
								if (sendNoteCnt == 1) {
									System.out.println("1. 읽기");
								}
								System.out.println("0. 이전");
								
								System.out.println("-------------------------------");
								System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
								menu = Integer.parseInt(sc.nextLine());
								if (menu == 1) {
									System.out.println("-------------------------------");
									System.out.println("번호 : " + sendNoteNo);
									System.out.println("받은사람 : " + receiver);
									System.out.println("내용 : " + sendContent);
									System.out.println("보낸날짜 : " + sendDate);
									System.out.println("-------------------------------");
									System.out.println("-------------------------------");
									System.out.println("1. 삭제");
									System.out.println("0. 이전");
									System.out.println("-------------------------------");
									System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
									int subMenu = Integer.parseInt(sc.nextLine());
									if (subMenu == 1) {
										System.out.print("삭제할 쪽지번호를 입력하세요 : ");
										sc.nextLine();
										System.out.println("쪽지가 삭제되었습니다.");
										sendNoteCnt = 0;
									} 
									continue;
								}
								if (menu == 0) {
									break;
								}
							}
							
							break;
						
						case 3:
							System.out.println("쪽지쓰기");
							System.out.println();
							System.out.print("받는사람 : ");
							receiver = sc.nextLine();
							System.out.print("내용 : ");
							sendContent = sc.nextLine();
							System.out.println();
							System.out.println("쪽지를 보냈습니다.");
							sendNoteCnt = 1;
							
							break;
							
						case 0:
							continue outer;
						
						default:
							System.out.println("잘못된 메뉴번호 입니다.");
							System.out.println("다시 선택해 주세요.");
						}
					}
					
				case 0:
					System.out.println("자바 프로젝트 사이트를 종료합니다.");
					break outer;
					
				default:
					System.out.println("잘못된 메뉴번호 입니다.");
					System.out.println("다시 선택해 주세요.");
				}
				
			}
		}
		sc.close();
	}
}