package org.example.configuration;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.transunion.hexagonaltest.usecases.TestUseCase;
import com.transunion.hexagonaltest.gateways.TestRepositoryGateway;
import com.transunion.hexagonaltest.drivenadapters.jparepository.adapters.TestRepositoryAdapter;
import org.springframework.data.jpa.repository.config.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import com.transunion.hexagonaltest.drivenadapters.jparepository.repositories.TestRepository;
import com.transunion.hexagonaltest.drivenadapters.jparepository.entities.TestEntity;


@Configuration
@EntityScan(basePackages = "com.transunion.hexagonaltest")
@ComponentScan(basePackages = "com.transunion.hexagonaltest.*")
@EnableJpaRepositories(basePackages = "com.transunion.hexagonaltest")
public class BookConfig {

    
    
    @Bean
    public TestUseCase testUseCase(TestRepositoryGateway testRepositoryGateway){
        return new TestUseCase(testRepositoryGateway);
    }
    
    
    
    
    
    
}
