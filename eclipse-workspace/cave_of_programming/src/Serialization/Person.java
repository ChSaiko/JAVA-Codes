package Serialization;

import java.io.Serializable;

public class Person implements Serializable {

	private static final long serialVersionUID = 244130485366056311L;
	/* the eclipse propose that we should declared the
	 serialVersionUID(244130485366056311L)
	 because when we set some modification in the class how will be serializable in
	 other time*/
	private transient int id;
	// here we like to not serialize the id we use the key word "transient"
	private String name;

	public Person() {
		super();
	}

	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + "]";
	}
}
