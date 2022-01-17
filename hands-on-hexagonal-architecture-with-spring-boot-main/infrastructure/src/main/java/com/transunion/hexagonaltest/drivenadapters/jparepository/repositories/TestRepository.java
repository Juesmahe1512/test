package com.transunion.hexagonaltest.drivenadapters.jparepository.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.transunion.hexagonaltest.drivenadapters.jparepository.entities.TestEntity;

import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository  extends JpaRepository<TestEntity, Long> {

}
