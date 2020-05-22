package com.yanjunyi.ssm.controller;

import com.yanjunyi.ssm.pojo.Admin;
import com.yanjunyi.ssm.pojo.ReaderCard;
import com.yanjunyi.ssm.service.ReaderCardService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {
    @Resource
    private ReaderCardService readerCardService;


    @RequestMapping("/login")
    public String login(ReaderCard readerCard, HttpServletRequest request){
        System.out.println(readerCard.toString());
        ReaderCard o=readerCardService.getMatch(readerCard);
//        if((readerCard.getName())=="admin"&&"admin".equals(readerCard.getPassword())){
//            return "reader_main";
//        }
//        return "error";
        if (o!= null){
            request.getSession().setAttribute("readercard", o);
            return "reader_main";
        }
        return "error";
    }
    @RequestMapping("/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }
    @RequestMapping("/reader_main")
    public ModelAndView toReaderMain(HttpServletResponse response) {
        return new ModelAndView("reader_main");
    }
}
