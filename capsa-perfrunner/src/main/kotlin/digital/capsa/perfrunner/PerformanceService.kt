package digital.capsa.perfrunner

import digital.capsa.perfrunner.domain.ExecutionGroup
import digital.capsa.perfrunner.domain.ExecutionPlan
import digital.capsa.perfrunner.domain.Plan
import digital.capsa.perfrunner.domain.Report
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Service
import java.util.function.Function

@Service
open class PerformanceService {

    @Bean
    open fun executePlan(): Function<Plan, Report> {
        return Function { plan ->
            val execPlan = ExecutionPlan("Plan1")
            val group = ExecutionGroup(
                "Group1",
                plan.group.request,
                plan.group.targetConcurrency,
                plan.group.rampUpTime,
                plan.group.rampUpStepCount,
                plan.group.holdTargetRateTime,
                plan.group.assertionResponseCode
            )
            execPlan.addExecutionGroup(group)
            val jMeterSummariser: JMeterSummariser = JMeterRunner.exec(execPlan)
            return@Function Report(
                jMeterSummariser.getSummary(),
                jMeterSummariser.getNumSamples(),
                jMeterSummariser.getErrorCount()
            )
        }
    }

}