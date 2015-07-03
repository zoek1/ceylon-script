package com.redhat.ceylon.scripting.common;

public class Arguments {
	public static String getArgument(String arg, String[] args) {
		Integer len = args.length;
		
		for (Integer index=0;
				index < len;
				index++) {
			if (args[index] == arg) return args[index + 1];
		}
		return null;
	}

}
