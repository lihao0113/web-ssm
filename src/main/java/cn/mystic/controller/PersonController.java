package cn.mystic.controller;

import cn.mystic.model.Person;
import cn.mystic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * Created by lihao on 2017/10/16.
 */
@Controller
@RequestMapping(value = "/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/findAll", method = RequestMethod.GET)
    public List<Person> listAll() {
        return personService.listAll();
    }

    @RequestMapping(method = RequestMethod.GET)
    public Person findById(Long id) {
        return personService.findById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public boolean add(Person model) throws Exception {
        return personService.add(model);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public boolean delete(Long id) throws Exception {
        return personService.delete(id);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public boolean update(Person model) throws Exception {
        return personService.update(model);
    }
}
