package com.scalablescripts.auth.controllers


import com.scalablescripts.auth.models.Internship
import com.scalablescripts.auth.services.InternshipService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/internships")
class InternshipController(private val internshipService: InternshipService) {
    @GetMapping("/all")
    fun getAllInternships(): List<Internship> {
        return internshipService.getAllInternships()
    }

    @PostMapping("/create")
    fun createInternship(@RequestBody internship: Internship): Internship {
        return internshipService.createInternship(internship)
    }
}