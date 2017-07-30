/**
 * Created by BanaN on 7/5/2017.
 */
import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, Validators} from '@angular/forms';
import {ActivatedRoute} from '@angular/router';
import {SignInService} from '../login/SignIn.service';
import {RegisteredUser} from '../login/RegisteredUser';

@Component({
  selector: 'app-panel',
  templateUrl: './auser.component.html',
})
export class AUserComponent implements OnInit {

  users: RegisteredUser[];


  constructor(private signinService: SignInService, private route: ActivatedRoute) { }

  ngOnInit() {
    this.signinService.registereduser().subscribe(data => this.users = data);
    console.log(this.route.snapshot.params);
    }

    byid(userId: string) {
      this.signinService.user(userId);
    }

    delete(user:RegisteredUser) {
      this.signinService.delete(user.id)
    }

  }
