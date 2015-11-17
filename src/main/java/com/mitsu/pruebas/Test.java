package com.mitsu.pruebas;
import com.mitsu.mybatis.dao.PaisDAO;
import com.mitsu.mybatis.model.Pais;
import java.util.List;
public class Test {
    public static void main(String[] args){
           /*Pais p=new Pais();
           p.setNombre("CHILE");
           p.setEstado("ACTIVO");
           PaisDAO pDAO=new PaisDAO();
           pDAO.save(p);*/
        
       //     Pais p=new Pais();
        //p.setId(1);
        /*PaisDAO pDAO=new PaisDAO();
        List<Pais> pais=pDAO.getAll();
        for(int i=0;i<pais.size();i++){
            System.out.println("NOMBRE:"+pais.get(i).getNombre());
        }*/
        /*Pais p=new Pais();
        p.setId(1);
        PaisDAO pDAO=new PaisDAO();
        pDAO.delete(p);*/
        
        Pais p=new Pais();
        p.setId(2);
        PaisDAO pDAO=new PaisDAO();
         List<Pais> pais=pDAO.findById(p);
        for(int i=0;i<pais.size();i++){
            System.out.println("NOMBRE:"+pais.get(i).getNombre());
        }
           
    }
}
