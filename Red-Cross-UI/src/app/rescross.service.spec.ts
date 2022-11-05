import { TestBed } from '@angular/core/testing';

import { RescrossService } from './rescross.service';

describe('RescrossService', () => {
  let service: RescrossService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(RescrossService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
