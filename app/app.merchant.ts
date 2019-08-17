export class Merchant{

    firstName:string="";
    lastName:string="";
    company:string="";
    mobileno:number=0;
    emailid:string="";
    password:string="";
    photo:string="";
    rating:number=0;
    //firstSecurityQuestion:string="";
    //secondSecurityQuestion:string="";

    constructor(firstName:string,lastName:string,company:string,mobileNo:number,emailId:string,password:string){
        //,firstSecurityQuestion:string,
        //secondSecurityQuestion:string
        this.firstName=firstName;
        this.lastName=lastName;
        this.company=company;
        this.mobileno=mobileNo;
        this.emailid=emailId;
        this.password=password;
        //this.firstSecurityQuestion=firstSecurityQuestion;
        //this.secondSecurityQuestion=secondSecurityQuestion;
    }

}