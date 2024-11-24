package com.chagas.anny.challenge1;

import com.chagas.anny.challenge1.entities.Order;
import com.chagas.anny.challenge1.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Challenge1Application implements CommandLineRunner {

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Challenge1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner scanner = new Scanner(System.in);

		int code = scanner.nextInt();
		double basic = scanner.nextDouble();
		double discount = scanner.nextDouble();

		Order order = new Order(code, basic, discount);

		System.out.printf("Pedido código %d", order.getCode());
		System.out.println();
		System.out.printf("Valor total: R$ %.2f", orderService.total(order));
	}
}
