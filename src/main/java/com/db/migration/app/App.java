package com.db.migration.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;

import com.db.migration.app.model.target.Order;
import com.db.migration.app.model.source.User;
import com.db.migration.app.repositories.target.OrderRepository;
import com.db.migration.app.repositories.source.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Autowired;


@SpringBootApplication
public class App implements CommandLineRunner {
  public static void main(String[] args) {
    SpringApplication.run(App.class, args);
  }

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private OrderRepository orderRepository;

    @Override
    public void run(String... args) {

	saveUserDataInDB();
	saveOrderDataInDB();
    }


  private void saveUserDataInDB() {

    User user = new User();
    user.setEmail("johndoe@gmail.com");
    user.setFirstName("John");
    user.setLastName("DOe");

    User savedUser = userRepository.save(user);

  }

  private void saveOrderDataInDB() {

    Order order = new Order();
    order.setProductName("Mobile");
    order.setOrderAmount(200);
    order.setUserId(1);

    Order savedOrder = orderRepository.save(order);
  }



}
