package ch14_extend.aaa;

public class PackC extends PackA{
	PackC() {
		//상속관계가 있더라도 private 사용 불가능
//		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}
}
