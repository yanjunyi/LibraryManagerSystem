package com.yanjunyi.ssm.controller;

import com.yanjunyi.ssm.pojo.ReaderCard;
import com.yanjunyi.ssm.pojo.ReaderInfo;
import com.yanjunyi.ssm.service.ReaderCardService;
import com.yanjunyi.ssm.service.ReaderInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
public class ReaderController {
    @Resource
    private ReaderInfoService readerInfoService;
    @Resource
    private ReaderCardService readerCardService;

    @RequestMapping("/reader_info")
    public ModelAndView toReaderInfo(HttpServletRequest request) {
        ReaderCard readerCard  =(ReaderCard) request.getSession().getAttribute("readercard");
        ReaderInfo readerInfo = readerInfoService.getReaderInfoById(readerCard.getReaderId());
        ModelAndView modelAndView = new ModelAndView("reader_info");
        modelAndView.addObject("readerinfo", readerInfo);
        return modelAndView;
    }
    @RequestMapping("/reader_info_edit")
    public ModelAndView editReaderInfo(HttpServletRequest request) {
        ReaderCard readerCard  =(ReaderCard) request.getSession().getAttribute("readercard");
        ReaderInfo readerInfo = readerInfoService.getReaderInfoById(readerCard.getReaderId());
        ModelAndView modelAndView = new ModelAndView("reader_info_edit");
        modelAndView.addObject("readerinfo", readerInfo);
        return modelAndView;
    }
    @RequestMapping("/reader_edit_do")
    public String updateReaderInfo(ReaderInfo readerInfo,HttpServletRequest request) {
        ReaderCard readerCard  =(ReaderCard) request.getSession().getAttribute("readercard");
        ReaderInfo readerInfoOld = readerInfoService.getReaderInfoById(readerCard.getReaderId());
        if (readerInfoService.updateReaderInfo(readerInfo)&&readerInfoService.updateReaderCard(readerInfo)){
            ReaderCard readerCardNew = readerCardService.findReaderById(readerCard.getReaderId());
            request.getSession().setAttribute("readercard", readerCardNew);
            return "redirect:/reader_info";
        }
        return null;
    }

    @RequestMapping("/reader_repasswd")
    public ModelAndView reReaderPasswd() {
        return new ModelAndView("reader_repasswd");
    }


    @RequestMapping("/reader_repasswd_do")
    public String reReaderPasswdDo(HttpServletRequest request, String oldPasswd, String newPasswd, String reNewPasswd) {
        ReaderCard readerCard = (ReaderCard) request.getSession().getAttribute("readercard");
        long id = readerCard.getReaderId();

        String password = readerCardService.getReaderPassword(id);
        if (password.equals(oldPasswd)) {
            if(readerCardService.resetPassword(id,newPasswd)){
                System.out.println("密码修改成功");
            }
            return "redirect:/reader_main";
        }
        return null;
    }
}
