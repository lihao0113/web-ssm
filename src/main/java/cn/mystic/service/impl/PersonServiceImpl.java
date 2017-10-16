package cn.mystic.service.impl;

import cn.mystic.model.Person;
import cn.mystic.service.PersonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
@Service
public class PersonServiceImpl implements PersonService{
    public List<Person> listAll() {
        return null;
    }

    public Person findById(Integer userid) {
        return null;
    }

    public boolean add(Person model) throws Exception {
        return false;
    }

    public boolean delete(Integer userid) throws Exception {
        return false;
    }

    public boolean update(Person model) throws Exception {
        return false;
    }
}
