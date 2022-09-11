package com.BootAng9.repository;

import com.BootAng9.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>
{
}
