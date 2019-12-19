package atm.entity;

import atm.service.AtmService;
import org.springframework.beans.factory.annotation.Autowired;

public class Randomiser extends Thread {
    @Autowired
    AtmService service;

    public void run() {
        System.out.println("BEGIN");
        while (true) {
            try {
                service.updateBalance();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }

        }
    }
}
