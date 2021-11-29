package com.retodos;

import com.retodos.model.User;
import com.retodos.repository.crud.UserCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RetodosApplication implements CommandLineRunner {
    @Autowired //Crear una implementacion de la interfaz crud repository
    private UserCrudRepository userRepo;
    
	public static void main(String[] args) {
		SpringApplication.run(RetodosApplication.class, args);
	}
        
    @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();
        /*//////
        userRepo.saveAll(List.of(
                new User (1,"1018460767","JUANA LA LOCA","CR 19 # 19 - 45","311211211","juanalaloca@correo.co","Demo123","ZONA 1","ADM"),
                new User (2,"1016077","ISABEL I","CR 19 # 19 - 45","311211211","isabel@correo.co","Demo123","ZONA 1","ADM"),
                new User (3,"10160767","J FELIPE","CR 19 # 19 - 45","311211211","felipe@correo.co","Demo123","ZONA 1","ADM"),
                new User (4,"18460767","FERNANDO DE ARAGON","CR 19 # 19 - 45","311211211","fernando@correo.co","Demo123","ZONA 1","ADM")
                ));
    
        
        Optional<User> usuario = userRepo.findByEmail("juanalaloca@correo.co");
        
        if(usuario.isPresent()){
            System.out.println("Datos del usuario" + usuario.get());  
        }
        
        Optional<User> usuarioDos = userRepo.findByEmailAndPassword("juanalaloca@correo.co","Demo123");
        
        if(usuarioDos.isPresent()){
            System.out.println("Datos del usuario" + usuarioDos.get());  
        }
        /////*/
    }
    
}
