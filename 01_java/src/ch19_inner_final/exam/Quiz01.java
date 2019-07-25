package ch19_inner_final.exam;
interface View{
	interface OnClickListener {
		public void onClick();
	}
}
class Button {
	public void setOnClickListener(View.OnClickListener click) {
		click.onClick();
	}
}

public class Quiz01 {

	public static void main(String[] args) {
		Button b = new Button();
		//클릭됨
//		b.setOnClickListener(click);
		b.setOnClickListener(new View.OnClickListener() {
			public void onClick() {
				System.out.println("클릭됨..");
			}
		});

	}

}
