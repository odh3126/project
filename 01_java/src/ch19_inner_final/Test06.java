/**
 * 
 * 내부 인터페이스
 * 
 */

package ch19_inner_final;

public class Test06 {
	public static void main(String[] args) {
		System.out.println(TopInterface.Player.Addres.BASIC_ADDR);
		
		TopInterface.Player player = new TopInterface.Player() {
			public void play() {System.out.println("play~");}
			public void call() {System.out.println("call~");}
			
		};
		player.play();
		player.call();
	}
}
