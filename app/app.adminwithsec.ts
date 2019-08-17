import { SecurityAns } from "./app.security";
import { Admin } from "./app.admin";

export class AdminWithSec{

    admin:Admin;
    security:SecurityAns;

    constructor(admin:Admin,security:SecurityAns){

        this.admin=admin;
        this.security=security;
    }

}