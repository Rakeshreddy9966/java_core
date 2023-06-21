package com.dl.Interface;

public class TempleRun implements GamingConsole{

	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
		System.out.println("die");
		
	}

	@Override
	public void right() {
		System.out.println("born");
		
	}

	@Override
	public void left() {
		System.out.println("re-born");
		
	}

}
