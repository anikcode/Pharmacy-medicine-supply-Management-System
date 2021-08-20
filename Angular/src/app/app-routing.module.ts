import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AuthGuard } from './auth.guard';
import { ErrorComponent } from './error/error.component';
import { LoginComponent } from './login/login.component';
import { LogoutComponent } from './logout/logout.component';
import { MedicineStockComponent } from './medicine-stock/medicine-stock.component';
import { OfferComponent } from './offer/offer.component';
import { repSchedule, RepScheduleComponent } from './rep-schedule/rep-schedule.component';
import { SupplyComponent } from './supply/supply.component';
import { WelcomeComponent } from './welcome/welcome.component';

const routes: Routes = [
  {path:'login', component: LoginComponent},
  {path:'welcome', component: WelcomeComponent},
  {path:'offer', component: OfferComponent, canActivate:[AuthGuard]},
  {path:'logout', component: LogoutComponent, canActivate:[AuthGuard]},
  {path:'stocks', component: MedicineStockComponent, canActivate:[AuthGuard]},
  {path:'view-schedule', component: RepScheduleComponent, canActivate:[AuthGuard]},
  {path:'supply', component: SupplyComponent, canActivate:[AuthGuard]},
  {path:'**', component: ErrorComponent}
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
