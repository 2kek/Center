package com.scalablescripts.auth.services

import com.scalablescripts.auth.models.Internship
import com.scalablescripts.auth.repositories.InternshipRepository
import org.springframework.stereotype.Service

@Service
class InternshipService(private val internshipRepository: InternshipRepository) {
    fun getAllInternships(): List<Internship> {
        return internshipRepository.findAll()
    }

    fun createInternship(internship: Internship): Internship {
        return internshipRepository.save(internship)
    }
}