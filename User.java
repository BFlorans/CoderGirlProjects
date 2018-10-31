package com.company.Microblog;

import java.util.ArrayList;

public class User {
    private String name;
    private String pictureUrl;
    private String userName;
    private String email;
   // private Post[] posts;
    private ArrayList<Post> postList;


    public User(String name, String userName, String pictureUrl, String email) {
        this.name = name;
        this.pictureUrl = pictureUrl;
        this.userName = userName;
        this.email = email;
        this.postList = new ArrayList<>();
    }
    public String getUserName() {
        return userName;
    }

    public ArrayList getPostList() {
        return postList;
    }

    public void addPost(Post p) {
        postList.add(p);
    }
    public Post displayLastPost() {
        Post lastPost = postList.get(postList.size()-1);
        return lastPost;
    }
}
