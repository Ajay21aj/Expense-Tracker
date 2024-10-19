package com.example.demo.controller;

import com.example.demo.dao.ExpenseDAO;
import com.example.demo.entity.Expense;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ExpenseController {
    private ExpenseDAO expenseDAO;

    @Autowired
    public ExpenseController(ExpenseDAO expenseDAO) {
        this.expenseDAO = expenseDAO;
    }

    @GetMapping("/add")
    public String add(){
        String type = "fashion";
        int amount = 1001;
        expenseDAO.addExpense(new Expense(5,"fashion",1001));
        return " Added to the database";

    }
    @GetMapping("/delete")
    public String delete(){
        int theId = 3;
        expenseDAO.removeExpense(theId);
        return " removed the expense";
    }
    @GetMapping("/getAll")
    public void getAll()
    {
        List<Expense> result = expenseDAO.getAllExpense();
        System.out.println(result);

    }

}
