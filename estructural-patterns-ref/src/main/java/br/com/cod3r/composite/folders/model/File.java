package br.com.cod3r.composite.folders.model;

public class File implements FileSystemItem {
	private String name;
	
	public File(String name) {
		this.name = name;
	}

	@Override
	public void print(String structure) {
		System.out.println(structure + name);
	}
}
