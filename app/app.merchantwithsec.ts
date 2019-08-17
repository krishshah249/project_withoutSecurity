import { Merchant } from "./app.merchant";
import { SecurityAns } from "./app.security";

export class MerchantWithSec{

    merchant:Merchant;
    security:SecurityAns;

    constructor(merchant:Merchant,security:SecurityAns){

        this.merchant=merchant;
        this.security=security;
    }

}