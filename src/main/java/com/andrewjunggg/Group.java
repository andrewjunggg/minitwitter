package com.andrewjunggg;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

// - add user
// - add subgroup

public class Group extends Identity {
    private final List<User> users = new ArrayList<>();
    private final List<Group> subgroups = new ArrayList<>();

    public Group(String idString) {
        super(idString);
    }

    public Group(String idString, User[] users) {
        super(idString);
        setUsers(users);
    }

    public Group(String idString, User[] users, Group[] subgroups) {
        super(idString);
        setUsers(users);
        setSubgroups(subgroups);
    }

    // getter

    public User[] getUsersArray() {
        return users.toArray(User[]::new);
    }

    public Group[] getSubgroupsArray() {
        return subgroups.toArray(Group[]::new);
    }

    // setter

    public void setUsers(User[] users) {
        this.users.clear();
        Collections.addAll(this.users, users);
    }

    public void setSubgroups(Group[] subgroups) {
        this.subgroups.clear();
        Collections.addAll(this.subgroups, subgroups);
    }

    // method
    
    public void addUser(User user) {
        users.add(user);
    }

    public void addSubgroup(Group subgroup) {
        this.subgroups.add(subgroup);
    }
}
