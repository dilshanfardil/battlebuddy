package lk.avalanche.battlebuddy.service.custom;

import lk.avalanche.battlebuddy.dto.UserDTO;
import lk.avalanche.battlebuddy.entity.User;
import lk.avalanche.battlebuddy.service.SuperService;
import net.bytebuddy.implementation.bind.annotation.Super;
import org.springframework.stereotype.Service;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/26/2019
 * Time: 8:24 PM}
 */

@Service
public interface UserService extends SuperService<UserDTO> {
}
