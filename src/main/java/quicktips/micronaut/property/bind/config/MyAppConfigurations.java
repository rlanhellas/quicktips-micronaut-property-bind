package quicktips.micronaut.property.bind.config;

import java.time.LocalDate;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.core.convert.format.Format;

@ConfigurationProperties("myapp")
public class MyAppConfigurations {

    private ThreadConfig thread;
    private int maxUsers;
    private ScheduleConfig schedule;

    public ThreadConfig getThread() {
        return thread;
    }

    public void setThread(ThreadConfig thread) {
        this.thread = thread;
    }

    public int getMaxUsers() {
        return maxUsers;
    }

    public void setMaxUsers(int maxUsers) {
        this.maxUsers = maxUsers;
    }

    public ScheduleConfig getSchedule() {
        return schedule;
    }

    public void setSchedule(ScheduleConfig schedule) {
        this.schedule = schedule;
    }    

    @Override
    public String toString() {
        return "MyAppConfigurations [maxUsers=" + maxUsers + ", schedule=" + schedule + ", thread=" + thread + "]";
    }

    @ConfigurationProperties("thread")
    public static class ThreadConfig {
        private int min;
        private int max;

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getMax() {
            return max;
        }

        public void setMax(int max) {
            this.max = max;
        }

        @Override
        public String toString() {
            return "ThreadConfig [max=" + max + ", min=" + min + "]";
        }       

    }

    @ConfigurationProperties("schedule")
    public static class ScheduleConfig {
        private LocalDate maxDate;
        private LocalDate minDate;

        public LocalDate getMaxDate() {
            return maxDate;
        }
        public void setMaxDate(@Format("yyyy-MM-dd") LocalDate maxDate) {
            this.maxDate = maxDate;
        }
        public LocalDate getMinDate() {
            return minDate;
        }
        public void setMinDate(@Format("yyyy-MM-dd") LocalDate minDate) {
            this.minDate = minDate;
        }
        @Override
        public String toString() {
            return "ScheduleConfig [maxDate=" + maxDate + ", minDate=" + minDate + "]";
        }       
    }
}
