package cn.xm.yss;

import java.io.File;

/**
 * 文件操作工具类
 * 
 * @author yesunsong
 *
 */
public class FileUtils {
	private static FileUtils utils;

	private FileUtils() {
	}

	public static FileUtils getInstance() {
		if (utils == null) {
			utils = new FileUtils();
		}
		return utils;
	}

	/**
	 * 是否包含子目录
	 * 
	 * @param file
	 * @return
	 */
	public boolean hasDirectory(File file) {
		boolean hasDirectory = false;
		if (!file.exists()) {
			return hasDirectory;
		}

		if (!file.isDirectory()) {
			return hasDirectory;
		}
		File[] files = file.listFiles();
		for (int i = 0; i < files.length; i++) {
			if (files[i].isDirectory()) {
				hasDirectory = true;
				break;
			}
		}
		return hasDirectory;
	}
}
