package com.spring.fegin.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.fegin.api.dto.Response;
import com.spring.fegin.api.invoker.ApiInvoker;

@SpringBootApplication
@EnableFeignClients
@RestController
@RequestMapping("/Fegin-client/invoke")
public class SpringFeginClientApplication {
	@Autowired
	private ApiInvoker invoker;

	@GetMapping("/getAllPost")
	public List<Response> findAllPost() {
		return invoker.getUsers();

	}

	@GetMapping("/getPost/{id}")
	public Response findPostById(@PathVariable int id) {
		return invoker.getUser(id);

	}

	public static void main(String[] args) {
		SpringApplication.run(SpringFeginClientApplication.class, args);
	}
}
