package com.transunion.hexagonaltest.gateways;

import com.transunion.hexagonaltest.models.Test;
import java.util.List;

public interface TestRepositoryGateway {
      Test saveTest(Test test);
      List<Test> findAllTest();
}
