import { HttpClient} from '@angular/common/http';
import { Injectable } from '@angular/core';
import { environment } from 'src/environments/environment.prod';


const API_BASE = environment.baseUrl;


@Injectable({
  providedIn: 'root'
})
export class AppService {

  constructor(
    private http: HttpClient
  ) { }

  getAllPublications() {
    return this.http.get(`${API_BASE}/publicaciones`);
  }
  
  createPublication(publication : any) { 
    return this.http.post(`${API_BASE}/publicaciones`, publication)
  }

  getAllSugerencias() {
    return this.http.get(`${API_BASE}/publicaciones/sugerencias`);
  }

  getAllQuejas() {
    return this.http.get(`${API_BASE}/publicaciones/quejas`);
  }

}
