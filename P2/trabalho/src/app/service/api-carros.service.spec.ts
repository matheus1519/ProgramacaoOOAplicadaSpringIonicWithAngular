import { TestBed } from '@angular/core/testing';

import { ApiCarrosService } from './api-carros.service';

describe('ApiCarrosService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: ApiCarrosService = TestBed.get(ApiCarrosService);
    expect(service).toBeTruthy();
  });
});
