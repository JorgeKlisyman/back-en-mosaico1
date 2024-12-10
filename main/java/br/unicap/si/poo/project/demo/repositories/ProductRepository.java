package br.unicap.si.poo.project.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.unicap.si.poo.project.demo.models.*;

import jakarta.transaction.Transactional;
@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{
    @Transactional
    void deleteByProductCategory(Category category);

    @Transactional
    void deleteBySaleBy(PartnerStore partnerStore);
}
