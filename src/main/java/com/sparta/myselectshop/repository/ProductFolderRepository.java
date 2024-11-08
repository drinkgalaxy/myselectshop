package com.sparta.myselectshop.repository;

import com.sparta.myselectshop.entity.Folder;
import com.sparta.myselectshop.entity.Product;
import com.sparta.myselectshop.entity.ProductFolder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductFolderRepository extends JpaRepository<ProductFolder, Long> {
    Optional<ProductFolder> findByProductAndFolder(Product product, Folder folder);

}
