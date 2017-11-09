class SpaceAge {

    private double seconds;

    private static Long earthSeconds = 31557600L;

    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        return this.seconds/earthSeconds;
    }

    double onMercury() {
        return this.seconds/earthSeconds/0.240846;
    }

    double onVenus() {
        return this.seconds/earthSeconds/0.61519726;
    }

    double onMars() {
        return this.seconds/earthSeconds/1.8808158;
    }

    double onJupiter() {
        return this.seconds/earthSeconds/11.862615;
    }

    double onSaturn() {
        return this.seconds/earthSeconds/29.447498;
    }

    double onUranus() {
        return this.seconds/earthSeconds/84.016846;
    }

    double onNeptune() {
        return this.seconds/earthSeconds/164.79132;
    }

}
