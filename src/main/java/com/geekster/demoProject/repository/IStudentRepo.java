package com.geekster.demoProject.repository;

import com.geekster.demoProject.student.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStudentRepo extends JpaRepository<Student , Integer> {
}
