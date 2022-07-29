package javaPlzFinalProject;

import java.util.Scanner;

public abstract class AbstractMenu implements Menu {
	protected String menuText; // 기본 문구
	protected Menu prevMenu;
	protected static final Scanner scanner = new Scanner(System.in);
	
	public AbstractMenu(String menuText, Menu prevMenu) {
		this.menuText = menuText;
		this.prevMenu = prevMenu;
	}
	
	public void print() {
		System.out.print("\n" + menuText);
	}
	
	public void setPrevMenu(Menu prevMenu) {
		this.prevMenu = prevMenu;
	}
}
