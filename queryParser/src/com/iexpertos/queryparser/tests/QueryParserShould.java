package com.iexpertos.queryparser.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.iexpertos.queryparser.QueryParser;

class QueryParserShould {

	@ParameterizedTest
	@CsvSource({"senior, senior", "junior, junior"})
	void return_a_token_with_the_word_when_a_single_word_is_provided(String query, String expectedValue) {
		
		//Arrange
		QueryParser parser = new QueryParser();
		
		//Act
		String[] result = parser.parse(query);
		
		//Assert
		assertThat(result[0], is(expectedValue));
		assertThat(result.length, is(1));
		
	}	
	
	@ParameterizedTest
	@CsvSource({"TEACHER, teacher", "teacher, teacher"})
	void return_a_token_with_the_word_when_a_single_word_is_provided_case_insensitive(String query, String expectedValue) {
		
		//Arrange
		QueryParser parser = new QueryParser();
		
		//Act
		String[] result = parser.parse(query);
		
		//Assert
		assertThat(result[0], is(expectedValue));
		assertThat(result.length, is(1));
		
	}	
		

}
