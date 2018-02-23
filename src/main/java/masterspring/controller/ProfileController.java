package masterspring.controller;

import masterspring.date.USLocalDateFormatter;
import masterspring.profile.ProfileForm;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Locale;

/**
 * Created by lihaonan on 2/23/18.
 */
@Controller
public class ProfileController {

    @RequestMapping("/profile")
    public String displayProfile(ProfileForm profileForm) {
        return "profile/profilePage";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.POST)
    public String saveProfile(@Valid ProfileForm profileForm,
                              BindingResult bindingResult) {

        if(bindingResult.hasErrors()) {
           return "profile/profilePage";
        }

        System.out.println("save ok " + profileForm);
        return "redirect:/profile";
    }

    @ModelAttribute("dateFormat")
    public String localtFormat(Locale locale) {
        return USLocalDateFormatter.getPattern(locale);
    }
}
