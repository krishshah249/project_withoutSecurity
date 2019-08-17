import { Component } from '@angular/core'
import { RegistrationServiceComponent } from '../RegistrationService/com.registrationservice';
import { UserWithSec } from '../app.userwithsec';
import { MerchantWithSec } from '../app.merchantwithsec';
import { AdminWithSec } from '../app.adminwithsec';
import { User } from '../app.user';
import { SecurityAns } from '../app.security';
import { Merchant } from '../app.MERCHANT';
import { Admin } from '../app.ADMIN';

@Component({

    selector: 'sign-up',
    templateUrl: 'app.SignUp.html'
})

export class SignUpComponent {

    firstName: string = "";
    lastName: string = "";
    mobileNo: number;
    address: string = "";
    emailId: string = "";
    password: string = "";
    confirmPass: string = "";
    category: string = "";
    company: string = "";
    firstSecurityQuestion:string="";
    secondSecurityQuestion:string="";

    constructor(private service: RegistrationServiceComponent) { }

    checkPass() {

        //console.log(this.password+"  "+this.confirmPass)
        //this.password.localeCompare(this.confirmPass)
        console.log(this.emailId)
        if (this.password == this.confirmPass)
            this.addAccount();
        else {
            this.password = "";
            this.confirmPass = "";
            alert("Password Does Not Match. Please Re-Enter them");
        }
    }


    addAccount(): any {

        if (this.category == "User") {
            this.service.addUser(new UserWithSec(
                new User(this.firstName, this.lastName, this.mobileNo,
                this.address, this.emailId, this.confirmPass),
                new SecurityAns(this.emailId, this.firstSecurityQuestion,
                    this.secondSecurityQuestion))).subscribe(data=> alert(data.message))
        }

        if (this.category == "Merchant") {
            this.service.addMerchant(new MerchantWithSec(
                new Merchant(this.firstName, this.lastName, this.company,this.mobileNo,
                this.emailId, this.confirmPass),
                new SecurityAns(this.emailId, this.firstSecurityQuestion,
                    this.secondSecurityQuestion))).subscribe(data=> alert(data.message))
                }
        if (this.category == "Admin") {
            this.service.addAdmin(new AdminWithSec(
                new Admin(this.firstName, this.lastName, this.emailId, this.confirmPass),
                new SecurityAns(this.emailId, this.firstSecurityQuestion,
                    this.secondSecurityQuestion))).subscribe(data=> alert(data.message))
        }

    }


}