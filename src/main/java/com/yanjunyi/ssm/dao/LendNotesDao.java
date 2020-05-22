package com.yanjunyi.ssm.dao;

import com.yanjunyi.ssm.pojo.LendNotes;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LendNotesDao {
    public int addLendNotes(LendNotes lendNotes);
    public int deleteNotesById(Long ser_num);
    public List<LendNotes> myLendList(Long reader_id);
}
