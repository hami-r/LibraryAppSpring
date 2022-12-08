package com.nest.libraryapp_backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "issues")
public class Issue {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private String bookTitle;
    private String dateOfIssue;
    private String membershipNo;

    public Issue() {
    }

    public Issue(int id, String name, String bookTitle, String dateOfIssue, String membershipNo) {
        this.id = id;
        this.name = name;
        this.bookTitle = bookTitle;
        this.dateOfIssue = dateOfIssue;
        this.membershipNo = membershipNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getDateOfIssue() {
        return dateOfIssue;
    }

    public void setDateOfIssue(String dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    public String getMembershipNo() {
        return membershipNo;
    }

    public void setMembershipNo(String membershipNo) {
        this.membershipNo = membershipNo;
    }
}
