package thymeleaftest;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Hadir {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    public Integer id;
    public String NamaHadir;

    public void setNamaHadir(String NamaHadir){
        this.NamaHadir = NamaHadir;
    }

    public String getNamaHadir(){
        return NamaHadir;
    }
}
