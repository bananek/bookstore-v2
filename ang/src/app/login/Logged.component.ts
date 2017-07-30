/**
 * Created by BanaN on 7/4/2017.
 */
/**
 * Created by BanaN on 6/19/2017.
 */
import { Component, OnInit } from '@angular/core';
import {SignInService} from './SignIn.service';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute} from '@angular/router';
import {RegisteredUser} from '../login/RegisteredUser';
import {User} from './User';

import {Http, Headers, RequestOptions, URLSearchParams} from '@angular/http';


@Component({
  selector: 'app-login',
  templateUrl: './Logged.component.html',
})

export class LoggedComponent implements OnInit {

  user: User;
  ruser: RegisteredUser[];
  auth: any;
  name: string;

  constructor(private signinService: SignInService, private route: ActivatedRoute) { }

  ngOnInit() {
    console.log('getting logged user');


    this.route
      .queryParams
      .subscribe(params => {
        this.auth = params['auth'];})

    this.signinService.one(this.auth).subscribe(
      user => this.user = user,
      err => {
        console.log(err); },
      () => {
        localStorage.setItem("token", this.auth);
        this.name = this.user.firstName;
        localStorage.setItem("name", this.name);
      }
        );


  }

}

