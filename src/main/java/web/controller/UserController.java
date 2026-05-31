package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.Service.UserService;
import web.Model.User;


@Controller
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping({"", "/"})
    public String index(Model model,
                        @RequestParam(required = false) String action,
                        @RequestParam(required = false) Integer id) {

        if ("new".equals(action)) {
            model.addAttribute("user", new User());
            return "new";
        } else if ("edit".equals(action) && id != null) {
            model.addAttribute("user", userService.show(id));
            return "edit";
        }

        model.addAttribute("people", userService.getUserList());
        return "index";
    }

    @PostMapping("/")
    public String processUser(@ModelAttribute("user") User user,
                              @RequestParam(required = false) Integer id,
                              @RequestParam(required = false) String action) {

        if ("delete".equals(action) && id != null) {
            userService.delete(id);
        } else if ("update".equals(action) && id != null) {
            user.setId(Long.valueOf(id));
            userService.update(user);
        } else if ("create".equals(action)) {
            userService.save(user);
        }

        return "redirect:/";
    }
}
