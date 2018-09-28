package com.ddfdesign.secutiry.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;

@Entity
@Table(name="users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Usuario{
    @Id
    @GeneratedValue
    @Column(name ="id")
    private Long id;

    @Column(name ="username")
    private String username;

    @Column(name ="passworddddd")
    private String password;

}
