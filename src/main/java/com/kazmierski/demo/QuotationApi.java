package com.kazmierski.demo;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class QuotationApi {

    private List<Quotation> quotations;

    public QuotationApi() {
        this.quotations = new ArrayList<>();
        quotations.add(new Quotation("sda","sds"));
        quotations.add(new Quotation("ssdfa sdfs dfsdda","sds fd dafsdsa"));
    }

    @GetMapping("/api")
    public List<Quotation> getAll() {
        return quotations;
    }

    @PostMapping("/api")
    public boolean addQuotation(@RequestBody Quotation quotation) {
        return quotations.add(quotation);
    }

    @DeleteMapping("/api")
    public void deleteQuotation(@RequestParam int index) {
        quotations.remove(index);
    }

}
