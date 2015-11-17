package com.mitsu.mybatis.mappers;

import com.mitsu.mybatis.model.Pais;
import java.util.List;

public interface PaisMapper {

    public void save(Pais pais);

    public List<Pais> getAll();

    public void update(Pais pais);

    public void delete(Pais pais);
    
    public List<Pais> findById(Pais pais);
}
