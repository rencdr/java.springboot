package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Note;

public interface NoteRepository extends JpaRepository<Note, Long> {
    // Ekstra sorgular eklenebilir
}
