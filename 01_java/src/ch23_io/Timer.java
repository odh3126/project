package ch23_io;

public class Timer {
	long start;
	public void start() {
		start = System.currentTimeMillis();
	}
	public double end() {
		return (System.currentTimeMillis() - start) / 1000d;
	}
}
