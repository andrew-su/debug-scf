package application;

import java.util.function.Function;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyApplication {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(MyApplication.class, args);
	}
}
