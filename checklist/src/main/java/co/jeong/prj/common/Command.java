package co.jeong.prj.common;

import java.util.Scanner;

public interface Command {
	public void execute();
	public Scanner scn = new Scanner(System.in);
}
