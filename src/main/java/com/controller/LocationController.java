package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Location;
import com.service.LocationService;

@RestController
@RequestMapping("/api/location")
public class LocationController {
	@Autowired
	private LocationService locationService;
	
	// view all registered vehicles location
		@GetMapping("/all-vehicle-locations")
		public List<Location> getAllVehiclesLocation(){
			return locationService.read();
		}
		
		// view all registered vehicle location by id
		@GetMapping("/{id}")
		public Location getVehicleLocationById(@PathVariable("id") Integer id)
		{
			return locationService.read(id);
		}
}
