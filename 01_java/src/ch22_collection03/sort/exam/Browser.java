package ch22_collection03.sort.exam;

import java.util.Scanner;
import java.util.Stack;

public class Browser {
    private Stack<String> back = new Stack<>();
    private Stack<String> next = new Stack<>();
    
    private String now = null;//초기화
    private Scanner sc = new Scanner(System.in);
    
    private int menu() {
        System.out.println("--------------------");
        System.out.println("1. 이동");
        System.out.println("2. 뒤로가기");
        System.out.println("3. 앞으로가기");
        System.out.println("0. 종료");
        System.out.println("--------------------");
        System.out.print("메뉴 : ");
        return Integer.parseInt(sc.nextLine());
    }
    
    public void service() {
        while(true) {
            switch (menu()) {
            case 1: movePage(); break;
            case 2: backPage(); break;
            case 3: nextPage(); break;
            case 0: exit();
            default: System.out.println("메뉴를 선택하세요");
            }
          
        }
    }
    
    public void movePage() {
        if(now != null) {
            back.add(now);
        }
        System.out.print("호출할 페이지 주소 : ");
        String url = sc.nextLine();
        now = url;
        next.clear();
        print();
    }
    
    public void backPage() {
        if(back.empty()) {
            System.out.println("이전 페이지가 없습니다.");
            return;
        }
        next.add(now);
        now = back.pop();
        print();
    }
    
    public void nextPage() {
        if(next.empty()) {
            System.out.println("다음 페이지가 없습니다.");
            return;
        }
        back.add(now);
        now = next.pop();
        print();
    }
    
    public void print() {
        System.out.println("현재 : " + now);
        System.out.println("이전 : " + back);
        System.out.println("앞으로 : " + next);
    }
    
    private void exit() {
    	sc.close();
    	System.out.println("브라우져가 종료 되었습니다.");
    	System.exit(0);
    }
}

