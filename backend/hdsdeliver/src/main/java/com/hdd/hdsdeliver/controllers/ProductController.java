package com.hdd.hdsdeliver.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hdd.hdsdeliver.dto.ProductDTO;
import com.hdd.hdsdeliver.services.ProductService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	@Autowired
	private ProductService productService;

	@Operation(summary = "Get a list of products")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "200", description = "Found products", content = {
					@Content(mediaType = "application/json", schema = @Schema(implementation = ProductDTO.class)) }),
			@ApiResponse(responseCode = "404", description = "There's not any product", content = @Content) })
	@GetMapping
	public ResponseEntity<List<ProductDTO>> findAll() {
		List<ProductDTO> list = productService.findAll();
		return ResponseEntity.ok().body(list);
	}
}