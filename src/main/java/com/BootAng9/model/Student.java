package com.BootAng9.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Integer stdId;
    @NonNull
    private String stdName;
    @NonNull
    private Double stdFees;
    @NonNull
    private String stdCourse;
}
