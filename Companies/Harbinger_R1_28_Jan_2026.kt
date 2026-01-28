Tell me about your career and background


OOPS
=====
What is Oops Pillers? Explain all
explain Multiple inheritance (For Java Explained, For kotlin has no such privilege, and explained why)
What are visibility modifiers in Java
Explain private vs public vs protected


kotlin
====
Which programming language do you use in Android development?
explain var vs val
What is the difference between launch vs async
Why use Kotlin if there is Java?


Android
======
Interesting and challenging app you worked on?
Android building blocks (Activity, Service, BR, CP)
Activivty vs fragment
What is a build variant?
What are the build flavours/release flavors?
What is the lifecycle state of a running application?
When the user opens the app, which state is called
The The 
The app runs well in Android Studio, but in production, it crashes. How will you find the root cause?
Have you used version control
Have you worked in a team?


Problem
=======
/*
 * Problem: Suppose a list of users is given, which has 3 parameters (id, name, isActiveStatus),
 * You have to return active users only (IN JAVA)
 *
 * My thought process:
 *
 * fun provideUserDEtails(list: List<Users>): List<Users> {
 *    return activeUsersList
 * }
 * */

import java.util.ArrayList;
import java.util.List;

class Users {
  int id;
  String name;
  boolean isActive;

  public Users(int id, String name, boolean isActive) {
    this.id = id;
    this.name = name;
    this.isActive = isActive;
  }
}
class Solution {
  private List<Users> getActiveUsers(List<Users> allUsers) {
    ArrayList<Users> activeUsers = new ArrayList<>();
    for (Users user:allUsers) {
      if (user.isActive) {
        activeUsers.add(user);
      }
    }

    return activeUsers;
  }
  static void main() {
    Solution solution = new Solution();
    ArrayList<Users> allUsers = new ArrayList<Users>();
    allUsers.add(new Users(1,"AA1",true));
    allUsers.add(new Users(2,"AA2",false));
    allUsers.add(new Users(3,"AA3",true));
    allUsers.add(new Users(4,"AA4",false));
    allUsers.add(new Users(5,"AA5",true));
    allUsers.add(new Users(6,"AA6",true));
    allUsers.add(new Users(7,"AA7",false));
    allUsers.add(new Users(8,"AA8",true));
    allUsers.add(new Users(9,"AA9",false));
    List<Users> activeUsers = solution.getActiveUsers(allUsers);

    for (Users usr: activeUsers) {
      System.out.println(usr.name+" -- "+usr.isActive);
    }
  }
}
