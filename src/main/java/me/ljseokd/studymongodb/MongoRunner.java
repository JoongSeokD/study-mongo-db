package me.ljseokd.studymongodb;

import me.ljseokd.studymongodb.account.Account;
import me.ljseokd.studymongodb.account.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MongoRunner implements ApplicationRunner {

    @Autowired
    AccountRepository accountRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Account account = new Account();
        account.setEmail("ljseokd@gmail.com");
        account.setName("Lee Joong Seok");

        accountRepository.insert(account);

        System.out.println("saved");
    }
}
