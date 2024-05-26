package com.timmy.shortlink.controller;

import com.timmy.shortlink.service.ShortUrlService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Objects;

@RequiredArgsConstructor
@Controller
public class ShortUrlController {

    private final ShortUrlService shortUrlService;

    @GetMapping
    public String index() {
        return "index";
    }

    @PostMapping("/generateShortUrl")
    @ResponseBody
    public String generateShortUrl(@RequestParam String url) {
        return shortUrlService.generateShortUrl(url);
    }

    @RequestMapping(value = "/{url}", method = RequestMethod.GET)
    @ResponseBody
    public String redirect(@PathVariable String url) {
        return shortUrlService.getOriginalUrl(url);
    }

}
