package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.pojo.ReaderCard;
import org.apache.ibatis.annotations.Param;

public interface ReaderCardService {
    public int addReaderCard(ReaderCard readerCard);
    public int deleteReaderCard(Long reader_id);
    public int updateReaderCard(ReaderCard readerCard);
    public ReaderCard findReaderById(Long reader_id);
    public ReaderCard getMatch(ReaderCard readerCard);
    public boolean resetPassword(long reader_id, String password);
    public String getReaderPassword(Long reader_id);
}
