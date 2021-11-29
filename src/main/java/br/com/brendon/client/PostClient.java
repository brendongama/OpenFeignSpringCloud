
package br.com.brendon.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.brendon.DTO.PostDTO;

@FeignClient(value = "post", url = "${dto.feign.url}")
public interface PostClient {
	@GetMapping(value = "/posts")
	List<PostDTO> getAllPosts();
}
