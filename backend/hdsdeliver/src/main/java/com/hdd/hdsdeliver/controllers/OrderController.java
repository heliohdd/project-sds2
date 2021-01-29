package com.hdd.hdsdeliver.controllers;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.hdd.hdsdeliver.dto.OrderDTO;
import com.hdd.hdsdeliver.entities.Order;
import com.hdd.hdsdeliver.services.OrderService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;

@RestController
@RequestMapping(value = "/orders")
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@GetMapping
	@Operation(summary = "Shows all the orders")
	@ApiResponses(value = {
			  @ApiResponse(responseCode = "200", description = "All orders", 
				content = { @Content(mediaType = "application/json", 
				  schema = @Schema(implementation = OrderDTO.class)) }),
			  @ApiResponse(responseCode = "404", description = "There's not any order found", 
				content = @Content) })
	public ResponseEntity<List<OrderDTO>> findAll() {
		List<OrderDTO> list = orderService.findAll();
		return ResponseEntity.ok().body(list);
	}
	
	@PostMapping
	@Operation(summary = "Creates a new order")
	@ApiResponses(value = {
			  @ApiResponse(responseCode = "200", description = "Order created", 
				content = { @Content(mediaType = "application/json", 
				  schema = @Schema(implementation = OrderDTO.class)) }),
			   })
	public ResponseEntity<OrderDTO> insert(@RequestBody OrderDTO dto) {
		dto = orderService.insert(dto);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(dto.getId()).toUri();
		return ResponseEntity.created(uri).body(dto);
	}
	
	@PutMapping("/{id}/delivered")
	@Operation(summary = "Register order as delivered")
	@ApiResponses(value = {
			  @ApiResponse(responseCode = "200", description = "Order delivered", 
				content = { @Content(mediaType = "application/json", 
				  schema = @Schema(implementation = OrderDTO.class)) }),
			  @ApiResponse(responseCode = "400", description = "Invalid id supplied", 
				content = @Content), 
			  @ApiResponse(responseCode = "404", description = "Order not found", 
				content = @Content) })
	public ResponseEntity<OrderDTO> setDelivered(@PathVariable Long id) {
		OrderDTO dto = orderService.setDelivered(id);
		return ResponseEntity.ok().body(dto);
	}
	
}