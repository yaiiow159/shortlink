package com.timmy.shortlink.dao;

import com.timmy.shortlink.entity.UrlMapping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UrlMappingRepository extends JpaRepository<UrlMapping, Long> {

    @Query("select u.url from UrlMapping u where u.shortUrl = ?1")
    String getUrl(String shortUrl);
}