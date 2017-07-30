/**
 * Created by BanaN on 7/4/2017.
 */
/**
 * Created by BanaN on 6/19/2017.
 */
import { Injectable } from '@angular/core';
import {Http, Headers, RequestOptions, URLSearchParams} from '@angular/http';
import 'rxjs/add/operator/map';
import { RegisteredUser } from './RegisteredUser';
import { User } from './User';

@Injectable()
export class SignInService {


  constructor(private http: Http) {
  }


  authenticate(provider: String) {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});
    this.http.post('http://localhost:9000/authenticate/' + provider, options)
      .subscribe(
        data => console.log('remove from cart', data),
        error => console.error('error', error)
      );
  }

  registereduser() {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/registereduser', options)
      .map(response => <RegisteredUser[]>response.json());
  }

  user(userId: string) {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/user' + userId, options)
      .map(response => <RegisteredUser[]>response.json());
  }

  signOut() {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/logout', options)
      .map(response => <RegisteredUser[]>response.json());
  }

  getLoggedUser() {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/getLoggedUser', options)
      .map(response => <User[]>response.json());

  }

  one(id: String) {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/user/' + id , options)
      .map(response => <User>response.json());

  }


  u() {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});

    return this.http.get('http://localhost:9000/u', options)
      .map(response => <RegisteredUser[]>response.json());
  }


  delete(id: number) {
    const headers: Headers = new Headers();
    headers.append('Accept', 'application/json');
    headers.append('Content-Type', 'application/json');

    const options = new RequestOptions({headers: headers});
    this.http.get('http://localhost:9000/removeuser/' + id, options)
      .subscribe(
        data => console.log('remove product', data),
        error => console.error('error while removing user', error)
      );
  }

}
