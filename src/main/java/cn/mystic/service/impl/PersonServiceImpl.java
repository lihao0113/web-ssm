package cn.mystic.service.impl;

import cn.mystic.dao.PersonDao;
import cn.mystic.domain.Person;
import cn.mystic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    public List<Person> listAll() {
        return personDao.listAll();
    }

    public Person findById(Long id) {
        return personDao.findById(id);
    }

    public boolean add(Person model) throws Exception {
        return personDao.add(model);
    }

    public boolean delete(Long id) throws Exception {
        return personDao.delete(id);
    }

    public boolean update(Person model) throws Exception {
        return personDao.update(model);
    }
}
