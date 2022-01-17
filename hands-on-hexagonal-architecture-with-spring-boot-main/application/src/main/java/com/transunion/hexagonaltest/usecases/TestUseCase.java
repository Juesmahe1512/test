package com.transunion.hexagonaltest.usecases;

import com.transunion.hexagonaltest.gateways.TestRepositoryGateway;
import com.transunion.hexagonaltest.models.Test;

public class TestUseCase {
	
	private  TestRepositoryGateway testRepositoryGateway;

    public TestUseCase(TestRepositoryGateway testRepositoryGateway) {
        this.testRepositoryGateway = testRepositoryGateway;
    }
    
    public Test addTest(Test test){
    	return this.testRepositoryGateway.saveTest(test);
    }
    
    

}
