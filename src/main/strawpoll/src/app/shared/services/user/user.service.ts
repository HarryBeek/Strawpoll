import { Injectable } from '@angular/core';
import { User } from '../../models/User';
import { USERS } from '../../mocks/mock-users';
import { Observable, of } from 'rxjs';
import { MessageService } from '../message/message.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private messageService: MessageService) { }

  getUsers(): Observable<User[]> {
    // TODO: send the message _after_ fetching the users
    this.messageService.add('userService: fetched users');
    return of(USERS);
  }
}
