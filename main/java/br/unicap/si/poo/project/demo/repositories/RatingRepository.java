<<<<<<< HEAD
package br.unicap.si.poo.project.demo.repositories;

import br.unicap.si.poo.project.demo.models.Rating;
import br.unicap.si.poo.project.demo.models.User;
import br.unicap.si.poo.project.demo.models.PartnerStore;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    @Transactional
    void deleteByUserId(User user);

    @Transactional
    void deleteByPartnerId(PartnerStore partnerStore);
}
=======
package br.unicap.si.poo.project.demo.repositories;

import br.unicap.si.poo.project.demo.models.Rating;
import br.unicap.si.poo.project.demo.models.User;
import br.unicap.si.poo.project.demo.models.PartnerStore;

import jakarta.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RatingRepository extends JpaRepository<Rating, Long> {
    @Transactional
    void deleteByUserId(User user);

    @Transactional
    void deleteByPartnerId(PartnerStore partnerStore);
}
>>>>>>> 0132d4a7878da37e1af32b083c959138a8595292
