import { NgModule }      from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppComponent }  from './app.component';
import { SignUpComponent } from './Registration/app.signup';
import { FormsModule } from '@angular/forms'
import { HttpClientModule } from '@angular/common/http';

@NgModule({
    imports: [
        BrowserModule,FormsModule,HttpClientModule
        
    ],
    declarations: [
        AppComponent,SignUpComponent
		],
    providers: [ ],
    bootstrap: [AppComponent]
})

export class AppModule { }