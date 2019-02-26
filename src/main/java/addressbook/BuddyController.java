package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BuddyController {
    @Autowired
    BuddyRepository repository;

    @PostMapping("/add")
    public @ResponseBody BuddyInfo add(@ModelAttribute BuddyInfo buddy, Model m) {
//        System.out.println("************** BUDDY TO ADD: " + buddy.toString());
        m.addAttribute("buddy", new BuddyInfo());
        repository.save(buddy);
//        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
//        System.out.println("**********************BUDDIES ***************");
//        for(BuddyInfo b: buddies) {
//            System.out.println("**********************" + b.toString());
//        }
        return buddy;
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("name") String name, Model model) {
        System.out.println(" Delete called with Name = "+ name);
        BuddyInfo b = repository.findByName(name).get(0);
        repository.delete(b);

        model.addAttribute("buddy", new BuddyInfo());
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        model.addAttribute("buddies", buddies);
        return "add";
    }

}
