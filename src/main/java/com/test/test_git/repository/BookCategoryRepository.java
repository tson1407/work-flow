package com.test.test_git.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.test_git.model.BookCategory;

public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
    
}
