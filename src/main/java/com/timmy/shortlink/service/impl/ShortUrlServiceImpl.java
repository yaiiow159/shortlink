package com.timmy.shortlink.service.impl;

import com.timmy.shortlink.dao.UrlMappingRepository;
import com.timmy.shortlink.entity.UrlMapping;
import com.timmy.shortlink.service.ShortUrlService;
import com.timmy.shortlink.util.HexStringUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ShortUrlServiceImpl implements ShortUrlService {

    private final UrlMappingRepository urlMappingRepository;

    @Override
    @Transactional
    public String generateShortUrl(String url) {
        UrlMapping urlMapping = new UrlMapping();
        urlMapping.setUrl(url);
        String shortUrl = HexStringUtil.generateShortUrl();
        urlMapping.setShortUrl(shortUrl);
        urlMappingRepository.save(urlMapping);
        return shortUrl;
    }

    @Override
    @Transactional
    public String getOriginalUrl(String shortUrl) {
        return urlMappingRepository.getUrl(shortUrl);
    }

}
