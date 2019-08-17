export class User{

    firstName:string="";
    lastName:string="";
    mobileNo:number=0;
    address:string="";
    emailid:string="";
    password:string="";
    photo:string="";
    //firstSecurityQuestion:string="";
    //secondSecurityQuestion:string="";

    constructor(firstName:string,lastName:string,mobileNo:number,address:string,emailId:string,password:string){
        //,firstSecurityQuestion:string,
        //secondSecurityQuestion:string
        this.firstName=firstName;
        this.lastName=lastName;
        this.mobileNo=mobileNo;
        this.address=address;
        this.emailid=emailId;
        this.password=password;
        //this.firstSecurityQuestion=firstSecurityQuestion;
        //this.secondSecurityQuestion=secondSecurityQuestion;
    }

}