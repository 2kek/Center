package com.scalablescripts.auth.services

import com.scalablescripts.auth.models.Candidat
import com.scalablescripts.auth.repositories.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    fun save(user: Candidat): Candidat {
        return this.userRepository.save(user)
    }

    fun findByEmail(email: String): Candidat? {
        return this.userRepository.findByEmail(email)
    }

    fun getById(id: Int): Candidat {
        return this.userRepository.getById(id)
    }
}