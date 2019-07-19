package ch07_class.project;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 로그인 여부
		boolean isLogin = false;
		// 로그인 사용자 아이디
		String loginId = "";
		// 로그인 사용자 이름
		String loginName = "";
		
		// 사용자 선택 메뉴
		int menu = -1;
		
		// 회원정보
		Member[] memberArr = new Member[10];
		// 회원입력 위치 정보
		int memberPos = 0;
		
		// 게시물
		// ---------------------------
		Board[] boardArr = new Board[10];
		// 게시물 위치 정보
		int boardPos = 0;
		int boardNo = 0;
		// ---------------------------
		
		// 쪽지
		// ---------------------------
		Message[] messageArr = new Message[10];
		
		// 받은쪽지 관련
		int messagePos = 0;
		int messageNo = 0;
		
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
					loginId = sc.nextLine();
					System.out.print("패스워드 : ");
					String loginPass = sc.nextLine();
					System.out.println();

					String loginMsg = "입력정보를 확인하세요";
					for (int i = 0; i < memberPos; i++) {
						Member m = memberArr[i];	
						if (loginId.equals(m.id) && loginPass.equals(m.pass)) {
							isLogin = true;
							loginName = m.name;
							loginMsg = "로그인 되었습니다.";
							break;
						} 
					}
					
					System.out.println(loginMsg);
					break;
					
				case 2:
					if (memberArr.length == memberPos) {
						System.out.println("더이상 가입이 불가능합니다.");
						break;
					}
					System.out.println("회원가입");
					Member m = new Member();
					System.out.println();
					System.out.print("아이디 :");
					m.id = sc.nextLine();
					System.out.print("패스워드 :");
					m.pass = sc.nextLine();
					System.out.print("이름 :");
					m.name = sc.nextLine();
					System.out.print("생년월일 :");
					m.birth = sc.nextLine();
					System.out.print("주소 :");
					m.addr = sc.nextLine();
					
					String emptyMsg = "";
					if ("".equals(m.id)) {
						emptyMsg += "아이디는 필수 입력정보입니다.\n";
					}
					if ("".equals(m.pass)) {
						emptyMsg += "패스워드는 필수 입력정보입니다.\n";
					}
					if ("".equals(m.name)) {
						emptyMsg += "이름은 필수 입력정보입니다.\n";
					}
					if ("".equals(m.birth)) {
						emptyMsg += "생년월일은 필수 입력정보입니다.\n";
					}
					if ("".equals(m.addr)) {
						emptyMsg += "주소는 필수 입력정보입니다.\n";
					}
					
					System.out.println();
					if ("".equals(emptyMsg)) {
						emptyMsg = "회원가입 되었습니다.";
						memberArr[memberPos++] = m;
					}
					
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
							System.out.println("전체 " + boardPos + "개");
							System.out.println("-------------------------------");
							System.out.println("번호 글쓴이 제목  작성일");
							System.out.println("-------------------------------");
							if (boardPos == 0) {
								System.out.println("게시물이 없습니다.");
							}
							for (int i = boardPos ; i > 0; i--) {
								Board b = boardArr[i];
								System.out.printf("%3d %10s %20s %15s\n", b.no, b.writer, b.title, b.regDate);
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
					Member loginMember = null;
					for (Member m : memberArr) {
						if (loginId.equals(m.id) == false) continue;
						
						loginMember = m;
						System.out.println("아이디 : " + m.id);
						System.out.println("패스워드 : " + m.pass);
						System.out.println("이름 : " + m.name);
						System.out.println("생년월일 : " + m.birth);
						System.out.println("주소 : " + m.addr);
						break;
					}
					
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
							loginMember.addr = sc.nextLine();
							System.out.println("회원정보가 수정되었습니다.");
							break;
							
						case 2:
							System.out.println("탈퇴 시 사이트의 기능 사용이 제한됩니다.");
							System.out.print("탈퇴하시겠습니까?(Y/N) : ");
							String withdrawal = sc.nextLine();
							if ("Y".equalsIgnoreCase(withdrawal)) {
								System.out.println("탈퇴처리되었습니다.");
								isLogin = false;
								
								int delMemberIndex = -1;
								for (int i = 0; i < memberPos; i++) {
									Member m = memberArr[i];
									if (loginId.equals(m.id) == false) continue;
									
									delMemberIndex = i;
									break;
								}
								
								// 삭제할 멤버가 있는 경우
								if (delMemberIndex != -1) {
									System.arraycopy(memberArr, delMemberIndex + 1, memberArr, delMemberIndex, 1);
									memberArr[--memberPos] = null;
								}
								
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
							System.out.println("전체 " + boardPos + "개");
							System.out.println("-------------------------------");
							System.out.println("번호 글쓴이 제목  작성일");
							System.out.println("-------------------------------");
							if (boardPos == 0) {
								System.out.println("게시물이 없습니다.");
							}
							for (int i = boardPos - 1 ; i >= 0; i--) {
								Board b = boardArr[i];
								System.out.printf("%3d %10s %20s %15s\n", b.no, b.writer, b.title, b.regDate);
							}
							System.out.println("-------------------------------");
							break;
						
						case 2:
							System.out.print("조회할 글번호를 입력하세요 : ");
							int searchNo = Integer.parseInt(sc.nextLine());
							System.out.println("-------------------------------");
							boolean flag = false;
							for (int i = 0; i < boardPos; i++) {
								Board b = boardArr[i];
								
								if (b.no != searchNo) continue;
								
								System.out.println("번호 : " + searchNo);
								System.out.println("글쓴이 : " + b.writer);
								System.out.println("제목 : " + b.title);
								System.out.println("내용 : " + b.content);
								System.out.println("작성일시 : " + b.regDate);
								
								flag = true;
							}
							
							if (flag == false) System.out.println("입력된 번호는 존재하지 않습니다.");	

							System.out.println("-------------------------------");
							break;
							
						case 3:
							if (boardArr.length == boardPos) {
								System.out.println("더이상 등록이 불가능합니다.");
								break;
							}
							
							Board b = new Board();
							System.out.print("제목을 입력하세요 : ");
							b.title = sc.nextLine();
							System.out.print("내용을 입력하세요 : ");
							b.content = sc.nextLine();
							System.out.print("작성일시를 입력하세요 : ");
							b.regDate = sc.nextLine();
							
							// 로그인 정보에 있는 이름으로 작성자를 설정한다.
							b.writer = loginName;
							
							System.out.println();
							System.out.println("게시글이 등록되었습니다.");

							// 게시물 번호
							b.no = ++boardNo;
							
							// 게시글 개수 올리기 : 데이터저장 처리 이후에는 1씩 증가시키기
							boardArr[boardPos++] = b;
							
							break;
							
						case 4:
							System.out.print("수정할 글번호를 입력하세요 : ");
							int modNo = Integer.parseInt(sc.nextLine());
							boolean modFlag = false;
							for (int i = 0; i < boardPos; i++) {
								Board board = boardArr[i];
								
								if (board.no != modNo) continue;
								
								System.out.print("제목을 입력하세요 : ");
								board.title = sc.nextLine();
								System.out.print("내용을 입력하세요 : ");
								board.content = sc.nextLine();
								System.out.println();
								System.out.println("게시글이 수정되었습니다.");
								
								modFlag = true;
							}
							
							if (modFlag == false) {
								System.out.println("해당 게시물이 존재하지 않습니다.");
							}
							break;
							
						case 5:
							System.out.print("삭제할 글번호를 입력하세요 : ");
							int delNo = Integer.parseInt(sc.nextLine());
							boolean delFlag = false;
							int delBoardIndex = -1;
							for (int i = 0; i < boardPos; i++) {
								Board temp = boardArr[i];
								if (temp.no != delNo) continue;
								
								delBoardIndex = i;
								
								System.out.println();
								System.out.println("게시글이 삭제되었습니다.");
								
								delFlag = true;
							}
							
							if (delBoardIndex != -1) {
								System.arraycopy(boardArr, delBoardIndex + 1, boardArr, delBoardIndex, 1);
								boardArr[--boardPos] = null;
							}
							
							if (delFlag == false) {
								System.out.println("해당 게시물이 존재하지 않습니다.");
							}
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
							int recvNoteCnt = 0;
							Message[] recvMsgArr = new Message[messagePos];
							for (int i = 0; i < messagePos; i++) {
								Message msg = messageArr[i];
								if (msg.status == 2 || msg.status == 3) continue;
								if (msg.receiver.equals(loginId) == false) continue;
								
								recvMsgArr[recvNoteCnt++] = msg;
							}

							System.out.println("받은쪽지함");
							System.out.println();
							while (true) {
								
								
								System.out.printf("전체 %d개%n", recvNoteCnt);
								System.out.println("-------------------------------");
								System.out.println("번호 보낸이 보낸날짜  읽음");
								System.out.println("-------------------------------");
								for (int i = 0; i < recvNoteCnt; i++) {
									Message msg = recvMsgArr[i];
									System.out.printf("%3d %10s %20s %15s\n", msg.no, msg.sender, msg.sendDate, msg.readYN ? msg.readDate : "안읽음" );
								}
								
								if (recvNoteCnt == 0) {
									System.out.println("받은 쪽지가 없습니다.");
								}
								System.out.println("-------------------------------");

								System.out.println("-------------------------------");
								if (recvNoteCnt != 0) {
									System.out.println("1. 읽기");
								}
								System.out.println("0. 이전");
								System.out.println("-------------------------------");
								System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");

								menu = Integer.parseInt(sc.nextLine());
								if (menu == 1) {
									System.out.print("번호 : ");
									int readNo = Integer.parseInt(sc.nextLine());
									
									System.out.println("-------------------------------");
									boolean flag = false;
									for (int i = 0; i < recvNoteCnt; i++) {
										Message msg = recvMsgArr[i];
										
										if (msg.no != readNo) continue;
										
										System.out.println("번호 : " + msg.no);
										System.out.println("보낸이 : " + msg.sender);
										System.out.println("내용 : " + msg.content);
										System.out.println("보낸날짜 : " + msg.sendDate);
										
										msg.readYN = true;
										
										flag = true;
									}
									
									if (flag == false) {
										System.out.println(readNo + "번 쪽지가 존재하지 않습니다.");
										continue;
									}
									System.out.println("-------------------------------");
									
									System.out.println("-------------------------------");
									System.out.println("1. 삭제");
									System.out.println("0. 이전");
									System.out.println("-------------------------------");
									System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
									int subMenu = Integer.parseInt(sc.nextLine());
									if (subMenu == 1) {
										System.out.print("삭제할 쪽지번호를 입력하세요 : ");
										int delMsgNo = Integer.parseInt(sc.nextLine());
										
										boolean delFlag = false;
										for (int i = 0; i < recvNoteCnt; i++) {
											Message msg = recvMsgArr[i];
											
											if (msg.no != delMsgNo) continue;
											
											if (msg.status == 0) msg.status = 2;
											else msg.status = 3;
											
											delFlag = true;
										}
										
										if (delFlag == false) {
											System.out.println(delMsgNo + "번 쪽지가 존재하지 않습니다.");
											continue;
										}
										
										System.out.println("쪽지가 삭제되었습니다.");
									} 
									continue;
								}
								if (menu == 0) {
									break;
								}
							}
							break;
						
						case 2:

							int sendNoteCnt = 0;
							Message[] sendMsgArr = new Message[messagePos];
							for (int i = 0; i < messagePos; i++) {
								Message msg = messageArr[i];
								if (msg.status == 1 || msg.status == 3) continue;
								if (msg.sender.equals(loginId) == false) continue;
								
								sendMsgArr[sendNoteCnt++] = msg;
							}
							
							System.out.println("보낸쪽지함");
							System.out.println();
							
							while (true) {

								
								System.out.printf("전체 %d개%n", sendNoteCnt);
								System.out.println("-------------------------------");
								System.out.println("번호 받는사람 보낸날짜  받은날짜");
								System.out.println("-------------------------------");
								for (int i = 0; i < sendNoteCnt; i++) {
									Message msg = sendMsgArr[i];
									System.out.printf("%3d %10s %20s %15s\n", msg.no, msg.receiver, msg.sendDate, msg.readYN ? msg.readDate : "안읽음" );
								}
								
								if (sendNoteCnt == 0) {
									System.out.println("보낸 쪽지가 없습니다.");
								}
								System.out.println("-------------------------------");
								
								System.out.println("-------------------------------");
								if (sendNoteCnt != 0) {
									System.out.println("1. 읽기");
								}
								System.out.println("0. 이전");
								
								System.out.println("-------------------------------");
								System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
								menu = Integer.parseInt(sc.nextLine());
								if (menu == 1) {
									System.out.print("번호 : ");
									int readNo = Integer.parseInt(sc.nextLine());
									
									System.out.println("-------------------------------");
									boolean flag = false;
									for (int i = 0; i < sendNoteCnt; i++) {
										Message msg = sendMsgArr[i];
										
										if (msg.no != readNo) continue;
										
										System.out.println("번호 : " + msg.no);
										System.out.println("받은사람 : " + msg.receiver);
										System.out.println("내용 : " + msg.content);
										System.out.println("보낸날짜 : " + msg.sendDate);
										
										flag = true;
									}
									
									if (flag == false) {
										System.out.println(readNo + "번 쪽지가 존재하지 않습니다.");
										continue;
									}
									System.out.println("-------------------------------");
									
									System.out.println("-------------------------------");
									System.out.println("1. 삭제");
									System.out.println("0. 이전");
									System.out.println("-------------------------------");
									System.out.print("메뉴 중 처리할 항목을 선택하세요 : ");
									int subMenu = Integer.parseInt(sc.nextLine());
									if (subMenu == 1) {
										System.out.print("삭제할 쪽지번호를 입력하세요 : ");
										int delMsgNo = Integer.parseInt(sc.nextLine());
										
										boolean delFlag = false;
										for (int i = 0; i < sendNoteCnt; i++) {
											Message msg = sendMsgArr[i];
											
											if (msg.no != delMsgNo) continue;
											
											if (msg.status == 0) msg.status = 1;
											else msg.status = 3;
											
											delFlag = true;
										}
										
										if (delFlag == false) {
											System.out.println(delMsgNo + "번 쪽지가 존재하지 않습니다.");
											continue;
										}
										
										System.out.println("쪽지가 삭제되었습니다.");
									} 
									continue;
								}
								if (menu == 0) {
									break;
								}
							}
							
							break;
						
						case 3:
							Message msg = new Message();
							msg.no = ++messageNo;
							msg.sender = loginId;
							
							System.out.println("쪽지쓰기");
							System.out.println();
							System.out.print("받는사람 : ");
							msg.receiver = sc.nextLine();
							System.out.print("내용 : ");
							msg.content = sc.nextLine();
							System.out.println();
							System.out.println("쪽지를 보냈습니다.");
							
							messageArr[messagePos++] = msg;
							
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