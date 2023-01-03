package org.smartblackbox.launcher;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

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
	
	public static boolean fileExists(String fileName) {
		File file = new File(fileName);
		return file.exists();
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

	private static String getPlatform() {
		if (isWindows())
			return "Windows";
		else if (isMac())
			return "MacOS";
		else if (isLinux())
			return "Linux";
		else 
			return "Unknown";
	}
	
	public static void main(String[] args) {
		System.out.println("Quantum Field Simulator Launcher");

		try {
			String platform = getPlatform();
			System.out.println("OS detected: " + platform);
			String appFile = "QuantumFieldSimulator-" + platform + ".jar";
			String cmd = "java -jar " + (isMac()? "-XstartOnFirstThread " : "") + appFile;
			
			if (fileExists(appFile)) {
				System.out.println("Run command: " + cmd);
				runCommand(cmd);
			}
			else {
				JFrame frame = new JFrame();
				JOptionPane.showMessageDialog(frame, "File '" + appFile + "' not exists!",
						"Dialog", JOptionPane.ERROR_MESSAGE);
				frame.dispose();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
