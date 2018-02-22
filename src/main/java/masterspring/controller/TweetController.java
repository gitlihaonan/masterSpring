package masterspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.twitter.api.SearchResults;
import org.springframework.social.twitter.api.Tweet;
import org.springframework.social.twitter.api.Twitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lihaonan on 2/22/18.
 */
@Controller
public class TweetController {

    @Autowired
    private Twitter twitter;



    @RequestMapping("/")
    public String hello(@RequestParam(defaultValue = "masterSrpingMVC4") String search, Model model) {
        SearchResults searchResults = twitter.searchOperations().search(search);
        String text = searchResults.getTweets().get(0).getText();

        List<String> tweets = searchResults.getTweets()
                                .stream()
                                .map(Tweet::getText)
                                .collect(Collectors.toList());
//         Lambda Test Start
        List<String> proNames = Arrays.asList(new String[]{"Ni","Hao","Ma"});
        List<String> lowerCaseNames = proNames.stream().map(String::toLowerCase).collect(Collectors.toList());
        lowerCaseNames.forEach(System.out::println);


        String waibu = "lambda :";
        List<String> proStrs = Arrays.asList(new String[]{"Ni","Hao","Lambda"});
        List<String>execStrs = proStrs.stream().map(chuandi -> {
            Long zidingyi = System.currentTimeMillis();
            System.out.println(this.getClass().getName());
            return waibu + chuandi + " -----:" + zidingyi;
        }).collect(Collectors.toList());
        execStrs.forEach(System.out::println);

//         Lambda Test End
        model.addAttribute("tweets", tweets);
        return "resultPage";
    }
}
