package com.redhat.ceylon.scripting.compile;

import java.io.File;

import com.redhat.ceylon.scripting.common.Arguments;
import com.redhat.ceylon.scripting.common.ClassPath;

public class Compile {

	public File compile(String[] args) throws InvalidScriptFile {
		ClassPath.setClassPath(args);
			
		// Set ModuleofFile
		String script = Arguments.getArgument("script", args);
		File scriptFile = new File(script);
		if (scriptFile.exists() && scriptFile.canRead()) {
			setCWD(scriptFile.getAbsolutePath());
			//TODO: parsing
			//TODO: compiler.compile(args);
			return new File("Future");
		} else {
			throw new InvalidScriptFile("The file doesn't exists or is not accesible");
		}
	}

	private void setCWD(String absolutePath) {
		// TODO Auto-generated method stub
		
	}
}
