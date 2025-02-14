<<<<<<< HEAD
package br.unicap.si.poo.project.demo.services;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import br.unicap.si.poo.project.demo.repositories.PartnerStoreRepository;
import br.unicap.si.poo.project.demo.repositories.ProductRepository;
import br.unicap.si.poo.project.demo.repositories.RatingRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;
import com.projetofinalback.demo.models.*;

@RequiredArgsConstructor
@Service
public class PartnerStoreService {

    private final PartnerStoreRepository partnerStoreRepository;
    private final ProductRepository productRepository;
    private final RatingRepository ratingRepository;

    //método pra adicionar uma loja parceira na coqueiral
    @Transactional
    public PartnerStore save(PartnerStore partnerStore) {
        return partnerStoreRepository.save(partnerStore);
    }

    //método para consultar se alguma loja já é nossa parceira
    @Transactional(readOnly=true)
    public PartnerStore searchById(Long id) {
        return partnerStoreRepository.findById(id).orElseThrow(

                () -> new RuntimeException("Essa loja não é nossa parceira. Você pode tornar-se parceiro conosco.")
        );
    }
    //método para listar todas as lojas parceiras da coqueiral
    @Transactional(readOnly = true)
    public List<PartnerStore> searchAll() {
        return partnerStoreRepository.findAll();
    }
    //método para alterar o nome de alguma loja parceira
    public PartnerStore updateNamePartnerStore(Long partnerStoreId, String partnerStoreName) {
     PartnerStore lojaparceira = searchById(partnerStoreId);
     lojaparceira.setPartnerStoreName(partnerStoreName);
     return partnerStoreRepository.save(lojaparceira);
    }
       //método para alterar a URL de alguma loja parceira
       public PartnerStore updateURLPartnerStore(Long partnerStoreId, String partnerStoreURL) {
        PartnerStore lojaparceira = searchById(partnerStoreId);
        lojaparceira.setPartnerStoreUrl(partnerStoreURL);
        return partnerStoreRepository.save(lojaparceira);
       }

    //esse método deletar uma loja parceira do sistema
    @Transactional
    public void deletePartnerStore(Long partnerStoreId){
        PartnerStore lojaparceira = partnerStoreRepository.findById(partnerStoreId).orElse(null);
        if (lojaparceira == null) {
            throw new RuntimeException("Não foi possível deletar essa loja parceira. ERRO!!!");
        }else{ratingRepository.deleteByPartnerId(lojaparceira); productRepository.deleteBySaleBy(lojaparceira); partnerStoreRepository.deleteById(partnerStoreId);}
}
}
=======
package br.unicap.si.poo.project.demo.services;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import br.unicap.si.poo.project.demo.repositories.PartnerStoreRepository;
import br.unicap.si.poo.project.demo.repositories.ProductRepository;
import br.unicap.si.poo.project.demo.repositories.RatingRepository;

import java.util.List;

import lombok.RequiredArgsConstructor;
import com.projetofinalback.demo.models.*;

@RequiredArgsConstructor
@Service
public class PartnerStoreService {

    private final PartnerStoreRepository partnerStoreRepository;
    private final ProductRepository productRepository;
    private final RatingRepository ratingRepository;

    //método pra adicionar uma loja parceira na coqueiral
    @Transactional
    public PartnerStore save(PartnerStore partnerStore) {
        return partnerStoreRepository.save(partnerStore);
    }

    //método para consultar se alguma loja já é nossa parceira
    @Transactional(readOnly=true)
    public PartnerStore searchById(Long id) {
        return partnerStoreRepository.findById(id).orElseThrow(

                () -> new RuntimeException("Essa loja não é nossa parceira. Você pode tornar-se parceiro conosco.")
        );
    }
    //método para listar todas as lojas parceiras da coqueiral
    @Transactional(readOnly = true)
    public List<PartnerStore> searchAll() {
        return partnerStoreRepository.findAll();
    }
    //método para alterar o nome de alguma loja parceira
    public PartnerStore updateNamePartnerStore(Long partnerStoreId, String partnerStoreName) {
     PartnerStore lojaparceira = searchById(partnerStoreId);
     lojaparceira.setPartnerStoreName(partnerStoreName);
     return partnerStoreRepository.save(lojaparceira);
    }
       //método para alterar a URL de alguma loja parceira
       public PartnerStore updateURLPartnerStore(Long partnerStoreId, String partnerStoreURL) {
        PartnerStore lojaparceira = searchById(partnerStoreId);
        lojaparceira.setPartnerStoreUrl(partnerStoreURL);
        return partnerStoreRepository.save(lojaparceira);
       }

    //esse método deletar uma loja parceira do sistema
    @Transactional
    public void deletePartnerStore(Long partnerStoreId){
        PartnerStore lojaparceira = partnerStoreRepository.findById(partnerStoreId).orElse(null);
        if (lojaparceira == null) {
            throw new RuntimeException("Não foi possível deletar essa loja parceira. ERRO!!!");
        }else{ratingRepository.deleteByPartnerId(lojaparceira); productRepository.deleteBySaleBy(lojaparceira); partnerStoreRepository.deleteById(partnerStoreId);}
}
}
>>>>>>> 0132d4a7878da37e1af32b083c959138a8595292
