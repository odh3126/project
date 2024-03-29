package ch18_exception.exam;

public class PriceMain {
    public static void main(String[] args) {
        try {
            System.out.println("======================================================");
            System.out.println("책 정보");
            System.out.println("======================================================");
            JavaBookSale jbs = new JavaBookSale("마음을 자극하는 자바프로그래밍", 20000, 10);
            System.out.println( jbs );
            
            System.out.println("======================================================");
            System.out.println("컴퓨터 정보");
            System.out.println("======================================================");
            ComputerSale cs  = new ComputerSale("삼보컴퓨터", 790_000, 30);
            System.out.println( cs );
            System.out.println("======================================================");
            
            // 위쪽소스를 주석처리하고 아래의 소스 주석해제후 실행시 예외발생 해야함
//           JavaBookSale jbs = new JavaBookSale("마음을 자극하는 자바프로그래밍", -1, 10);
//           ComputerSale cs  = new ComputerSale("삼보컴퓨터", 10000000, 90);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}

