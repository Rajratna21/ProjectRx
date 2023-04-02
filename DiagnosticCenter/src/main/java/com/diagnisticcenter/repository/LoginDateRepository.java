package com.diagnisticcenter.repository;

import java.time.LocalDateTime;

import org.springframework.data.jpa.repository.JpaRepository;

import com.diagnisticcenter.entity.LoginDate;

public interface LoginDateRepository  extends JpaRepository<LoginDate,LocalDateTime>{

}
