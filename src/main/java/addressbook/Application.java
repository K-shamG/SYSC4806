package addressbook;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    private static final Logger log = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @Bean
//    public CommandLineRunner demo(BuddyRepository repository) {
//        return (args) -> {
//            // save a couple of BuddyInfos
//            repository.save(new BuddyInfo("Jack", "613-111-1111"));
//            repository.save(new BuddyInfo("Chloe", "613-222-2222"));
//            repository.save(new BuddyInfo("Kim", "613-333-3333"));
//            repository.save(new BuddyInfo("David", "613-444-4444"));
//            repository.save(new BuddyInfo("Michelle", "613-555-5555"));
//
//            // fetch all BuddyInfos
//            log.info("BuddyInfos found with findAll():");
//            log.info("-------------------------------");
//            for (BuddyInfo BuddyInfo : repository.findAll()) {
//                log.info(BuddyInfo.toString());
//            }
//            log.info("");
//
//            // fetch an individual addressbook.BuddyInfo by ID
//            repository.findById(1L)
//                    .ifPresent(BuddyInfo -> {
//                        log.info("addressbook.BuddyInfo found with findById(1L):");
//                        log.info("--------------------------------");
//                        log.info(BuddyInfo.toString());
//                        log.info("");
//                    });
//
//            // fetch BuddyInfos by name
//            log.info("addressbook.BuddyInfo found with findByName('Bauer'):");
//            log.info("--------------------------------------------");
//            repository.findByName("Bauer").forEach(bauer -> {
//                log.info(bauer.toString());
//            });
//            // for (addressbook.BuddyInfo bauer : repository.findByLastName("Bauer")) {
//            // 	log.info(bauer.toString());
//            // }
//            log.info("");
//        };
//    }

}