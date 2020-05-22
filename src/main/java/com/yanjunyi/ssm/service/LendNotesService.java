package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.pojo.LendNotes;

import java.util.List;

public interface LendNotesService {
    public int addLendNotes(LendNotes lendNotes);
    public int deleteNotesById(Long ser_num);
    public List<LendNotes> myLendList(Long reader_id);
}
