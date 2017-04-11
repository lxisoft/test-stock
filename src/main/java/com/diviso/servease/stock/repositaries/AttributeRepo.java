package com.diviso.servease.stock.repositaries;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diviso.servease.stock.entities.Attribute;

@Repository
public interface AttributeRepo extends JpaRepository<Attribute, Integer> {

}
