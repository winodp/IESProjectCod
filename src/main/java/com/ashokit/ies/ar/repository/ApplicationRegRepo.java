package com.ashokit.ies.ar.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashokit.ies.ar.entity.ApplicationRegistrationEntity;

public interface ApplicationRegRepo extends JpaRepository<ApplicationRegistrationEntity, Serializable> {

}
