package com.profiles.SpringProfiles.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.profiles.SpringProfiles.Entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
