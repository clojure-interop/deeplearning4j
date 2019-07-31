(ns org.datavec.api.transform.analysis.counter.BytesAnalysisCounter
  "A counter function for doing analysis on BytesWritable columns, on Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter BytesAnalysisCounter]))

(defn ->bytes-analysis-counter
  "Constructor."
  (^BytesAnalysisCounter []
    (new BytesAnalysisCounter )))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.counter.BytesAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.BytesAnalysisCounter [^BytesAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.counter.BytesAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.BytesAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.BytesAnalysisCounter [^BytesAnalysisCounter this ^org.datavec.api.transform.analysis.counter.BytesAnalysisCounter other]
    (-> this (.merge other))))

