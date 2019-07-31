(ns org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter
  "A counter function for doing analysis on Categorical columns, on Spark"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.analysis.counter CategoricalAnalysisCounter]))

(defn ->categorical-analysis-counter
  "Constructor."
  (^CategoricalAnalysisCounter []
    (new CategoricalAnalysisCounter )))

(defn add
  "writable - `org.datavec.api.writable.Writable`

  returns: `org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter [^CategoricalAnalysisCounter this ^org.datavec.api.writable.Writable writable]
    (-> this (.add writable))))

(defn merge
  "other - `org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter`

  returns: `org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter`"
  (^org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter [^CategoricalAnalysisCounter this ^org.datavec.api.transform.analysis.counter.CategoricalAnalysisCounter other]
    (-> this (.merge other))))

