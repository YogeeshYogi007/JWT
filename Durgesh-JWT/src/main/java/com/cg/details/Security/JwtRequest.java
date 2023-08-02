package com.cg.details.Security;

import com.cg.details.Security.JwtResponse.Builder;

public class JwtRequest {
	
	private String email;
	private String password;
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public JwtRequest(String email, String password) {
		this.email = email;
		this.password = password;
	}
	public JwtRequest() {
	}
	@Override
	public String toString() {
		return "JwtRequest [email=" + email + ", password=" + password + "]";
	}
	
	public static Builder builder() {
		return new Builder();
	}
	
	public static class Builder {
		private String email;
		private String password;
		
		public Builder() {
			
		}
		
		public Builder email(String email) {
			this.email=email;
			return this;
		}
		public Builder password(String password) {
			this.password=password;
			return this;
		}
		
		public JwtRequest build() {
			return new JwtRequest(email,password);
		}
	}
	
	
	
	

}
