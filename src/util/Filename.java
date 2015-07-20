package util;

import java.io.File;

public class Filename {
	private static char extensionSeparator = '.';
	
	private Filename(){}

	/**
	 * returns extension without filename or empty string if no extension
	 * @param fullPath
	 */
	public static String extension(String fullPath) {
		int dot = fullPath.lastIndexOf(extensionSeparator);
		if(dot < 0) {
			return "";
		} else {
			return fullPath.substring(dot + 1);
		}
	}

	/**
	 * returns path + filename without extension
	 * @param fullPath
	 */
	public static String filename(String fullPath) {
		int dot = fullPath.lastIndexOf(extensionSeparator);
		int sep = fullPath.lastIndexOf(File.pathSeparatorChar);
		if(dot < 0) {
			if(sep < 0) {
				return fullPath;
			} else {
				return fullPath.substring(sep + 1);
			}
		} else {
			return fullPath.substring(sep + 1, dot);
		}
	}

	/**
	 * returns path without filename and extension
	 * @param fullPath
	 * @return
	 */
	public static String path(String fullPath) {
		int sep = fullPath.lastIndexOf(File.pathSeparatorChar);
		if(sep < 0) {
			return "";
		} else {
			return fullPath.substring(0, sep);
		}
	}
}