package com.abhishek.runner;

import io.cucumber.core.cli.Main;

public class Runner {

	public static void main(String[] args) {
		String features="src/main/resources/feature";
		Main.main(new String[] {features ,"-p" ,"pretty" ,"-m" ,"--monochrome",
				"-g","com/abhishek/hooks" ,"-g","classpath:com/abhishek/stepDefinitions"});
	}

}
