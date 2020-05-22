package com.yanjunyi.ssm.service;

import com.yanjunyi.ssm.pojo.ReaderInfo;

import java.util.List;

public interface ReaderInfoService{
    public int addReaderInfo(ReaderInfo readerInfo);
    public int deleteReaderInfoById(Long reader_id);
    public ReaderInfo getReaderInfoById(Long reader_id);
    public boolean updateReaderInfo(ReaderInfo readerInfo);
    public boolean updateReaderCard(ReaderInfo readerInfo);
    public List<ReaderInfo> getAllReaderInfo();
}
