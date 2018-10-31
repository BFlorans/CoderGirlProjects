package com.company.Microblog;

public class Post {

    private String postContent;
    private String webLink;
    private int postNumber;
    private static int nextPostNumber = 1;
    User myAuthor;


    public Post(String postContent, String webLink, User myAuthor) {
        this.postNumber = nextPostNumber;
        nextPostNumber++;
        this.postContent = postContent;
        this.webLink = webLink;
        this.myAuthor = myAuthor;

    }

    public String getPost() {
        return postNumber + " " + myAuthor.getUserName() + " says: " + postContent + "\n" + webLink;
    }
}
