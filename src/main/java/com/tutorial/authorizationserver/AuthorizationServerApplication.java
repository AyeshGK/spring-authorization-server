package com.tutorial.authorizationserver;

import com.tutorial.authorizationserver.model.Role;
import com.tutorial.authorizationserver.model.RoleName;
import com.tutorial.authorizationserver.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthorizationServerApplication /*implements CommandLineRunner*/ {
  /*  @Autowired
    RoleRepository roleRepository;*/

    public static void main(String[] args) {
        SpringApplication.run(AuthorizationServerApplication.class, args);
    }

/*    @Override
    public void run(String... args) throws Exception {
        Role roleAdmin = Role.builder().role(RoleName.ROLE_ADMIN).build();
        Role roleUser = Role.builder().role(RoleName.ROLE_USER).build();

        roleRepository.save(roleAdmin);
        roleRepository.save(roleUser);
    }*/
}
