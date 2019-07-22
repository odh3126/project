package ch14_extend;

public class Child extends Parent{
	public Child() {
		this("test");
	}
	public Child(String name) {
		super("aaa");
	}
}
