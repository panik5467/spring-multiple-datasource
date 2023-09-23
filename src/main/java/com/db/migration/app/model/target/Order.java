package com.db.migration.app.model.target;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_orders", schema = "orders")
public class Order {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "ProductName")
  private String productName;

  @Column(name = "OrderAmount")
  private Integer orderAmount;

  @Column(name = "user_id")
  private Integer userId;
}
