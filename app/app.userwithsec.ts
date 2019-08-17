import { User } from "./app.user";
import { SecurityAns } from "./app.security";

export class UserWithSec{

    user:User;
    security:SecurityAns;

    constructor(user:User,security:SecurityAns){

        this.user=user;
        this.security=security;
    }

}