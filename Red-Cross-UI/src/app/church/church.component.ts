import { Component, OnInit } from '@angular/core';
import { RescrossService } from '../rescross.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-church',
  templateUrl: './church.component.html',
  styleUrls: ['./church.component.css'],
})
export class ChurchComponent implements OnInit {
  
  constructor(private service: RescrossService) {}

  churchList: any;

  churchName: any;

  public lat1: any;

  public long1: any;

  distance: any;

  ngOnInit(): void {
    this.getLocation();
  }
  getLocation() {
    if (navigator.geolocation) {
      navigator.geolocation.getCurrentPosition(
        (position: GeolocationPosition) => {
          if (position) {
            this.lat1 = position.coords.latitude;
            this.long1 = position.coords.longitude;
          }
        },
        (error: GeolocationPositionError) => console.log(error)
      );
    } else {
      alert('Geolocation is not supported by this browser.');
    }
  }


  getSearchResult() {
    this.service.getChurchList(this.churchName).subscribe((data: any) => {
    this.churchList = data;
    console.log(data);
    })
    
  }

 

    getDistanceFromLatLonInKm(lat2: number, long2: number) {
    var R = 6371; // Radius of the earth in kilometers
    var dLat = this.deg2rad(lat2 - this.lat1); // deg2rad below
    var dLon = this.deg2rad(long2 - this.long1);
    var a =
      Math.sin(dLat / 2) * Math.sin(dLat / 2) +
      Math.cos(this.deg2rad(this.lat1)) *
        Math.cos(this.deg2rad(lat2)) *
        Math.sin(dLon / 2) *
        Math.sin(dLon / 2);
    var c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    var d = R * c; // Distance in KM
    console.log(d);
    return (this.distance = Math.round(d * 100) / 100);
  }

  deg2rad(deg: number) {
    return deg * (Math.PI / 180);
  }
}


