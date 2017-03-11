package com.aamir.api.entity;

import javax.persistence.Entity;

@Entity
public class Comment {

	private String commId;
	private String commText;
	private User user;
	private Movie movie;

	public String getCommId() {
		return commId;
	}

	public void setCommId(String commId) {
		this.commId = commId;
	}

	public String getCommText() {
		return commText;
	}

	public void setCommText(String commText) {
		this.commText = commText;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	@Override
	public String toString() {
		return "Comment [commId=" + commId + ", commText=" + commText + ", user=" + user + ", movie=" + movie + "]";
	}
	
	
}
