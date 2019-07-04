package lk.avalanche.battlebuddy.repository;

import lk.avalanche.battlebuddy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/23/2019
 * Time: 11:00 PM}
 */


public interface UserRepository extends JpaRepository<User, Integer> {
    public User findByUsername(String username);
}
