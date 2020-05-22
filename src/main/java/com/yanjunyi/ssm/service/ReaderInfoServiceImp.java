package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.dao.ReaderInfoDao;
import com.yanjunyi.ssm.pojo.ReaderInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ReaderInfoServiceImp implements ReaderInfoService{
    @Resource
    private ReaderInfoDao  readerInfoDao;
    public int addReaderInfo(ReaderInfo readerInfo) {
        return readerInfoDao.addReaderInfo(readerInfo);
    }

    public ReaderInfo getReaderInfoById(Long reader_id) {
        return readerInfoDao.getReaderInfoById(reader_id);
    }

    public boolean updateReaderCard(ReaderInfo readerInfo) {
        return readerInfoDao.updateReaderCard(readerInfo)>0;
    }

    public boolean updateReaderInfo(ReaderInfo readerInfo) {
        return readerInfoDao.updateReaderInfo(readerInfo)>0;
    }

    public List<ReaderInfo> getAllReaderInfo() {
        return readerInfoDao.getAllReaderInfo();
    }

    public int deleteReaderInfoById(Long reader_id) {
        return readerInfoDao.deleteReaderInfoById(reader_id);
    }
}
