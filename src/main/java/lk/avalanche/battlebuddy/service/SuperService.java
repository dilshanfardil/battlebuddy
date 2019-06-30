package lk.avalanche.battlebuddy.service;

import lk.avalanche.battlebuddy.dto.SuperDTO;

import java.util.List;

/**
 * Created by Avalanche Pvt.Ltd.
 * User: Dilshan.Fardil
 * Date: 6/26/2019
 * Time: 8:22 PM}
 */


public interface SuperService<T extends SuperDTO> {

    List<T> findAll();

    T getrById(int id);

    void update(T t);

    void delete(int id);

    void insert(T t);

}
