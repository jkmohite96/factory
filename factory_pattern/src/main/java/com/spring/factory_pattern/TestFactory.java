package com.spring.factory_pattern;

public class TestFactory {
	
	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer("PC", "2GB","80GB" ,"Pentium 4");
		
		Computer server = ComputerFactory.getComputer("Server", "4GB", "125GB", "DualCore");
		
		System.out.println(pc);
		System.out.println(server);
	}

}
