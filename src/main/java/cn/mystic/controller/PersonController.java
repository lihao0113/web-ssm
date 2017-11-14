package cn.mystic.controller;

import cn.mystic.domain.Person;
import cn.mystic.dto.message.Message;
import cn.mystic.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
     * @return
     */
    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView findAll() {
        List<Person> list =  personService.findAll();
        ModelAndView mav = new ModelAndView();
        mav.addObject("list", list);
        mav.setViewName("showPerson");
        return mav;
    }

    /**
     * 返回一条数据
     * @param id 人员id
     * @return
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Person findById(@PathVariable Long id) {
        Person person = personService.findById(id);
        return person;
    }

    /**
     * 新增
     * @param model person对象
     * @return
     * @throws Exception
     */
    @Transactional
    @RequestMapping(method = RequestMethod.POST)
    @ResponseBody
    public Boolean add( Person model){
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
    public Boolean delete(@PathVariable Long id){
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
    @ResponseBody
    public Boolean update(Person model){
        return personService.update(model);
    }
}
