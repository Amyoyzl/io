package com.csust.io;

import java.io.File;
//import java.io.IOException;
//import java.util.Date;

public class FileDemo {

	public static void main(String[] args) {

		File src = new File("E:/src");
		System.out.printf("文件大小：%,d\n",FileUtil.length(src));
		System.out.printf("文件数目：%,d\n",FileUtil.fileSize(src));
		System.out.printf("文件夹数目：%,d\n",FileUtil.folderSize(src));
		
		// 文件名字构成的数组
//		String[] names = src.list();
//		for (String name : names)
//			System.out.println(name);
		
//		File[] files = src.listFiles();
//		for (File f : files) {
//			if (!f.isHidden())
//				System.out.println(f);
//		}

		// 绝对路径
		// File f1 = new File("E:/abc.txt");
		// 相对路径
		// File f1 = new File("abc.txt");
		// System.out.println(f1.exists());
		// if (!f1.exists()) {
		// try {
		// f1.createNewFile();
		// System.out.println("创建成功!");
		// } catch (IOException e) {
		// // e.printStackTrace();
		// System.out.println("创建失败！");
		// }
		// }
		//
		// File f2 = new File("img/abc");
		// if (!f2.exists()) {
		// f2.mkdirs(); // 嵌套结构
		// // f2.mkdir(); // 创建单一的目录
		// }
		//
		// File path = new File("com/mi");
		// File file = new File(path,"index.html");
		//
		// System.out.println(path.isDirectory());
		// System.out.println(file.isFile());
		// System.out.println(file.isHidden());
		// System.out.println(file.getParentFile());
		// System.out.println(file.length());
		// System.out.println(path.length());
		// System.out.println(new Date(file.lastModified()).toLocaleString());

		// System.out.println(file.getAbsolutePath());
		//
		// if(!path.exists()) {
		// path.mkdirs();
		// }
		// if(!file.exists()) {
		// try {
		// file.createNewFile();
		// System.out.printf("%s创建成功！\n",file.getName());
		// } catch (IOException e) {
		// System.out.printf("%s创建失败！\n",file.getName());
		// }
		// }

	}
}
