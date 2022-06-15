package com.mongo.example.mongodbexample.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.mongo.example.mongodbexample.models.Student;

public interface StudentRepository extends MongoRepository<Student, Integer>{

}
