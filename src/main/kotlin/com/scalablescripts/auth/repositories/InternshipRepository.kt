package com.scalablescripts.auth.repositories

import com.scalablescripts.auth.models.Internship
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface InternshipRepository : JpaRepository<Internship, Long>