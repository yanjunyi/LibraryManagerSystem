package com.yanjunyi.ssm.dao;

import com.yanjunyi.ssm.pojo.ReaderCard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ReaderCardDao {
    public int addReaderCard(ReaderCard readerCard);
    public int deleteReaderCard(Long reader_id);
    public int updateReaderCard(ReaderCard readerCard);
    public ReaderCard findReaderById(Long reader_id);
    public ReaderCard getMatch(ReaderCard readerCard);
    public String getReaderPassword(Long reader_id);
    public int resetPassword(@Param("reader_id")long reader_id, @Param("password")String password);
}
