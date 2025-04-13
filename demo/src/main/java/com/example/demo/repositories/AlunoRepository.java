package com.example.demo.repositories;

import com.example.demo.models.AlunoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoRepository extends MongoRepository<AlunoModel, String> {
}
