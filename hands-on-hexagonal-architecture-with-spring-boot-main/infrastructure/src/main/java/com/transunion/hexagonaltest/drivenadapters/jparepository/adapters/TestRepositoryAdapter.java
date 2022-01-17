package com.transunion.hexagonaltest.drivenadapters.jparepository.adapters;

import org.springframework.beans.factory.annotation.Autowired;

import com.transunion.hexagonaltest.drivenadapters.jparepository.repositories.TestRepository;
import com.transunion.hexagonaltest.gateways.TestRepositoryGateway;
import com.transunion.hexagonaltest.models.Test;
import com.transunion.hexagonaltest.drivenadapters.jparepository.entities.TestEntity;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;

@Service
public class TestRepositoryAdapter implements TestRepositoryGateway {

    @Autowired
    private TestRepository testRepository;
    
    public TestRepositoryAdapter(TestRepository testRepository) {
    	this.testRepository=testRepository;
    }
    
    
    
    
    @Override
    public Test saveTest(Test test) {
    	TestEntity testEntity=this.testRepository.save(new TestEntity(test.getId(),test.getNameTest(),test.getDescription()));
    	return new Test(testEntity.getId(),testEntity.getNameTest(),testEntity.getDescription());
    }
    
    @Override
    public List<Test> findAllTest() {
    	return this.testRepository.findAll()
    			.stream()
    			.map(testEntity->new Test(testEntity.getId(),testEntity.getNameTest(),testEntity.getDescription()))
    			.collect(Collectors.toList());
    }
    
    
    
    
    

}
