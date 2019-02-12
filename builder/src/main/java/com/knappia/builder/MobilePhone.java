package com.knappia.builder;

public final class MobilePhone {
    private final OperationSystem operationSystem;
    private final String processor;
    private final String ram;
    private final Integer screenSize;
    private final MemorySizeType memory;
    private final Integer battery;
    private final CameraType cameraType;

    private MobilePhone(MobilePhoneBuilder builder) {
        this.operationSystem = builder.operationSystem;
        this.processor = builder.processor;
        this.ram = builder.ram;
        this.screenSize = builder.screenSize;
        this.memory = builder.memory;
        this.battery = builder.battery;
        this.cameraType = builder.cameraType;
    }

    public OperationSystem getOperationSystem() {
        return operationSystem;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public Integer getScreenSize() {
        return screenSize;
    }

    public MemorySizeType getMemory() {
        return memory;
    }

    public Integer getBattery() {
        return battery;
    }

    public CameraType getCameraType() {
        return cameraType;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("MobilePhone: {\n");
        sb.append("\tOS: ");
        sb.append(operationSystem);
        sb.append("\n");

        sb.append("\tProcessor: ");
        sb.append(processor);
        sb.append("\n");

        if (ram != null) {
            sb.append("\tRAM: ");
            sb.append(ram);
            sb.append("\n");
        }

        if (screenSize != null) {
            sb.append("\tRAM: ");
            sb.append(screenSize);
            sb.append("\n");
        }

        if (memory != null) {
            sb.append("\tMemory: ");
            sb.append(memory);
            sb.append("GB");
            sb.append("\n");
        }

        if (battery != null) {
            sb.append("\tBattery: ");
            sb.append(battery);
            sb.append("mAh");
            sb.append("\n");
        }

        if (cameraType != null) {
            sb.append("\tCamera: ");
            sb.append(cameraType);
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }

    public static class MobilePhoneBuilder {
        private final OperationSystem operationSystem;
        private final String processor;
        private String ram;
        private Integer screenSize;
        private MemorySizeType memory;
        private Integer battery;
        private CameraType cameraType;

        public MobilePhoneBuilder(OperationSystem operationSystem, String processor) {
            if (operationSystem == null || processor == null) {
                throw new IllegalArgumentException("OperationSystem and processor must be not null");
            }
            this.operationSystem = operationSystem;
            this.processor = processor;
        }

        public MobilePhoneBuilder withRam(String ram) {
            this.ram = ram;
            return this;
        }

        public MobilePhoneBuilder withScreenSize(Integer screenSize) {
            this.screenSize = screenSize;
            return this;
        }

        public MobilePhoneBuilder withMemory(MemorySizeType memory) {
            this.memory = memory;
            return this;
        }

        public MobilePhoneBuilder withBattery(Integer battery) {
            this.battery = battery;
            return this;
        }

        public MobilePhoneBuilder withCameraType(CameraType cameraType) {
            this.cameraType = cameraType;
            return this;
        }

        public MobilePhone build() {
            return new MobilePhone(this);
        }
    }
}
