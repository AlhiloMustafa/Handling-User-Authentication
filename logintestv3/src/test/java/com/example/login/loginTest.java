
package com.example.login;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.annotation.Rollback;

import com.example.login.entity.User;
import com.example.login.repository.UserRepository;
import com.example.login.service.UserServiceRepo;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
public class loginTest {
	


	@Test
	public void testlogin() {
		
		UserServiceRepo us=new UserServiceRepo();
		
		boolean result= us.validUser("tulipguzal@gmail.com", "afdsfa");
		
		
		assertFalse(result);
	}
	





	
	
	
	
	
	
	
	

}
