package hello;

import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.facebook.api.Facebook;
import org.springframework.social.facebook.api.FriendList;
import org.springframework.social.facebook.api.PagedList;
import org.springframework.social.facebook.api.Post;
import org.springframework.social.facebook.api.Reference;
import org.springframework.social.facebook.api.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/")
public class HelloController {

    private Facebook facebook;
    private ConnectionRepository connectionRepository;

    public HelloController(Facebook facebook, ConnectionRepository connectionRepository) {
        this.facebook = facebook;
        this.connectionRepository = connectionRepository;
    }

    @GetMapping
    public String helloFacebook(Model model, @RequestParam("userName") String userName) {
        if (connectionRepository.findPrimaryConnection(Facebook.class) == null) {
            return "redirect:/connect/facebook";
        }
        String [] fields = { "id", "email",  "first_name", "last_name" };
       User userProfile=facebook.fetchObject("me", User.class,fields);
        // PagedList<FriendList> userProfile = facebook.friendOperations().getFriendLists();
        System.out.println(userProfile);
        model.addAttribute("facebookProfile", userProfile);
        
        PagedList<Post> feed = facebook.feedOperations().getCheckins();
        model.addAttribute("feed", feed);
        return "hello";
    }

}
