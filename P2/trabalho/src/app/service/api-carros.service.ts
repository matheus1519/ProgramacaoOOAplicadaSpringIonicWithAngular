import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders, HttpErrorResponse } from '@angular/common/http';
import { Carro } from '../models/carros';
import { Observable, throwError } from 'rxjs';
import { retry, catchError } from 'rxjs/operators';

@Injectable({
 providedIn: 'root'
})

export class ApiCarrosService {

  baseUrl = 'http://localhost:3000/carros';

  constructor(private http: HttpClient) { }

  httpOptions = {
    headers: new HttpHeaders({
    'Content-Type': 'application/json'
    })
  }

  handleError(error: HttpErrorResponse) {
    if (error.error instanceof ErrorEvent) {
      console.error('An error occurred:', error.error.message);
    } else {
      console.error(
        `Backend returned code ${error.status}, ` +
        `body was: ${error.error}`);
    }

    return throwError('Something bad happened; please try again later.');
  };

  getAll(): Observable<Carro> {
    return this.http
      .get<Carro>(this.baseUrl)
      .pipe(
        retry(2),
        catchError(this.handleError)
      )
  }

  get(id): Observable<Carro> {
    return this.http
    .get<Carro>(this.baseUrl + '/' + id)
    .pipe(
    retry(2),
    catchError(this.handleError)
    )
  }

  create(item): Observable<Carro> {
    return this.http
    .post<Carro>(this.baseUrl, JSON.stringify(item), this.httpOptions)
    .pipe(
    retry(2),
    catchError(this.handleError)
    )
  }

  update(id, item): Observable<Carro> {
    return this.http
    .put<Carro>(this.baseUrl + '/' + id, JSON.stringify(item), this.httpOptions)
    .pipe(
    retry(2),
    catchError(this.handleError)
    )
  }

  delete(id) {
    return this.http
    .delete<Carro>(this.baseUrl + '/' + id, this.httpOptions)
    .pipe(
    retry(2),
    catchError(this.handleError)
    )
  }
}