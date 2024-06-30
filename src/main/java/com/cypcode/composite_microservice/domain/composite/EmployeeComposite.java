package com.cypcode.composite_microservice.domain.composite;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
public class EmployeeComposite implements Serializable {
    private int id;
    private String mobile;
}
