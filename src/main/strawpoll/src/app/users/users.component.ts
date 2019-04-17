import { Component, OnInit } from '@angular/core';
import { User } from '../shared/models/User';
import { USERS } from '../shared/mocks/mock-users'
import { UserService } from '../shared/services/user/user.service';


@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {
  users: User[];
  selectedUser: User;

  constructor(private userService: UserService) { }

  ngOnInit() {
    this.getUsers();
  }

  onSelect(user: User): void {
    this.selectedUser = user;
  }

  getUsers(): void {
    this.userService.getUsers()
        .subscribe(users => this.users = users);
  }
}
