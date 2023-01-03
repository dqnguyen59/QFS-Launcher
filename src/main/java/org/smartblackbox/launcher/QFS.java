package org.smartblackbox.launcher;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QFS {

	private static String osName;

	public static String getOsName() {
		if (osName == null) osName = System.getProperty("os.name");
		return osName;
	}
	
	public static boolean isWindows() {
		return getOsName().startsWith("Windows");
	}
	
	public static boolean isMac() {
		return getOsName().startsWith("Mac");
	}
	
	public static boolean isLinux() {
		return getOsName().startsWith("Linux");
	}
	
	public static void main(String[] args) {
		System.out.println("Quantum Field Simulator Launcher");

		try {
			runCommand("java -jar -XstartOnFirstThread QuantumFieldSimulator.jar");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	public static String runCommand(String command, String suffix) throws Exception {
		try {
			Process p = Runtime.getRuntime().exec(command);

			BufferedReader stdInput = new BufferedReader(new 
					InputStreamReader(p.getInputStream()));

			BufferedReader stdError = new BufferedReader(new 
					InputStreamReader(p.getErrorStream()));

			String s = null;
			String sOutput = "";
			String sError = null;

			while ((s = stdError.readLine()) != null) {
				sError += s;
			}

			if (sError != null) throw new Exception(sError);

			while ((s = stdInput.readLine()) != null) {
				sOutput += s + suffix;
			}

			return sOutput;
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static String runCommand(String command) throws Exception {
		return runCommand(command, "\n");
	}

}
