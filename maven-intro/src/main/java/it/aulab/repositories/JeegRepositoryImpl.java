package it.aulab.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import it.aulab.models.Jeeg;

@Repository("jeegRepository")
public class JeegRepositoryImpl implements JeegRepository{

    @Autowired
    private Jeeg jeeg;

    @Override
    public Jeeg getJeeg() {
       return this.jeeg;
    }

    @Override
    public void setJeeg(Jeeg jeeg) {
       this.jeeg = jeeg;
    }

}
