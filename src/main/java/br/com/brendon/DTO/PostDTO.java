package br.com.brendon.DTO;

import java.io.Serializable;

public class PostDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer userId;
	private Integer id;
	private String title;
	private String body;
	@Override
	public String toString() {
		return "PostDTO [userId=" + userId + ", id=" + id + ", title=" + title + ", body=" + body + "]";
	}
	public PostDTO(Integer userId, Integer id, String title, String body) {
		super();
		this.userId = userId;
		this.id = id;
		this.title = title;
		this.body = body;
	}
	public PostDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	

}
