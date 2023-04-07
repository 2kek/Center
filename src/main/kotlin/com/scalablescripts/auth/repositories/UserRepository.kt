package com.scalablescripts.auth.repositories

import com.scalablescripts.auth.models.Candidat
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository: JpaRepository<Candidat, Int> {
    fun findByEmail(email:String): Candidat?
}