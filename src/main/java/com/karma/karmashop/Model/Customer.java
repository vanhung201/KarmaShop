/*
package com.karma.karmashop.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    @Column(columnDefinition = "nvarchar(50) not null")
    private String name;

    @Column(columnDefinition = "nvarchar(100) not null")
    private String email;

    @Column(length = 20, nullable = false)
    private String password;

    @Column(length = 20)
    private String phone;

    @Temporal(TemporalType.DATE)
    private Date registeredDate;

    @Column(nullable = false)
    private short status;
}
*/
