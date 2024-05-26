package com.timmy.shortlink.service;

public interface ShortUrlService {

    String generateShortUrl(String url);

    String getOriginalUrl(String shortUrl);
}
