package com.johnslayer.BuySell.repositories;

import com.johnslayer.BuySell.models.Image;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ImageRepository extends JpaRepository<Image, Long> {
}
