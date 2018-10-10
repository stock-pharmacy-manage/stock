package com.management.stock.stockapi.controllers;


import com.management.stock.stockapi.model.Sale;
import com.management.stock.stockapi.repository.SaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class SaleController {

    @Autowired
    SaleRepository saleRepository;


    @GetMapping("/sale")
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @PostMapping("/sale")
    public Sale createSale(@Valid @RequestBody Sale sale) {
        return saleRepository.save(sale);
    }

    @GetMapping(value="/sale/{id}")
    public ResponseEntity<Sale> getSaleById(@PathVariable("id") String id) {
        return saleRepository.findById(id)
                .map(sale -> ResponseEntity.ok().body(sale))
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping(value="/sale/{id}")
    public ResponseEntity<Sale> updateSale(@PathVariable("id") String id,
                                           @Valid @RequestBody Sale sale) {
        return saleRepository.findById(id)
                .map(todoData -> {
                    todoData.setAmount(sale.getAmount());
                    todoData.setCustomer(sale.getCustomer());
                    todoData.setDate(sale.getDate());
                    todoData.setProduct_number(sale.getProduct_number());
                    todoData.setProducts(sale.getProducts());
                    Sale updatedSale = saleRepository.save(todoData);
                    return ResponseEntity.ok().body(updatedSale);
                }).orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping(value="/sale/{id}")
    public ResponseEntity<?> deleteSale(@PathVariable("id") String id) {
        return saleRepository.findById(id)
                .map(todo -> {
                    saleRepository.deleteById(id);
                    return ResponseEntity.ok().build();
                }).orElse(ResponseEntity.notFound().build());
    }
}
