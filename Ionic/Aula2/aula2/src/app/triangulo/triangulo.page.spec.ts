import { async, ComponentFixture, TestBed } from '@angular/core/testing';
import { IonicModule } from '@ionic/angular';

import { TrianguloPage } from './triangulo.page';

describe('TrianguloPage', () => {
  let component: TrianguloPage;
  let fixture: ComponentFixture<TrianguloPage>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TrianguloPage ],
      imports: [IonicModule.forRoot()]
    }).compileComponents();

    fixture = TestBed.createComponent(TrianguloPage);
    component = fixture.componentInstance;
    fixture.detectChanges();
  }));

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
