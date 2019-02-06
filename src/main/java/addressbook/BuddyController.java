package addressbook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class BuddyController {
    @Autowired
    BuddyRepository repository;

    @GetMapping("/add")
    public String findAllBuddies(Model model) {
        model.addAttribute("buddy", new BuddyInfo());
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        model.addAttribute("buddies", buddies);
        return "add";
    }

    @PostMapping("/add")
    public String add(@ModelAttribute BuddyInfo buddy, Model m) {
        System.out.println("Buddy to add: " + buddy.getName());
        repository.save(buddy);
        m.addAttribute("buddy", new BuddyInfo());
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        m.addAttribute("buddies", buddies);
        return "result";
    }

    @RequestMapping("/delete")
    public String delete(@RequestParam("name") String name, Model model) {
        System.out.println(" Delete called with Name = "+ name);
        BuddyInfo b = repository.findByName(name).get(0);
        repository.delete(b);

        model.addAttribute("buddy", new BuddyInfo());
        List<BuddyInfo> buddies = (List<BuddyInfo>) repository.findAll();
        model.addAttribute("buddies", buddies);
        return "result";
    }

}
