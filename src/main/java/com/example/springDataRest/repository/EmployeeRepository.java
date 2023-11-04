package com.example.springDataRest.repository;

import com.example.springDataRest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RepositoryRestResource(path = "members")
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByFirstName(@Param("firstName") String firstName);

}
