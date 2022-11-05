import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ChurchComponent } from './church/church.component';

@Injectable({
  providedIn: 'root'
})
export class RescrossService {
  
  constructor(private http:HttpClient) { }

  church:any;

  getChurchList(ChurchName:String){
    return this.http.get<ChurchComponent>(`http://localhost:8080/ChurchController/findByChurchName/${ChurchName}`);
    }

}
