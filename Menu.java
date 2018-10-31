package com.company.Microblog;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner keyboard = new Scanner(System.in);
    ArrayList<User> userList = new ArrayList<>();
    User currentUser = new User(" ", "unknown", " ", " ");

    public void displayMenuOptions() {
        System.out.println("Main Menu");
        System.out.println("1) Create a new user");
        System.out.println("2) Become an existing user");
        System.out.println("3) Create a post as the current user");
        System.out.println("4) Print all posts");
        System.out.println("5) Print all users");
        respondToMenuOption();
        chooseMenuOption();
    }

    public void chooseMenuOption() {
        Boolean chooseAnotherOption = true;

        while (chooseAnotherOption) {

            System.out.println("Please type \"Menu\" to choose another option, or \"Finished\" to exit.");
            String chooseAgain = keyboard.nextLine();
            if (chooseAgain.equals("Menu") || chooseAgain.equals("menu")) {
                if (!currentUser.getUserName().equals("unknown")) {
                    System.out.println("\nYou are currently user " + currentUser.getUserName() + ".");
                }
                respondToMenuOption();
            } else if (chooseAgain.equals("Finished") || chooseAgain.equals("finished")) {
                chooseAnotherOption = false;
            } else {
                System.out.println("That was not an option.");
            }
        }
    }

        public void respondToMenuOption() {
            boolean invalidInput = false;
            System.out.println("Please choose an option, 1-5.");
            String optionChosen = keyboard.nextLine();
            do {
                if (optionChosen.equals("1")) {
                    currentUser = createNewUser();
                    userList.add(currentUser);
                } else if (userList.size()==0) {
                    System.out.println("No users exist yet.");
                } else if (optionChosen.equals("2")) {
                    currentUser = findCurrentUser(userList);
                    System.out.println("Welcome, " + currentUser + "\n");
                } else if (optionChosen.equals("3")) {
                    displayLastPost();
                    Post newPost = createNewPost(currentUser);
                    currentUser.addPost(newPost);
                } else if (optionChosen.equals("4")) {
                    if (currentUser.getPostList().size()==0){
                        System.out.println("No posts created yet.");
                    }
                    else{printAllPosts();}
                } else if (optionChosen.equals("5")) {
                    printAllUsers();
                } else {
                    System.out.println("That was not an option. Please enter a number, 1-5.");
                    optionChosen = keyboard.nextLine();
                    invalidInput = true;
                }
            } while (invalidInput);
        }

        public User createNewUser () {
            System.out.println("Please enter your real name: ");
            String name = keyboard.nextLine();
            System.out.println("Please enter a user name to use: ");
            String userName = keyboard.nextLine();
            System.out.println("Now enter a link to the avatar picture you'd like to use: ");
            String pictureUrl = keyboard.nextLine();
            System.out.println("Now enter your email address, and we're set! ");
            String email = keyboard.nextLine();
            User newUser = new User(name, userName, pictureUrl, email);
            System.out.println("You have created a new user. Welcome, " + name.toUpperCase() + ".\n");
            return newUser;
        }

          public void displayLastPost(){
              if(currentUser.getPostList().size()!=0){
                  System.out.println("This is the last post that you created:");
                  System.out.println(currentUser.displayLastPost().getPost());
              }
         }

        public User findCurrentUser (ArrayList userList) {
            if (userList.size() == 0) {
                System.out.println("No users created yet.");
                displayMenuOptions();
            }
                System.out.println("Please select the number beside the correct username: \n");
                for (int number = 0; number < userList.size(); number++) {
                    User u = (User) userList.get(number);
                    System.out.print(number + 1);
                    System.out.print(". ");
                    System.out.println(u.getUserName());
                }
                int chosenNumber = keyboard.nextInt()-1;
                keyboard.skip("\n");
                User currentUser = (User) userList.get(chosenNumber);
                return currentUser;
            }

        public Post createNewPost (User currentUser){
            if (userList.size() == 0) {
                System.out.println("No users created yet. Please first create a user.");
                chooseMenuOption();
            }
            System.out.println("Please type in the content you would like to display in your post:");
            String postContent = keyboard.nextLine();
            System.out.println("Would you like to include a website link?");
            String websiteLink = " ";
            Boolean invalidChoice = true;
            while(invalidChoice) {
                String includeUrl = keyboard.nextLine();
                if (includeUrl.equals("Yes") || includeUrl.equals("yes")) {
                    System.out.println("You may enter the website link you would like to include:");
                    websiteLink = keyboard.nextLine();
                    invalidChoice = false;
                } else if (includeUrl.equals("No") || includeUrl.equals("no")) {
                    websiteLink = " ";
                    invalidChoice = false;
                } else {
                    System.out.println("Please enter \"Yes\" or \"No\".");
                }
            }
            Post newPost = new Post(postContent, websiteLink, currentUser);
            System.out.println("You have created the following post:\n" + newPost.getPost() + "\n");
            return newPost;
        }
        public void printAllPosts () {
            for (int count = 0; count < userList.size(); count++) {
                currentUser = userList.get(count);
                ArrayList postList = currentUser.getPostList();
                for (int i = 0; i < postList.size(); i++) {
                    Post postToPrint = (Post) postList.get(i);
                    System.out.println(postToPrint.getPost());
                }
            }
            System.out.println();
        }

        public void printAllUsers () {
            for (int count = 0; count < userList.size(); count++) {
                currentUser = userList.get(count);
                System.out.println(currentUser.getUserName());
            }
            System.out.println();
        }

        public static void main (String[]args){
            System.out.println("Welcome to Microblog!");
            Menu menuInstance = new Menu();
            menuInstance.displayMenuOptions();
            System.out.println("Thanks for visiting the microblog. Have a great day!");
        }
    }