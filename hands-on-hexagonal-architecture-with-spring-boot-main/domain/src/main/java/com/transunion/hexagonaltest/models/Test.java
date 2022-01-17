package com.transunion.hexagonaltest.models;



public class Test {
	private Long id;

    private String nameTest;

    private String description;
    
    
    public Test(Long id,String nameTest,String description) {
    	this.id=id;
    	this.nameTest=nameTest;
    	this.description=description;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNameTest() {
		return nameTest;
	}

	public void setNameTest(String nameTest) {
		this.nameTest = nameTest;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
    
    
    
}
