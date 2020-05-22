package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.dao.ReaderCardDao;
import com.yanjunyi.ssm.pojo.ReaderCard;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class ReaderCardServiceImp implements ReaderCardService {
    @Resource
    private ReaderCardDao readerCardDao;
    public int addReaderCard(ReaderCard readerCard) {
        return readerCardDao.addReaderCard(readerCard);
    }

    public int deleteReaderCard(Long reader_id) {
        return readerCardDao.deleteReaderCard(reader_id);
    }

    public int updateReaderCard(ReaderCard readerCard) {
        return readerCardDao.updateReaderCard(readerCard);
    }

    public ReaderCard findReaderById(Long reader_id) {
        return readerCardDao.findReaderById(reader_id);
    }

    public ReaderCard getMatch(ReaderCard readerCard) {
        return readerCardDao.getMatch(readerCard);
    }

    public boolean resetPassword(long reader_id, String password) {
        return readerCardDao.resetPassword(reader_id,password)>0;
    }

    public String getReaderPassword(Long reader_id) {
        return readerCardDao.getReaderPassword(reader_id);
    }
}
