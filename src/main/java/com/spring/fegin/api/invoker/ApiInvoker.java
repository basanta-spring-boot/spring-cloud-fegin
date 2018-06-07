package com.spring.fegin.api.invoker;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.spring.fegin.api.dto.Response;

@FeignClient(url = "https://jsonplaceholder.typicode.com", name = "test-fegin-client")
public interface ApiInvoker {

	@GetMapping(value = "/posts")
	public List<Response> getUsers();

	@GetMapping(value = "/posts/{id}")
	public Response getUser(@PathVariable("id") int id);

}
