package se.pikzel.anonymg.health

import com.codahale.metrics.health.HealthCheck
import static com.codahale.metrics.health.HealthCheck.Result

class PingHealthCheck extends HealthCheck {
    @Override
    protected Result check() throws Exception {
        return Result.healthy()
    }
}
