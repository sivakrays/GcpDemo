package com.example.demo.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OTP{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String otpNumber;
    private Boolean OtpExpiry;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOtpNumber() {
        return otpNumber;
    }

    public void setOtpNumber(String otpNumber) {
        otpNumber = otpNumber;
    }

    public Boolean getOtpExpiry() {
        return OtpExpiry;
    }

    public void setOtpExpiry(Boolean otpExpiry) {
        OtpExpiry = otpExpiry;
    }

    }
