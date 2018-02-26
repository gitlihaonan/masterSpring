package masterspring.search.api;

import masterspring.search.LightTweet;
import masterspring.search.SearchService;
import masterspring.search.TwitterSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by lihaonan on 2/24/18.
 */
@RestController
@RequestMapping("/api/search")
public class SearchApiController {
    private TwitterSearch twitterSearch;

    @Autowired
    public SearchApiController(TwitterSearch twitterSearch) {
        this.twitterSearch = twitterSearch;
    }

    @RequestMapping(value = "/{searchType}", method = RequestMethod.GET)
    public List<LightTweet> search(@PathVariable String searchType, @MatrixVariable List<String> keywords) {
        return searchService.search(searchType, keywords);
    }
}
