package atm.service;

import atm.dao.AtmDao;
import atm.entity.Atm;
import atm.entity.Info;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtmService {

    @Autowired
    AtmDao dao;

    public List<Info> getInfo(int id){
        return dao.getInfo(id);
    }

    public List<Atm> getAtms() {
        return dao.getAtms();
    }

    public void updateBalance() {
         dao.updateBalance();
    }
}
