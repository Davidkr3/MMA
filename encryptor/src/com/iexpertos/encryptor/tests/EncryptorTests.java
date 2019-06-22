package com.iexpertos.encryptor.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.security.InvalidParameterException;

import org.junit.jupiter.api.Test;

import com.iexpertos.encryptor.Encryptor;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

class EncryptorTests {

	@Test
	void test() {
		assertThat(true, is(true));
	}
    
    @Test
    void cryptoSentence_test() {
        Encryptor encryptor = new Encryptor();
        
        String result = encryptor.cryptSentence("foo bar");
        
        assertThat(result, is("hqq\"dct"));
    }
    
    @Test
    void cryptoWord_test() {
        Encryptor encryptor = new Encryptor();
        
        String result = encryptor.cryptWord("foo");
        
        assertThat(result, is("hqq"));
    }
    
    @Test
    void cryptoWord_throw_error_when_word_have_space() {
        Encryptor encryptor = new Encryptor();
        
        assertThrows(InvalidParameterException.class, () -> {
            encryptor.cryptWord("foo bar");
        });
    }

}

