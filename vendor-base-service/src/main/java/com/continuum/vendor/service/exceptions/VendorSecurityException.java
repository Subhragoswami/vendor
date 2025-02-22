package com.continuum.vendor.service.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class VendorSecurityException extends RuntimeException {
    private final String errorCode;
    private final String errorMessage;
}
