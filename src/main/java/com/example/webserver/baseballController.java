package com.example.webserver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

@Controller

public class baseballController {
    @Autowired
    @Qualifier("baseballServiceImpl")
    private baseballService service;

    public baseballController() {
        System.out.println("baseballController 객체 생성");
    }

    @RequestMapping("/")
    public String home() {
        return "home";
    }
    @RequestMapping("/count")
    @ResponseBody
    public String count(Map<String, String> param, Map<String, Object> model) {
        return  "count=" + service.count();
    }

    @RequestMapping("/list")
    public String list(Model model){
        model.addAttribute("base", service.select());
        return "list.html";
    }


    /*list(Map<String, String> param, Map<String, Object> model) {
        List<baseballDto> db = service.select();
        for(int i = 0; i < db.size(); i++) {
            model.put("idx" + i, db.get(i).getIdx());
            model.put("team" + i, db.get(i).getTeam());
            model.put("image" + i, db.get(i).getImage());
        }
        return  "list";
    }*/

    @RequestMapping("/read")
    public String read(Map<String, String> param, Map<String, Object> model) {
        int idx = Integer.parseInt(param.get("idx"));


        baseballDto movie = service.read(idx);

        model.put("idx", movie.getIdx());
        model.put("team", movie.getTeam());
        model.put("image", movie.getImage());
        return  "read";
    }

}
