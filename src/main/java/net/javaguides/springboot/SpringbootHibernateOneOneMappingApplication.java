package net.javaguides.springboot;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import net.javaguides.springboot.entity.gender;
import net.javaguides.springboot.entity.user;
import net.javaguides.springboot.entity.userprofile;
import net.javaguides.springboot.repository.userprofilerepository;
import net.javaguides.springboot.repository.userrepository;

@SpringBootApplication
public class SpringbootHibernateOneOneMappingApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootHibernateOneOneMappingApplication.class, args);
	}
	
    @Autowired
    private userprofilerepository userprofilerepository;
	@Override
	public void run(String... args) throws Exception {
	
		// user object
		user user = new user();
		user.setName("Sonalika");
		user.setEmail("sonalik@gmail.com");
		
		userprofile userprofile =new userprofile();
		userprofile.setAdress("Odisha");
		userprofile.setBirthofDate(LocalDate.of(2002, 02, 14));
		userprofile.setGender(gender.FEMALE);
		userprofile.setPhonenumber("9861060676");
		
		
		user.setUserprofile(userprofile);
		 userprofile.setUser(user);
		
		
		
		
		}

}
