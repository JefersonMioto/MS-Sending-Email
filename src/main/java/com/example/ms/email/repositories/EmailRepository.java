package com.example.ms.email.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.ms.email.models.EmailModel;

public interface EmailRepository extends JpaRepository<EmailModel, Long> {

}
