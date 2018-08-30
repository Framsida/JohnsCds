package com.qa.CDsYO.domain;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import java.util.List;

@Entity
public class CD {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    @Column(name = "title")
    private String title;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "cd")
    private List<Artist> artists;

    public CD() {
    }

    public CD(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
