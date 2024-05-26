package com.timmy.shortlink.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

import java.io.Serial;

@Getter
@Entity
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "url_mapping")
public class UrlMapping implements java.io.Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String url;
    private String shortUrl;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid")
    private Long id;

    @Override
    public String toString() {
        return "UrlMapping [url=" + url + ", shortUrl=" + shortUrl + ", id=" + id + "]";
    }

}
