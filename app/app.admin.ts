export class Admin{

    firstName:string="";
    lastName:string="";
    emailid:string="";
    password:string="";
    photo:string="";
    //firstSecurityQuestion:string="";
    //secondSecurityQuestion:string="";

    constructor(firstName:string,lastName:string,emailId:string,password:string){
        //,firstSecurityQuestion:string,
        //secondSecurityQuestion:string
        this.firstName=firstName;
        this.lastName=lastName;
        this.emailid=emailId;
        this.password=password;
        //this.firstSecurityQuestion=firstSecurityQuestion;
        //this.secondSecurityQuestion=secondSecurityQuestion;
    }

}