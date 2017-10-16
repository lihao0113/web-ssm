package cn.mystic.dao;

import cn.mystic.domain.Person;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
@Repository
public interface PersonDao {
    public abstract List<Person> listAll();
    public abstract Person findById(Long id);

    public abstract boolean add(Person model);
    public abstract boolean delete(Long id);
    public abstract boolean update(Person model);
}
