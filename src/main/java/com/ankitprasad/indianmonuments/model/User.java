package com.ankitprasad.indianmonuments.model;


	
	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import org.hibernate.validator.constraints.NotEmpty;
	 
	@Entity
	@Table(name = "USER")
	public class User {
	    
		private int id;
		@NotEmpty
	    private String username;
	    private String password;
	    private String email;
	    private String firstName;
	    private String lastName;
	    private String role;
	 
	    @Id
	    @GeneratedValue
	    @Column(name = "USERID")
	    public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the username
		 */
	    @Column(name = "USERNAME")
		public String getUsername() {
			return username;
		}

		/**
		 * @param username the username to set
		 */
		public void setUsername(String username) {
			this.username = username;
		}

		/**
		 * @return the password
		 */
	    @Column(name = "PASSWD")
		public String getPassword() {
			return password;
		}

		/**
		 * @param password the password to set
		 */
		public void setPassword(String password) {
			this.password = password;
		}

		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}

		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the role
		 */
		public String getRole() {
			return role;
		}

		/**
		 * @param role the role to set
		 */
		public void setRole(String role) {
			this.role = role;
		}

	 
	 
	}

