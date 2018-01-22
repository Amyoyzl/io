package com.csust.io;

import java.io.File;
import java.io.FileFilter;

/**
 * 文件操作的工具类
 * 
 * @author Amy_oyzl
 *
 */
public class FileUtil {

	/**
	 * 文件过滤器
	 * 
	 * @author Amy_oyzl
	 *
	 */
	static class JavaFileFilter implements FileFilter {

		@Override
		public boolean accept(File pathname) {
			return pathname.isDirectory() 
					|| (pathname.isFile() && pathname.getName().endsWith(".java"));
		}

	}

	/**
	 * (递归)统计文件夹的大小
	 * 
	 * @param path
	 *            文件夹
	 * @return 文件夹的大小，单位是字节
	 */
	public static long length(File path) {
		if (path.isFile())
			return path.length();
		long fileLength = 0;
		// 遍历内部的文件
		File[] files = path.listFiles();
		for (File file : files) {
			if (file.isFile()) { // 文件
				fileLength += file.length();
			} else { // 文件夹
				fileLength += length(file);
			}
		}
		return fileLength;
	}

	/**
	 * 获取文件的数量
	 * 
	 * @param path
	 * @return
	 */
	public static long fileSize(File path) {
		int size = 0;
		File[] files = path.listFiles(new JavaFileFilter());
		for (File file : files) {
			if (file.isFile())
				size++;
			else
				size += fileSize(file);
		}
		return size;
	}

	/**
	 * 获取文件夹的数量
	 * 
	 * @param path
	 * @return
	 */
	public static long folderSize(File path) {
		int size = 0;
		File[] files = path.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				size++;
				size += folderSize(file);
			}
		}
		return size;
	}

}
