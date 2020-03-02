package com.venkat.vallabhaneni.Addresses;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class AddressesController {

  @GetMapping("/address/{name}")
  public ResponseEntity<String> printAddress(@PathVariable String name) {
    return new ResponseEntity<>("Venkata Rao Vallabhaneni, Bangalore", HttpStatus.OK);
  }
}
