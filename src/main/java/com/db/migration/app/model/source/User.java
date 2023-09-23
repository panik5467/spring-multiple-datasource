package com.db.migration.app.model.source;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_users", schema = "users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private Integer id;

  @Column(name = "FirstName")
  private String firstName;

  @Column(name = "LastName")
  private String lastName;

  @Column(name = "Email")
  private String email;

  @Column(name = "Bool")
  private Boolean bool;

  public User () {
    this.bool = true;
  }
}
