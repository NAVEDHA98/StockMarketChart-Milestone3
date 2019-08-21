package com.premium.stc.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.premium.stc.model.Company;

public interface CompanyDao extends JpaRepository<Company, Integer>
{
	List<Company> findBySectorId( int sectorId);
	Company findByCompanyName(String companyName);
}
