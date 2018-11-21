package com.devhh.configclient;

import com.devhh.configclient.service.Sender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author devhh
 * @version 1.0.0
 * @since 2018-11-19 17:58
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = ConfigClientApplication.class)
public class RabbitApplicationTest {

    @Autowired
    private Sender sender;

    @Test
    public void hello() {
        sender.send();
    }

}
