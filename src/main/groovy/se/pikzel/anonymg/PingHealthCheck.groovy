package se.pikzel.anonymg

import com.codahale.metrics.health.HealthCheck

class PingHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy()
    }
}
