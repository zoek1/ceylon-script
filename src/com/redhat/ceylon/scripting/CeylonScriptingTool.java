package com.redhat.ceylon.scripting;

import java.io.File;

import com.redhat.ceylon.scripting.compile.Generator;
import com.redhat.ceylon.scripting.run.Executer;

public class CeylonScriptingTool {
	public static void main(String[] args) {
		System.out.println("Executing script");
		new CeylonScriptingTool().run(args);
	}
	
	public Integer run(String[] args) {
		try {
			Generator producer = new Generator();
			Executer run = new Executer();
		
			File code = producer.intermediteCode(args);
			run.run(code, args);
			return 0;
		} catch (Exception e) {
			return -1;
		}
	}
}