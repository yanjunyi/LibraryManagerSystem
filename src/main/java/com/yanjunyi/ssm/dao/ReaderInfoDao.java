package com.yanjunyi.ssm.dao;

import com.yanjunyi.ssm.pojo.ReaderInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ReaderInfoDao {
    public int addReaderInfo(ReaderInfo readerInfo);
    public int deleteReaderInfoById(Long reader_id);
    public ReaderInfo getReaderInfoById(Long reader_id);
    public int updateReaderInfo(ReaderInfo readerInfo);
    public int updateReaderCard(ReaderInfo readerInfo);
    public List<ReaderInfo> getAllReaderInfo();
}
