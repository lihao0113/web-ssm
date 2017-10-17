package cn.mystic.service;

import cn.mystic.domain.Person;
import cn.mystic.dto.message.Message;
import org.springframework.http.ResponseEntity;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
public interface PersonService {

    public abstract ResponseEntity<Message> add(Person model);
    public abstract ResponseEntity<Message> delete(Long id);
    public abstract ResponseEntity<Message> update(Person model);

    public abstract ResponseEntity<Message> findAll();
    public abstract ResponseEntity<Message> findById(Long id);
}
