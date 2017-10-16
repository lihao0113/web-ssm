package cn.mystic.controller;

import cn.mystic.domain.Person;
import cn.mystic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    /**
     * 返回所有person
     * @return List<Person>
     */
    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Person> listAll() {
        return personService.listAll();
    }

    /**
     * 返回一条数据
     * @param id 人员id
     * @return Person
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person findById(@PathVariable Long id) {
        return personService.findById(id);
    }

    /**
     * 新增
     * @param model person对象
     * @return
     * @throws Exception
     */
    @Transactional
    @RequestMapping(method = RequestMethod.POST)
    public boolean add(@RequestBody Person model) throws Exception {
        return personService.add(model);
    }

    /**
     * 删除
     * @param id
     * @return
     * @throws Exception
     */
    @Transactional
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public boolean delete(@PathVariable Long id) throws Exception {
        return personService.delete(id);
    }

    /**
     * 修改
     * @param model
     * @return
     * @throws Exception
     */
    @Transactional
    @RequestMapping(method = RequestMethod.PUT)
    public boolean update(@RequestBody Person model) throws Exception {
        return personService.update(model);
    }
}
