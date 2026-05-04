package thymeleaftest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TidakHadir {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id;
    public String NamaTidakHadir;

    public void setNamaTidakHadir(String NamaTidakHadir){
        this.NamaTidakHadir = NamaTidakHadir;
    }

    public String getNamaTidakHadir(){
        return NamaTidakHadir;
    }
}
