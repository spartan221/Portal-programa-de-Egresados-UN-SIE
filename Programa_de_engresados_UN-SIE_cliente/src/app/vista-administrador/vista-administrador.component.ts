import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { AppService } from '../app.service';

@Component({
  selector: 'vista-administrador',
  templateUrl: './vista-administrador.component.html',
  styleUrls: ['./vista-administrador.component.css']
})
export class VistaAdministradorComponent implements OnInit {

  publicaciones: any[] = [];
  quejas: any[] = [];
  sugerencias: any[] = [];
  filtro = 0; // 0 es todas las publicaciones, 1 son quejas y 2 sugerencias.

  constructor(
    private appService: AppService
  ) { }



  getPublications(): void {
    this.appService.getAllPublications()
    .subscribe((data : any) => this.publicaciones = data);
  }

  getQuejas(): void {
    this.appService.getAllQuejas()
    .subscribe((data : any) => this.quejas = data);
  }

  getSugerencias(): void {
    this.appService.getAllSugerencias()
    .subscribe((data : any) => this.sugerencias = data);
  }

  ngOnInit(): void {
    this.getPublications();
  }

  getMoreInfo(index: number): void {
    const json = JSON.stringify(this.publicaciones[index]);
    var publicacion = JSON.parse(json);
    Swal.fire({
      icon: 'info',
      title: publicacion['typeOfPublication'],
      text: publicacion['text'] == null || publicacion['text'] === "" ? 'Esta publicación esta vacía' : publicacion['text'],
      confirmButtonText : 'Cerrar'
    })
  }

  updateFilter(num: number): void {
    this.filtro = num;
  } 
}
