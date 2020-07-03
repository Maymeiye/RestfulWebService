package site.meiye.RestfulWebService;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import site.meiye.RestfulWebService.io.entity.UserEntity;

@Repository
public interface UserRepository extends CrudRepository<UserEntity, Long> {
    //UserEntity findUserByEmail(String email);
}
