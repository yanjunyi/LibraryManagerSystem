package com.yanjunyi.ssm.service;

import com.sun.scenario.effect.impl.prism.PrImage;
import com.yanjunyi.ssm.dao.LendNotesDao;
import com.yanjunyi.ssm.pojo.LendNotes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class LendNotesServiceImp implements LendNotesService {


    @Resource
    private LendNotesDao lendNotesDao;

    public int addLendNotes(LendNotes lendNotes) {
        return lendNotesDao.addLendNotes(lendNotes);
    }

    public int deleteNotesById(Long ser_num) {
        return lendNotesDao.deleteNotesById(ser_num);
    }
    public List<LendNotes> myLendList(Long reader_id) {
        return lendNotesDao.myLendList(reader_id);
    }
}
