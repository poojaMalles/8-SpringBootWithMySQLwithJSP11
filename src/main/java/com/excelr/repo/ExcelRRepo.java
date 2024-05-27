package com.excelr.repo;

import org.springframework.data.repository.CrudRepository;

import com.excelr.entity.Students;

public interface ExcelRRepo extends CrudRepository<Students, Integer> {

}
