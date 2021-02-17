package br.com.cod3r.composite.folders;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.cod3r.composite.folders.model.FileSystemItem;
import br.com.cod3r.composite.folders.model.Folder;

public class Client {

	public static FileSystemItem createCompositeFromFile(File file) {
		if(!file.isDirectory()) return new br.com.cod3r.composite.folders.model.File(file.getName());
		List<FileSystemItem> childs = new ArrayList<>();
		File[] files = file.listFiles();
		for(File javaFile: files) {
			childs.add(createCompositeFromFile(javaFile));
		}
		return new Folder(file.getName(), childs);
	}
	
	public static void main(String[] args) {
		FileSystemItem file1 = new br.com.cod3r.composite.folders.model.File("File1.txt");
		FileSystemItem file2 = new br.com.cod3r.composite.folders.model.File("File2.txt");
		FileSystemItem file3 = new br.com.cod3r.composite.folders.model.File("File3.txt");
		FileSystemItem file4 = new br.com.cod3r.composite.folders.model.File("File4.txt");
		FileSystemItem sf1 = new Folder("sf1", Arrays.asList(file1));
		FileSystemItem sf2 = new Folder("sf2", Arrays.asList(file2, sf1));
		FileSystemItem folder = new Folder("folder", Arrays.asList(sf2, file3, file4));
		
		folder.print("");
		
		System.out.println("------------");
		
		String dir = System.getProperty("user.dir");
		FileSystemItem fromDisk = createCompositeFromFile(new File(dir + File.separator + "src"));
		fromDisk.print(">");
	}
}
