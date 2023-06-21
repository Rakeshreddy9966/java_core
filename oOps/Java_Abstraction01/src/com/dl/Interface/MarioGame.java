package com.dl.Interface;

public class MarioGame implements GamingConsole{

	@Override
	public void up() {
		System.out.println("jump");
	}

	@Override
	public void down() {
		System.out.println("fall");
		
	}

	@Override
	public void right() {
		System.out.println("forward");
		
	}

	@Override
	public void left() {
		System.out.println("backward");
		
	}
	
	

}
