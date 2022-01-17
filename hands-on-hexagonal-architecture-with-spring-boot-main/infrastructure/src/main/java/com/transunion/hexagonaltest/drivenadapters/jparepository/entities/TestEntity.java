package com.transunion.hexagonaltest.drivenadapters.jparepository.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TestEntity {
	
	    @Id
	    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence1")
	    @SequenceGenerator(name = "id_Sequence1", sequenceName = "ID_SEQ1")
	    private Long id;

	    private String nameTest;

	    private String description;    
}
