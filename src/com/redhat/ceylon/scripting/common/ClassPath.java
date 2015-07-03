package com.redhat.ceylon.scripting.common;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

import com.redhat.ceylon.launcher.CeylonClassLoader;

public class ClassPath {
	public static void setClassPath(String[] args) {
		try {
			String classPath = Arguments.getArgument("classpath", args); // review
					
			System.setProperty("env.class.path", classPath + 
					CeylonClassLoader.getClassPathAsString());
		} catch (FileNotFoundException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}

