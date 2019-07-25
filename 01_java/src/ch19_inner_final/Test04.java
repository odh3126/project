/**
 * class TopClass{
 * 		static class SInner {}
 * }
 * 2.멤버변수 자리에 선언되면서 static이 붙이는 클래스(StaticInnerClass)
 * 	 -  static 변수나 메서드를 선언할 수 있음
 */
package ch19_inner_final;
/*
class R {
	static Layout layout;
	static Drawable drawable;
	static Strings strings;
}
class Layout {
	public static final int main_layout = 0x0001;
	public static final int sub_layout = 0x0002;
}
class Drawable {
	public static final String img1 = "a.png";
	public static final String img2 = "b.png";
}
class Strings {
	public static final String hello = "안녕하세요";
	public static final String title = "내부클래스 테스트중..";
}
*/
class R {
	static class layout {
		public static final int main_layout = 0x0001;
		public static final int sub_layout = 0x0002;
	}
	static class drawable {
		public static final String img1 = "a.png";
		public static final String img2 = "b.png";
	}
	static class strings {
		public static final String hello = "안녕하세요";
		public static final String title = "내부클래스 테스트중..";
	}
}

public class Test04 {
	public static void main(String[] args) {
		System.out.println(R.drawable.img1);
		System.out.println(R.strings.title);
		System.out.println(R.layout.main_layout);
	}
}