package com.kurs.wzorce.strukturalne.composite;

public class FinancialDepartment implements Department {

    private Integer id;
    private String name;

    @Override
    public void printDepartmentName() {
        System.out.println(getClass().getSimpleName());
    }

    @Override
    public void addDepartment(Department department) {
        throw new RuntimeException("Unimplemented");
    }

    public FinancialDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
