package cn.mystic.service.impl;

import cn.mystic.dao.PersonDao;
import cn.mystic.domain.Person;
import cn.mystic.dto.message.Message;
import cn.mystic.dto.message.MessageInfo;
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
    public Boolean add(Person model) {
        Boolean isSuccess = personDao.add(model);
        return isSuccess;
    }

    /**
     * 删除人员
     * @param id
     * @return
     */
    public Boolean delete(Long id) {
        Boolean isSuccess = personDao.delete(id);
        return isSuccess;
    }

    /**
     * 修改人员
     * @param model
     * @return
     */
    public Boolean update(Person model) {
        Boolean isSuccess = personDao.update(model);
        return isSuccess;
    }

    /**
     * 查询所有
     * @return
     */
    public List<Person> findAll(){
        List<Person> list = personDao.listAll();
        return list;
    }

    /**
     * 查询一条记录
     * @param id
     * @return
     */
    public Person findById(Long id) {
        Person person = personDao.findById(id);
        return person;
    }
}
