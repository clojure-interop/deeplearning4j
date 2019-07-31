(ns org.datavec.perf.timing.TimingStatistics
  "The timing statistics for a data pipeline including:
 ndarray creation time in nanoseconds
 disk reading time in nanoseconds
 bandwidth used in host to device in nano seconds
 bandwidth device to host in nanoseconds"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.perf.timing TimingStatistics]))

(defn ->timing-statistics
  "Constructor."
  (^TimingStatistics []
    (new TimingStatistics )))

(defn add
  "Accumulate the given statistics

  timing-statistics - the statistics to add - `org.datavec.perf.timing.TimingStatistics`

  returns: the added statistics - `org.datavec.perf.timing.TimingStatistics`"
  (^org.datavec.perf.timing.TimingStatistics [^TimingStatistics this ^org.datavec.perf.timing.TimingStatistics timing-statistics]
    (-> this (.add timing-statistics))))

(defn average
  "Average the results relative to the number of n.
  This method is meant to be used alongside
  add(TimingStatistics)
  accumulated a number of times

  n - n the number of elements - `long`

  returns: the averaged results - `org.datavec.perf.timing.TimingStatistics`"
  (^org.datavec.perf.timing.TimingStatistics [^TimingStatistics this ^Long n]
    (-> this (.average n))))

