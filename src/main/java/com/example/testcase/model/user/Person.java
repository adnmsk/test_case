package com.example.testcase.model.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;


import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;



@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Login cannot be empty")
    @Size(min = 5, max = 50, message = "Login must contain from 5 to 50 characters")
    @Column(name = "login")
    private String login;

    @NotEmpty(message = "Password cannot be empty")
    @Column(name = "password")
    @Pattern(regexp = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?!.*\\s).*$", message = "Password must me longer than 6 characters and contain at least 1 number, one symbol, letters in lower and upper case ")
    private String password;

    @Column(name = "role")
    private Role role;

//    @ManyToMany()
//    @JoinTable(name = "product_cart", joinColumns = @JoinColumn(name = "person_id"),inverseJoinColumns = @JoinColumn(name = "product_id"))
//    private List<Product> products;
//
//    @OneToMany(mappedBy = "person")
//    private List<Order> orderList;








}
