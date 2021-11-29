package com.retodos.repository.crud;

import com.retodos.model.User;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

/**
 *
 * @author Andrea Lozano Cataño
 */

public interface UserCrudRepository extends MongoRepository<User, Integer> {
    @Query("{email:?0}")
    Optional<User> findByEmail(String email);
    @Query("{email:?0,password:?1}")
    Optional<User> findByEmailAndPassword(String email,String password);
}
