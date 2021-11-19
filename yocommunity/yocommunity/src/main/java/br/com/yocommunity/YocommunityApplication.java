package br.com.yocommunity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class YocommunityApplication {

	public static void main(String[] args) {
		SpringApplication.run(YocommunityApplication.class, args);
	}

}
