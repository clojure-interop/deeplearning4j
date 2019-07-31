(ns org.deeplearning4j.optimize.listeners.PerformanceListener$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.optimize.listeners PerformanceListener$Builder]))

(defn ->builder
  "Constructor."
  (^PerformanceListener$Builder []
    (new PerformanceListener$Builder )))

(defn report-iteration
  "This method defines, if iteration number should be reported together with other data

  report-iteration - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Boolean report-iteration]
    (-> this (.reportIteration report-iteration))))

(defn report-time
  "This method defines, if time per iteration should be reported together with other data

  report-time - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Boolean report-time]
    (-> this (.reportTime report-time))))

(defn report-etl
  "This method defines, if ETL time per iteration should be reported together with other data

  report-etl - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Boolean report-etl]
    (-> this (.reportETL report-etl))))

(defn report-sample
  "This method defines, if samples/sec should be reported together with other data

  report-sample - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Boolean report-sample]
    (-> this (.reportSample report-sample))))

(defn report-batch
  "This method defines, if batches/sec should be reported together with other data

  report-batch - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Boolean report-batch]
    (-> this (.reportBatch report-batch))))

(defn report-score
  "This method defines, if score should be reported together with other data

  report-score - `boolean`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Boolean report-score]
    (-> this (.reportScore report-score))))

(defn set-frequency
  "Desired TrainingListener activation frequency

  frequency - `int`

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener$Builder`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener$Builder [^PerformanceListener$Builder this ^Integer frequency]
    (-> this (.setFrequency frequency))))

(defn build
  "This method returns configured PerformanceListener instance

  returns: `org.deeplearning4j.optimize.listeners.PerformanceListener`"
  (^org.deeplearning4j.optimize.listeners.PerformanceListener [^PerformanceListener$Builder this]
    (-> this (.build))))

