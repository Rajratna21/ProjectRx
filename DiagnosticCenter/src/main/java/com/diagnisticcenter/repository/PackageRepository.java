package com.diagnisticcenter.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diagnisticcenter.entity.Package;
@Repository
public interface PackageRepository extends JpaRepository<Package, Integer>{

}
