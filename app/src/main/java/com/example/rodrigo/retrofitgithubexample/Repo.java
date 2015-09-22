package com.example.rodrigo.retrofitgithubexample;

/**
 * Repo.java class.
 * 
 * @author Rodrigo Cericatto
 * @since 29/09/2014
 */
public class Repo {

	//--------------------------------------------------
	// Attributes
	//--------------------------------------------------
	
	private String id;
	private String name;
	private Owner owner;
	
	//--------------------------------------------------
	// Constructor
	//--------------------------------------------------
	
	public Repo() {}

	public Repo(String id, String name, Owner owner) {
		super();
		this.id = id;
		this.name = name;
		this.owner = owner;
	}
	
	//--------------------------------------------------
	// To String
	//--------------------------------------------------
	
	@Override
	public String toString() {
		return "Repo [id=" + id + ", name=" + name + ", owner=" + owner + "]";
	}
	
	//--------------------------------------------------
	// Getters and Setters
	//--------------------------------------------------
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}

	//--------------------------------------------------
	// Owner
	//--------------------------------------------------

	public static class Owner {
		String login;
		int id;
		String avatar_url;
		String gravatar_id;
		String url;
		String events_url;
	}
}