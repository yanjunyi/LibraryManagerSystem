package com.yanjunyi.ssm.controller;

import com.yanjunyi.ssm.pojo.ReaderCard;
import com.yanjunyi.ssm.service.LendNotesService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
@Controller
public class LendController {
    @Resource
    private LendNotesService lendNotesService;

    @RequestMapping("/mylend")
    public ModelAndView myLend(HttpServletRequest request) {
        ReaderCard readerCard = (ReaderCard) request.getSession().getAttribute("readercard");
        ModelAndView modelAndView = new ModelAndView("reader_lend_list");
        modelAndView.addObject("list", lendNotesService.myLendList(readerCard.getReaderId()));
        return modelAndView;
    }
}
