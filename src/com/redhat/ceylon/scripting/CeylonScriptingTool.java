package com.redhat.ceylon.scripting;

import java.io.File;

import com.redhat.ceylon.scripting.compile.Generator;
import com.redhat.ceylon.scripting.run.Executer;

class CeylonScriptingTool {
	public static void main(String[] args) {
		System.out.println("Executing script");
		try {
			
			Generator producer = new Generator();
			Executer run = new Executer();
			
			File code = producer.intermediteCode(args);
			run.run(code, args);
		} catch (Exception e) {
			
		}
	}
}