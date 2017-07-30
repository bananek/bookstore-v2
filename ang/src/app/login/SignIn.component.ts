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
import { User } from '../login/User';


@Component({
  selector: 'app-login',
  templateUrl: './SignIn.component.html',
})
export class SignInComponent implements OnInit {

  afacebook  = 'facebook';
  agoogle = 'google';

  user: User[];

  step = 0;

  logged: any;
  loggedUser: any;




  constructor(private signinService: SignInService, private route: ActivatedRoute) { }


  ngOnInit(){
    if (localStorage.getItem("token") === null) {
      this.logged = 0;
    }
    else
    {
      this.logged = localStorage.getItem("token");
      this.loggedUser = localStorage.getItem("name");
    }


  }


  auth(provider: String) {
    this.signinService.authenticate(provider);
  }

  auth2(provider: String) {
    window.location.href = 'http://localhost:9000/authenticate/' + provider;
  }

  getLoggedUser() {
    console.log('getting logged user');
    this.signinService.getLoggedUser().subscribe(data => this.user = data);
    this.step = 1;
  }

  signOut() {
    this.signinService.signOut();
    localStorage.removeItem("token");
    localStorage.removeItem("name");
  }

}
