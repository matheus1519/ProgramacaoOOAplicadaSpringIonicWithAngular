import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { FormCarrosPage } from './form-carros.page';

describe('FormCarrosPage', () => {
  let component: FormCarrosPage;
  let fixture: ComponentFixture<FormCarrosPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ FormCarrosPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(FormCarrosPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
