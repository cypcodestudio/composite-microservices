package com.cypcode.composite_microservice.domain;

import com.cypcode.composite_microservice.domain.composite.EmployeeComposite;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serializable;
import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Employee")
@IdClass(EmployeeComposite.class)
public class Employee {
    @Id
    @SequenceGenerator(name = "employee_seq_generator", sequenceName = "employee_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "employee_seq_generator")
    private int id;
    @Id
    private String mobile;
    private String email;
    private Date created;
}
