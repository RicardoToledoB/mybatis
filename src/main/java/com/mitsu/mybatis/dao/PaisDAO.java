package com.mitsu.mybatis.dao;

import com.mitsu.mybatis.config.MyBatisUtil;
import com.mitsu.mybatis.mappers.PaisMapper;
import com.mitsu.mybatis.model.Pais;
import java.util.ArrayList;
import java.util.List;
import org.apache.ibatis.session.SqlSession;

public class PaisDAO implements PaisMapper {

    public void save(Pais pais) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.insert("Pais.save", pais);
        } finally {
            session.commit();
            session.close();
        }
    }

    public List<Pais> findById(Pais p) {
        List<Pais> list = new ArrayList<Pais>();
        SqlSession session = new MyBatisUtil().getSession();

        try {
            list = session.selectList("Pais.findById");
        } finally {
            session.close();
        }
        System.out.println("getAll: " + list);
        return list;

    }
    
    public List<Pais> getAll() {
        List<Pais> list = new ArrayList<Pais>();
        SqlSession session = new MyBatisUtil().getSession();

        try {
            list = session.selectList("Pais.getAll");
        } finally {
            session.close();
        }
        System.out.println("getAll: " + list);
        return list;

    }

    public void update(Pais pais) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Pais.update", pais);
        } finally {
            session.commit();
            session.close();
        }
    }

    public void delete(Pais pais) {
        SqlSession session = new MyBatisUtil().getSession();
        try {
            session.update("Pais.delete", pais);
        } finally {
            session.commit();
            session.close();
        }
    }

}
