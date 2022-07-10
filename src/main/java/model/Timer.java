package model;

public class Timer {
	private long start;
	private long end;

	public void start(){
		start = System.nanoTime();
	}
	public void stop(){
		end= System.nanoTime();

	}
	public long getTime(){
		return end-start;
	}
}
