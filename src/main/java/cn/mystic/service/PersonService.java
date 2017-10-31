package cn.mystic.service;

import cn.mystic.domain.Person;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
public interface PersonService {

    public abstract Boolean add(Person model);
    public abstract Boolean delete(Long id);
    public abstract Boolean update(Person model);

    public abstract List<Person> findAll();
    public abstract Person findById(Long id);
}
