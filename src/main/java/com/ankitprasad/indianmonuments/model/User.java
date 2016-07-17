package com.ankitprasad.indianmonuments.model;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import org.hibernate.validator.constraints.NotEmpty;
	 
	@Entity
	@Table(name = "USERS")
	public class Users {
	    
		private int id;
		@NotEmpty
	    private String username;
	    private String password;
	    private String email;
	    private String firstName;
	    private String lastName;
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "USER_ID")
	    public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
			this.id = id;
		}

	 
	    // other getters and setters are hidden for brevity
	 
	}

