package com.knappia.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Application {
    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone.MobilePhoneBuilder(OperationSystem.ANDROID, "Qualcomm")
                .withBattery(800)
                .withCameraType(CameraType.MEDIUM_DEFINITION)
                .withRam("3GB")
                .withMemory(MemorySizeType.LARGE)
                .build();
        log.info(mobile.toString());

        MobilePhone iphone = new MobilePhone.MobilePhoneBuilder(OperationSystem.IOS, "A11 bionic")
                .withBattery(3100)
                .withCameraType(CameraType.HIGH_DIFINITION)
                .withRam("8GB")
                .withMemory(MemorySizeType.LARGE)
                .build();
        log.info(iphone.toString());
    }
}
