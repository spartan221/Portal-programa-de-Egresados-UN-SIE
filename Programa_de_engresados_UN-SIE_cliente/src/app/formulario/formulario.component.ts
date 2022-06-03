import { Component, OnInit } from '@angular/core';
import Swal from 'sweetalert2';
import { AppService } from '../app.service';

@Component({
  selector: 'app-formulario',
  templateUrl: './formulario.component.html',
  styleUrls: ['./formulario.component.css']
})
export class FormularioComponent implements OnInit {

  publicacion = {
    fullName : '',
    phone : '',
    email : '',
    typeOfPublication : null,
    text : ''
  }

  box_options = [
    {
        "name": "QUEJA",
        "value": "QUEJA",
    },
    {
        "name": "SUGERENCIA",
        "value": "SUGERENCIA"
    },
    ]

  constructor(
    private appService: AppService
  ) { }

  ngOnInit(): void {
  }
  

  createPublication(){
    this.appService.createPublication(this.publicacion)
    .subscribe()

    this.publicacion = {
      fullName : '',
      phone : '',
      email : '',
      typeOfPublication : null,
      text : ''
    }

    this.mensaje();
  }

  mensaje(): void {
    Swal.fire({
      icon: 'success',
      text: 'Gracias por su franqueza almanifestarnos sus quejas o sugerencias, seguiremos esforzándonos pormejorar cada día nuestros procesos internos',
      confirmButtonText : 'Aceptar'
    })
  }
}
