package br.com.brendon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.brendon.DTO.PostDTO;
import br.com.brendon.client.PostClient;

@RestController
@RequestMapping("posts")
public class PostController {

	@Autowired
	private PostClient postClient;
	
	@GetMapping
	public List<PostDTO> getAllPosts() {
		return postClient.getAllPosts();
	}
}
