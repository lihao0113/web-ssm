package cn.mystic.service.impl;

import cn.mystic.dao.PersonDao;
import cn.mystic.domain.Person;
import cn.mystic.dto.message.Message;
import cn.mystic.dto.message.MessageType;
import cn.mystic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonDao personDao;

    /**
     * 添加人员
     * @param model
     * @return
     */
    public ResponseEntity<Message> add(Person model) {
        return null;
    }

    /**
     * 删除人员
     * @param id
     * @return
     */
    public ResponseEntity<Message> delete(Long id) {
        return null;
    }

    /**
     * 修改人员
     * @param model
     * @return
     */
    public ResponseEntity<Message> update(Person model) {
        return null;
    }

    /**
     * 查询所有
     * @return
     */
    public ResponseEntity<Message> findAll(){
        List<Person> list = personDao.listAll();
        return new ResponseEntity<Message>(new Message(MessageType.MSG_TYPE_SUCCESS, list), HttpStatus.OK);
    }

    /**
     * 查询一条记录
     * @param id
     * @return
     */
    public ResponseEntity<Message> findById(Long id) {
        return null;
    }
}
