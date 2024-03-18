package com.ssafy.backend.domain.book.repository.bookpurchased;

import com.ssafy.backend.domain.book.entity.BookPurchasedLearning;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPurchasedRepository extends JpaRepository<BookPurchasedLearning, Long>, BookPurchasedCustomRepository {
}
