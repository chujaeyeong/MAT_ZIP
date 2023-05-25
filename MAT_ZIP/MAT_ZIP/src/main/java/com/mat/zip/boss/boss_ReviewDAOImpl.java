package com.mat.zip.boss;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class boss_ReviewDAOImpl implements boss_ReviewDAO {
    @Autowired
    private SqlSession sqlSession;

    @Override
    public List<String> TotalReview(String storeId) {
        return sqlSession.selectList("TotalReview", storeId);
    }
}

