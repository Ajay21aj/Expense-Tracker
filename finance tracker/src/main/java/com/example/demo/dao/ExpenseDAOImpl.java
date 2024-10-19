package com.example.demo.dao;

import com.example.demo.entity.Expense;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class ExpenseDAOImpl implements  ExpenseDAO{
    private EntityManager entityManager;
    @Autowired
    public ExpenseDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void addExpense(Expense theExpense) {


        Expense tempExpense= theExpense;
        entityManager.persist(tempExpense);

    }

    @Override
    @Transactional
    public void removeExpense(int theId) {
        Expense theExpense = entityManager.find(Expense.class,theId);
        entityManager.remove(theExpense);

    }

    @Override
    public List<Expense> getAllExpense() {
        TypedQuery<Expense> query = entityManager.createQuery("SELECT e.type FROM Expense e",Expense.class);
        List<Expense> results = query.getResultList();
        return  results;
    }

    @Override
    public int totaExpense() {
        return 0;
    }
}
