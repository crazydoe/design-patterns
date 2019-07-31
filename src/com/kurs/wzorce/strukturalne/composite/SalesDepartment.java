package com.kurs.wzorce.strukturalne.composite;

public class SalesDepartment implements Department {

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

    public SalesDepartment(Integer id, String name) {
        this.id = id;
        this.name = name;
    }
}
