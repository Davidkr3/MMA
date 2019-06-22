package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;

import com.iexpertos.queryparser.QueryParser;

class QueryParserShould {

	@Test
	void return_the_token_of_single_word() {
		
		//Arrange
		QueryParser parser = new QueryParser();
		
		//Act
		String[] result = parser.parse("senior");
		
		//Assert
		assertThat(result[0], is("senior"));
		assertThat(result.length, is(1));
		
	}
	
	@Test
	void return_the_token_of_single_word_ignoring_case() {
		
		//Arrange
		QueryParser parser = new QueryParser();
		
		//Act
		String[] result = parser.parse("SENIOR");
		
		//Assert
		assertThat(result[0], is("senior"));
		assertThat(result.length, is(1));
		
	}
	
	

}
