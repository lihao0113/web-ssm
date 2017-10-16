package cn.mystic.service;

import cn.mystic.domain.Person;
import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
public interface PersonService {
    public abstract List<Person> listAll();
    public abstract Person findById(Long id);

    public abstract boolean add(Person model) throws Exception;
    public abstract boolean delete(Long id) throws Exception;
    public abstract boolean update(Person model) throws Exception;
}
