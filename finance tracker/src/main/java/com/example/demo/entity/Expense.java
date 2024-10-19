package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="expenses")
public class Expense {

    // add fields

    // map with table

    @Id

    @Column(name ="id")
    private int id;

    @Column(name ="expense")
    private String type;

    @Column(name ="amount")
    private int amount ;



    // add constructor

    public Expense() {
    }

    public Expense(int theID,String type ,int amount) {
        this.id = theID;

        this.amount=amount;
        this.type=type;
    }
    //  add getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    // add toString() to see all the values

    @Override
    public String toString() {
        return "Expense{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                '}';
    }
}
